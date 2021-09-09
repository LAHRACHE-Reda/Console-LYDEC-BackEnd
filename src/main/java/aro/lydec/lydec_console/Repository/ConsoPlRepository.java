package aro.lydec.lydec_console.Repository;


import aro.lydec.lydec_console.Model.conso_pl_poste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsoPlRepository extends JpaRepository<conso_pl_poste,Integer> {


    // SQL QUERY
    public static final String CONSO_CLIENT_BY_DATE = "select sum(rlv_cons) from conso_pl_poste where (annee_cons*100+mois_cons BETWEEN ?1 AND ?2) and id_ouvrage = ?3 and type_ouvrage='P' group by annee_cons*100+mois_cons order by annee_cons*100+mois_cons";
    public static final String DERNIER_MOIS_CONSO_CLIENTS = "select sum(rlv_cons) from conso_pl_poste where annee_cons*100+mois_cons = (SELECT annee_cons*100+mois_cons as date FROM conso_pl_poste where type_ouvrage='P' and rlv_cons <> 0 ORDER BY date DESC LIMIT 0 , 1) and type_ouvrage='P'";
    public static final String DERNIER_DATE_CONSO_CLIENT = "select annee_cons*100+mois_cons from conso_pl_poste ORDER BY annee_cons*100+mois_cons DESC LIMIT 0 , 1";

    @Query(value = CONSO_CLIENT_BY_DATE, nativeQuery = true)
    List<Float> findConsoClientByDate(int dateDeb, int dateFin, int idPoste);

    @Query(value = DERNIER_MOIS_CONSO_CLIENTS, nativeQuery = true)
    float findDernierConsoClients();

    @Query(value = DERNIER_DATE_CONSO_CLIENT, nativeQuery = true)
    Integer getDernierDate();

}
