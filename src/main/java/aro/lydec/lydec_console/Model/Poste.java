package aro.lydec.lydec_console.Model;

import javax.persistence.*;

/***
 *  La table de tous les postes dp
 *  -- base de données = 'informix'.datamart_dim_poste_dp   ?? mysql = Lydec_dp.poste
 */

@Entity
@Table
public class Poste {
    @Id
    @GeneratedValue
    @Column(name="id_poste")
    private int id;
    private String libelle;
    private String type_poste;
    private int loc_id;
    private int code_point;
    private String gsm;
    private int id_sig;
    private String id_prao;
    private float x;
    private float y;
    @Column(name="x_gps")
    private float gpsx;
    @Column(name="y_gps")
    private float gpsy;
    @Column(name="nb_clients")
    private int nbclients;
    private float rendement;
    private int conso_clients;
    private int conso_poste;
    private int date_rlv;
    private int indice_rend;
    private int ref_dlg;
    private String fiabilise;

    public Poste() {
    }

    public Poste(int id_poste, String libelle, String type_poste, int loc_id,
                 int code_point, String gsm, int id_sig, String id_prao, float x, float y,
                 float x_gps, float y_gps, int nb_clients, float rendement, int conso_clients,
                 int conso_poste, int date_rlv, int indice_rend, int ref_dlg, String fiabilise) {
        this.id = id_poste;
        this.libelle = libelle;
        this.type_poste = type_poste;
        this.loc_id = loc_id;
        this.code_point = code_point;
        this.gsm = gsm;
        this.id_sig = id_sig;
        this.id_prao = id_prao;
        this.x = x;
        this.y = y;
        this.gpsx = x_gps;
        this.gpsy = y_gps;
        this.nbclients = nb_clients;
        this.rendement = rendement;
        this.conso_clients = conso_clients;
        this.conso_poste = conso_poste;
        this.date_rlv = date_rlv;
        this.indice_rend = indice_rend;
        this.ref_dlg = ref_dlg;
        this.fiabilise = fiabilise;
    }

    public Poste(String libelle, String type_poste, int loc_id, int code_point,
                 String gsm, int id_sig, String id_prao, float x, float y, float x_gps, float y_gps,
                 int nb_clients, float rendement, int conso_clients, int conso_poste, int date_rlv,
                 int indice_rend, int ref_dlg, String fiabilise) {
        this.libelle = libelle;
        this.type_poste = type_poste;
        this.loc_id = loc_id;
        this.code_point = code_point;
        this.gsm = gsm;
        this.id_sig = id_sig;
        this.id_prao = id_prao;
        this.x = x;
        this.y = y;
        this.gpsx = x_gps;
        this.gpsy = y_gps;
        this.nbclients = nb_clients;
        this.rendement = rendement;
        this.conso_clients = conso_clients;
        this.conso_poste = conso_poste;
        this.date_rlv = date_rlv;
        this.indice_rend = indice_rend;
        this.ref_dlg = ref_dlg;
        this.fiabilise = fiabilise;
    }

    public int getId_poste() {
        return id;
    }

    public void setId_poste(int id_poste) {
        this.id = id_poste;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getType_poste() {
        return type_poste;
    }

    public void setType_poste(String type_poste) {
        this.type_poste = type_poste;
    }

    public int getLoc_id() {
        return loc_id;
    }

    public void setLoc_id(int loc_id) {
        this.loc_id = loc_id;
    }

    public int getCode_point() {
        return code_point;
    }

    public void setCode_point(int code_point) {
        this.code_point = code_point;
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }

    public int getId_sig() {
        return id_sig;
    }

    public void setId_sig(int id_sig) {
        this.id_sig = id_sig;
    }

    public String getId_prao() {
        return id_prao;
    }

    public void setId_prao(String id_prao) {
        this.id_prao = id_prao;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX_gps() {
        return gpsx;
    }

    public void setX_gps(float x_gps) {
        this.gpsx = x_gps;
    }

    public float getY_gps() {
        return gpsy;
    }

    public void setY_gps(float y_gps) {
        this.gpsy = y_gps;
    }

    public int getNb_clients() {
        return nbclients;
    }

    public void setNb_clients(int nb_clients) {
        this.nbclients = nb_clients;
    }

    public float getRendement() {
        return rendement;
    }

    public void setRendement(float rendement) {
        this.rendement = rendement;
    }

    public int getConso_clients() {
        return conso_clients;
    }

    public void setConso_clients(int conso_clients) {
        this.conso_clients = conso_clients;
    }

    public int getConso_poste() {
        return conso_poste;
    }

    public void setConso_poste(int conso_poste) {
        this.conso_poste = conso_poste;
    }

    public int getDate_rlv() {
        return date_rlv;
    }

    public void setDate_rlv(int date_rlv) {
        this.date_rlv = date_rlv;
    }

    public int getIndice_rend() {
        return indice_rend;
    }

    public void setIndice_rend(int indice_rend) {
        this.indice_rend = indice_rend;
    }

    public int getRef_dlg() {
        return ref_dlg;
    }

    public void setRef_dlg(int ref_dlg) {
        this.ref_dlg = ref_dlg;
    }

    public String getFiabilise() {
        return fiabilise;
    }

    public void setFiabilise(String fiabilise) {
        this.fiabilise = fiabilise;
    }
}
