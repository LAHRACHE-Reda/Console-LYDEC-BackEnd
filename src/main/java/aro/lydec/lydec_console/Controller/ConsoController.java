package aro.lydec.lydec_console.Controller;


import aro.lydec.lydec_console.Model.Poste;
import aro.lydec.lydec_console.Service.ConsoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/conso")
public class ConsoController {

    private final ConsoService consoService;

    @Autowired
    public ConsoController(ConsoService consoService) {
        this.consoService = consoService;
    }

    @GetMapping("/rendement")
    public List<Float> getRendementByDate(@RequestParam int dateDeb,
                                                 @RequestParam int dateFin,
                                                 @RequestParam int idPoste){

        return consoService.getRendementByDate(dateDeb,dateFin,idPoste);
    }

    @GetMapping("/poste")
    public List<Float> getConsoPosteByDate(@RequestParam int dateDeb,
                                                 @RequestParam int dateFin,
                                                 @RequestParam int idPoste){
        return consoService.getConsoPosteByDate(dateDeb,dateFin,idPoste);
    }

    @GetMapping("/clients")
    public List<Float> getConsoClientByDate(@RequestParam int dateDeb,
                                                   @RequestParam int dateFin,
                                                   @RequestParam int idPoste){
        return consoService.getConsoClientByDate(dateDeb,dateFin,idPoste);
    }

    @GetMapping("/dernier_conso")
    public float getDernierConsoPostes(){
        return consoService.getDernierConsoPostes();
    }

    @GetMapping("/zones_sensibles")
    public List<Poste> getPostesSensibles(){ return consoService.getPostesSensibles();}

    @GetMapping("/conso_deleg")
    public List<Float> getAllConsoPosteByDelegDate(@RequestParam int deleg,
                                                   @RequestParam int date){
        return consoService.getAllConsoPosteByDelegDate(deleg,date);
    }

}
