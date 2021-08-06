package aro.lydec.lydec_console.Service;

import aro.lydec.lydec_console.Model.Poste;
import aro.lydec.lydec_console.Repository.PosteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PosteService {

    private final PosteRepository posteRepository;
    @Autowired
    public PosteService(PosteRepository posteRepository) {
        this.posteRepository = posteRepository;
    }

    // lister tous les postes dp
    public List<Poste> getAllPostes(){
        return posteRepository.findAll();
    }

    // Lister tous les postes qui ont une position x et y (gps)
    public List<Poste> getAllPosteWithPos(){
        return posteRepository.findByGpsxIsNot(0);
    }

    // Lister tous les pages qui n'ont pas de position gps
    public Page<Poste> getAllPosteWithoutPos(PageRequest pageable){
        return posteRepository.findByGpsxIs(0, pageable);
    }

    // Search postes par libelle
    public Page<Poste> getAllPosteByLibellleValue(PageRequest pageable, String val){
        return posteRepository.findByLibelleContains(val, pageable);
    }


    // Lister les postes dp par page
    public Page<Poste> getAllPostesByPage(PageRequest pageable){
        return posteRepository.findAll(pageable);
    }

    // Ajouter un nouveau poste
    public void addNewPoste(Poste poste) {
        Optional<Poste> posteOptional = posteRepository.findPosteByLibelle(poste.getLibelle());
        if(posteOptional.isPresent()){
            throw new IllegalStateException("ce poste existe déja");
        }else{
            posteRepository.save(poste);
        }
    }

    // Supprimer un poste par son Id
    public void deletePoste(int id) {
        if(!posteRepository.existsById(id)){ throw new IllegalStateException("ce poste n'existe pas"); }
        else{
            posteRepository.deleteById(id);
        }
    }

    // Modifier un poste
    /*public void updatePoste(Poste poste){
        if(!posteRepository.existsById(id)){ throw new IllegalStateException("ce poste n'existe pas"); }
        else{

        }
    }*/

    //  Lister les differents délegation
    public List<Integer> getAllDeleg(){
        return posteRepository.findRef_dlg();
    }

    // Lister les postes groupés par délegation
    public List<Poste> getAllPosteByDeleg(int refdeleg){
        return posteRepository.findPostesByRef_dlg(refdeleg);
    }


}
