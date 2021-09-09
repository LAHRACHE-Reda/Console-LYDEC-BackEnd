package aro.lydec.lydec_console.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class conso_pl_poste {
    @Id
    @GeneratedValue
    private int num_trans;
    private int id_ouvrage;
    private String type_ouvrage;
    private String frn_cod;
    private int annee_cons;
    private int mois_cons;
    private int ref_dlg;
    private String trt_fac;
    private String trf_cod;
    private String pol_cat;
    private String pol_type;
    private String type_trans;
    private String type_enr;
    private String rlv_typc;
    private int nbr_cpt;
    private float rlv_cons;

    public conso_pl_poste() {
    }

    public conso_pl_poste(int num_trans, int id_ouvrage, String type_ouvrage, String frn_cod, int annee_cons, int mois_cons, int ref_dlg, String trt_fac, String trf_cod, String pol_cat, String pol_type, String type_trans, String type_enr, String rlv_typc, int nbr_cpt, float rlv_cons) {
        this.num_trans = num_trans;
        this.id_ouvrage = id_ouvrage;
        this.type_ouvrage = type_ouvrage;
        this.frn_cod = frn_cod;
        this.annee_cons = annee_cons;
        this.mois_cons = mois_cons;
        this.ref_dlg = ref_dlg;
        this.trt_fac = trt_fac;
        this.trf_cod = trf_cod;
        this.pol_cat = pol_cat;
        this.pol_type = pol_type;
        this.type_trans = type_trans;
        this.type_enr = type_enr;
        this.rlv_typc = rlv_typc;
        this.nbr_cpt = nbr_cpt;
        this.rlv_cons = rlv_cons;
    }

    public conso_pl_poste(int id_ouvrage, String type_ouvrage, String frn_cod, int annee_cons, int mois_cons, int ref_dlg, String trt_fac, String trf_cod, String pol_cat, String pol_type, String type_trans, String type_enr, String rlv_typc, int nbr_cpt, float rlv_cons) {
        this.id_ouvrage = id_ouvrage;
        this.type_ouvrage = type_ouvrage;
        this.frn_cod = frn_cod;
        this.annee_cons = annee_cons;
        this.mois_cons = mois_cons;
        this.ref_dlg = ref_dlg;
        this.trt_fac = trt_fac;
        this.trf_cod = trf_cod;
        this.pol_cat = pol_cat;
        this.pol_type = pol_type;
        this.type_trans = type_trans;
        this.type_enr = type_enr;
        this.rlv_typc = rlv_typc;
        this.nbr_cpt = nbr_cpt;
        this.rlv_cons = rlv_cons;
    }

    public int getNum_trans() {
        return num_trans;
    }

    public void setNum_trans(int num_trans) {
        this.num_trans = num_trans;
    }

    public int getId_ouvrage() {
        return id_ouvrage;
    }

    public void setId_ouvrage(int id_ouvrage) {
        this.id_ouvrage = id_ouvrage;
    }

    public String getType_ouvrage() {
        return type_ouvrage;
    }

    public void setType_ouvrage(String type_ouvrage) {
        this.type_ouvrage = type_ouvrage;
    }

    public String getFrn_cod() {
        return frn_cod;
    }

    public void setFrn_cod(String frn_cod) {
        this.frn_cod = frn_cod;
    }

    public int getAnnee_cons() {
        return annee_cons;
    }

    public void setAnnee_cons(int annee_cons) {
        this.annee_cons = annee_cons;
    }

    public int getMois_cons() {
        return mois_cons;
    }

    public void setMois_cons(int mois_cons) {
        this.mois_cons = mois_cons;
    }

    public int getRef_dlg() {
        return ref_dlg;
    }

    public void setRef_dlg(int ref_dlg) {
        this.ref_dlg = ref_dlg;
    }

    public String getTrt_fac() {
        return trt_fac;
    }

    public void setTrt_fac(String trt_fac) {
        this.trt_fac = trt_fac;
    }

    public String getTrf_cod() {
        return trf_cod;
    }

    public void setTrf_cod(String trf_cod) {
        this.trf_cod = trf_cod;
    }

    public String getPol_cat() {
        return pol_cat;
    }

    public void setPol_cat(String pol_cat) {
        this.pol_cat = pol_cat;
    }

    public String getPol_type() {
        return pol_type;
    }

    public void setPol_type(String pol_type) {
        this.pol_type = pol_type;
    }

    public String getType_trans() {
        return type_trans;
    }

    public void setType_trans(String type_trans) {
        this.type_trans = type_trans;
    }

    public String getType_enr() {
        return type_enr;
    }

    public void setType_enr(String type_enr) {
        this.type_enr = type_enr;
    }

    public String getRlv_typc() {
        return rlv_typc;
    }

    public void setRlv_typc(String rlv_typc) {
        this.rlv_typc = rlv_typc;
    }

    public int getNbr_cpt() {
        return nbr_cpt;
    }

    public void setNbr_cpt(int nbr_cpt) {
        this.nbr_cpt = nbr_cpt;
    }

    public float getRlv_cons() {
        return rlv_cons;
    }

    public void setRlv_cons(float rlv_cons) {
        this.rlv_cons = rlv_cons;
    }
}
