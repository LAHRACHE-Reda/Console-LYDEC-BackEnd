package aro.lydec.lydec_console.Service;


import aro.lydec.lydec_console.Model.Poste;
import aro.lydec.lydec_console.Repository.ConsoPlRepository;
import aro.lydec.lydec_console.Repository.ConsoPosteRepository;
import aro.lydec.lydec_console.Repository.PosteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ConsoService {

    private final ConsoPosteRepository consoPosteRepository;
    private final ConsoPlRepository consoPlRepository;
    private final PosteRepository posteRepository;

    @Autowired
    public ConsoService(ConsoPosteRepository consoPosteRepository, ConsoPlRepository consoPlRepository, PosteRepository posteRepository){
        this.consoPosteRepository = consoPosteRepository;
        this.consoPlRepository = consoPlRepository;
        this.posteRepository = posteRepository;
    }


    // Liste des consommations du poste dans une période
    public List<Float> getConsoPosteByDate(int dateDeb, int dateFin, int idPoste){
        return consoPosteRepository.findConsoPostesByDate(dateDeb,dateFin,idPoste);
    }

    // Liste des consommations des clients dans une période pour un poste donné
    public List<Float> getConsoClientByDate(int dateDeb, int dateFin, int idPoste){
        return consoPlRepository.findConsoClientByDate(dateDeb, dateFin, idPoste);
    }

    // Liste des consommations du poste dans une période
    public List<Float> getRendementByDate(int dateDeb, int dateFin, int idPoste){
        List<Float> consoPoste = consoPosteRepository.findConsoPostesByDate(dateDeb,dateFin,idPoste);
        List<Float> consoClient = consoPlRepository.findConsoClientByDate(dateDeb, dateFin, idPoste);
        List<Float> rendements = new ArrayList<Float>();
        for(int i=0; i<consoClient.size(); i++){
            float rendement = (consoClient.get(i)/consoPoste.get(i))*100;
            rendements.add(rendement);
        }
        return rendements;
    }

    // La dernière consommation enregistrer dans la BD pour tous les postes
    public float getDernierConsoPostes(){
        return consoPosteRepository.findDernierConsoPostes();
    }

    // Lister les postes dans la zone sensible pour le dernier mois de consommation
    public List<Poste> getPostesSensibles(){
        List<Poste> postesSensibles = new ArrayList<Poste>();
        List<Poste> allPostes = posteRepository.findAll();
        int dernierDate = consoPlRepository.getDernierDate();
        for(Poste poste : allPostes){
            if(getRendementByDate(dernierDate,dernierDate,poste.getId_poste()).size()>0){
                float rendementPoste = getRendementByDate(dernierDate,dernierDate,poste.getId_poste()).get(0);
                if(rendementPoste<94 || rendementPoste>97){
                    poste.setRendement(rendementPoste);
                    postesSensibles.add(poste);
                }
            }
        }
        return postesSensibles;
    }

    // Lister la consommation d'un mois donnée pour tous les postes d'une délegation donnée
    public List<Float> getAllConsoPosteByDelegDate(int deleg, int date){
        return consoPosteRepository.findAllConsoPosteByDelegDate(deleg,date);
    }

}
