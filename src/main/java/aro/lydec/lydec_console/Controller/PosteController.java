package aro.lydec.lydec_console.Controller;

import aro.lydec.lydec_console.Model.Poste;
import aro.lydec.lydec_console.Service.PosteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 *  API DES POSTES DP
 *  ACCES : http://localhost:8080/postes/...
 */

@RestController
@RequestMapping(path = "/postes")
public class PosteController {

    // appeler le service
    private final PosteService posteService;

    // injection des dependences
    @Autowired
    public PosteController(PosteService posteService) {
        this.posteService = posteService;
    }

    @GetMapping("/all")
    public List<Poste> postes(){
        return posteService.getAllPostes();
    }

    @GetMapping("/allNotNull")
    public List<Poste> postesWithPos(){
        return posteService.getAllPosteWithPos();
    }

    // retourne les postes par page de size 10 et sort ascendant -- avec choix (default : id)
    @GetMapping("/allByPage")
    public Page<Poste> postesByPage(@RequestParam Optional<Integer> page,
                                    @RequestParam Optional<String> sortBy){
        return posteService.getAllPostesByPage(PageRequest.of(page.orElse(0), 10, Sort.Direction.ASC, sortBy.orElse("id")));
    }

    // retourne les postes par page de size 10 et sort descendant -- avec choix (default : id)
    @GetMapping("/allByPageDesc")
    public Page<Poste> postesByPageDesc(@RequestParam Optional<Integer> page,
                                        @RequestParam Optional<String> sortBy){
        return posteService.getAllPostesByPage(PageRequest.of(page.orElse(0), 10, Sort.Direction.DESC, sortBy.orElse("id")));
    }

    // les postes qui n'ont pas de position
    @GetMapping("/allWithoutPos")
    public Page<Poste> postesWithoutPos(@RequestParam Optional<Integer> page,
                                        @RequestParam Optional<String> sortBy){
        return posteService.getAllPosteWithoutPos(PageRequest.of(page.orElse(0), 10, Sort.Direction.DESC, sortBy.orElse("id")));
    }

    // chercher par libelle
    @GetMapping("/search")
    public Page<Poste> postesSearchByLibelle(@RequestParam String libelle,
                                             @RequestParam Optional<Integer> page,
                                             @RequestParam Optional<String> sortBy){
        return posteService.getAllPosteByLibellleValue(PageRequest.of(page.orElse(0), 10, Sort.Direction.ASC, sortBy.orElse("libelle")),
                libelle.toUpperCase());
    }

    // Ajouter Poste
    @PostMapping(path = "/add")
    public void addPoste(@RequestBody Poste poste){
        posteService.addNewPoste(poste);
    }

    // Supprimer un poste
    @DeleteMapping(path = "/delete")
    public void deletePoste(@RequestParam int id){
        posteService.deletePoste(id);
    }

    // lister les diff deleg
    @GetMapping("/delegations")
    public List<Integer> getAllDeleg(){
        return posteService.getAllDeleg();
    }

    // lister les postes by deleg  ( ?deleg=...)
    @GetMapping("/posteByDelegation")
    public List<Poste> getAllPosteByDeleg(@RequestParam int deleg){
        return posteService.getAllPosteByDeleg(deleg);
    }

    @GetMapping("/countByDeleg")
    public List<Object> getNbrPostesClientsByDeleg(){ return posteService.getNbrPostesClientsByDeleg();}

}
