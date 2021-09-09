package aro.lydec.lydec_console.Model;

import aro.lydec.lydec_console.Common.conso_poste_dly_ID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
@Table
@IdClass(conso_poste_dly_ID.class)
public class conso_poste_dly {
    private String type_tr;
    private String profile;
    private int id_poste;
    private int id_device;
    @Id
    private int id_mesure;
    @Id
    private Timestamp rlv_ndate;
    private Timestamp rlv_adate;
    private int rlv_njc;
    private String rlv_typc;
    private float rlv_nidx;
    private float rlv_aidx;
    private float rlv_conso;
    private String type_conso;
    private String registre;
    private float coeff_mod;

    public conso_poste_dly() {
    }

    public conso_poste_dly(String type_tr, String profile, int id_poste, int id_device, int id_mesure, Timestamp rlv_ndate, Timestamp rlv_adate, int rlv_njc, String rlv_typc, float rlv_nidx, float rlv_aidx, float rlv_conso, String type_conso, String registre, float coeff_mod) {
        this.type_tr = type_tr;
        this.profile = profile;
        this.id_poste = id_poste;
        this.id_device = id_device;
        this.id_mesure = id_mesure;
        this.rlv_ndate = rlv_ndate;
        this.rlv_adate = rlv_adate;
        this.rlv_njc = rlv_njc;
        this.rlv_typc = rlv_typc;
        this.rlv_nidx = rlv_nidx;
        this.rlv_aidx = rlv_aidx;
        this.rlv_conso = rlv_conso;
        this.type_conso = type_conso;
        this.registre = registre;
        this.coeff_mod = coeff_mod;
    }

    public String getType_tr() {
        return type_tr;
    }

    public void setType_tr(String type_tr) {
        this.type_tr = type_tr;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public int getId_poste() {
        return id_poste;
    }

    public void setId_poste(int id_poste) {
        this.id_poste = id_poste;
    }

    public int getId_device() {
        return id_device;
    }

    public void setId_device(int id_device) {
        this.id_device = id_device;
    }

    public int getId_mesure() {
        return id_mesure;
    }

    public void setId_mesure(int id_mesure) {
        this.id_mesure = id_mesure;
    }

    public Timestamp getRlv_ndate() {
        return rlv_ndate;
    }

    public void setRlv_ndate(Timestamp rlv_ndate) {
        this.rlv_ndate = rlv_ndate;
    }

    public Timestamp getRlv_adate() {
        return rlv_adate;
    }

    public void setRlv_adate(Timestamp rlv_adate) {
        this.rlv_adate = rlv_adate;
    }

    public int getRlv_njc() {
        return rlv_njc;
    }

    public void setRlv_njc(int rlv_njc) {
        this.rlv_njc = rlv_njc;
    }

    public String getRlv_typc() {
        return rlv_typc;
    }

    public void setRlv_typc(String rlv_typc) {
        this.rlv_typc = rlv_typc;
    }

    public float getRlv_nidx() {
        return rlv_nidx;
    }

    public void setRlv_nidx(float rlv_nidx) {
        this.rlv_nidx = rlv_nidx;
    }

    public float getRlv_aidx() {
        return rlv_aidx;
    }

    public void setRlv_aidx(float rlv_aidx) {
        this.rlv_aidx = rlv_aidx;
    }

    public float getRlv_conso() {
        return rlv_conso;
    }

    public void setRlv_conso(float rlv_conso) {
        this.rlv_conso = rlv_conso;
    }

    public String getType_conso() {
        return type_conso;
    }

    public void setType_conso(String type_conso) {
        this.type_conso = type_conso;
    }

    public String getRegistre() {
        return registre;
    }

    public void setRegistre(String registre) {
        this.registre = registre;
    }

    public float getCoeff_mod() {
        return coeff_mod;
    }

    public void setCoeff_mod(float coeff_mod) {
        this.coeff_mod = coeff_mod;
    }
}

