package aro.lydec.lydec_console.Repository;


import aro.lydec.lydec_console.Model.conso_poste_dly;
import aro.lydec.lydec_console.Common.conso_poste_dly_ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsoPosteRepository extends JpaRepository<conso_poste_dly, conso_poste_dly_ID> {


    // SQL QUERY
    public static final String CONSO_POSTE_BY_DATE = "select sum(rlv_conso) from conso_poste_dly where extract(YEAR_MONTH FROM rlv_ndate) >= ? AND extract(YEAR_MONTH FROM rlv_ndate) <= ? And id_poste=? group by extract(YEAR_MONTH FROM rlv_ndate) order by extract(YEAR_MONTH FROM rlv_ndate) ASC";
    public static final String ALL_POSTE_DATE = "select distinct EXTRACT(YEAR_MONTH FROM rlv_ndate) as AllDate from conso_poste_dly order by rlv_ndate";
    public static final String DERNIER_CONSO_POSTE = "select sum(rlv_conso) from conso_poste_dly where rlv_ndate=(SELECT rlv_ndate FROM conso_poste_dly ORDER BY rlv_ndate DESC LIMIT 0 , 1)";
    public static final String DERNIER_MOIS_CONSO_POSTE = "select sum(rlv_conso) from conso_poste_dly where rlv_ndate= (SELECT annee_cons*100+mois_cons as date FROM  conso_pl_poste where type_ouvrage='P' and rlv_cons <> 0 ORDER BY date DESC LIMIT 0 , 1)";
    public static final String CONSO_ALL_POSTES_BY_DELEG_DATE = "select sum(rlv_conso) from conso_poste_dly where id_poste IN (select id_poste from poste where ref_dlg = ?) and extract(YEAR_MONTH FROM rlv_ndate) = ? group by rlv_ndate";

    @Query(value = CONSO_POSTE_BY_DATE, nativeQuery = true)
    List<Float> findConsoPostesByDate(int dateDeb, int dateFin, int idPoste);

    @Query(value = DERNIER_CONSO_POSTE, nativeQuery = true)
    float findDernierConsoPostes();

    @Query(value = CONSO_ALL_POSTES_BY_DELEG_DATE, nativeQuery = true)
    List<Float> findAllConsoPosteByDelegDate(int deleg, int date);

}
