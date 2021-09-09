package aro.lydec.lydec_console.Repository;

import aro.lydec.lydec_console.Model.Poste;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PosteRepository extends JpaRepository <Poste,Integer> {

    // SQL QUERY
    public static final String FIND_DELEG = "SELECT DISTINCT p.ref_dlg FROM poste p where p.x_gps<>0";
    public static final String FIND_POSTE_DELEG = "SELECT * FROM poste WHERE ref_dlg=? AND x_gps<>0";
    public static final String FIND_NBR_CLIENTS_POSTES_BY_DELEG = "select ref_dlg, count(*), sum(nb_clients) from poste group by ref_dlg";

    List<Poste> findByGpsxIsNot(float x);

    Page<Poste> findByGpsxIs(float x, Pageable pageable);

    Page<Poste> findByLibelleContains(String val, Pageable pageable);

    Optional<Poste> findPosteByLibelle(String libelle);

    @Query(value = FIND_DELEG, nativeQuery = true)
    List<Integer> findRef_dlg();

    @Query(value = FIND_POSTE_DELEG, nativeQuery = true)
    List<Poste> findPostesByRef_dlg(int refdeleg);

    @Query(value = FIND_NBR_CLIENTS_POSTES_BY_DELEG, nativeQuery = true)
    List<Object> findNbrPostesClientsByDeleg();

}
