package aro.lydec.lydec_console.Common;


import java.io.Serializable;
import java.sql.Timestamp;

// pour définir le type composée du id de la table conso_poste_dly (utilisé dans repository)
public class conso_poste_dly_ID implements Serializable {
    private int id_mesure;
    private Timestamp rlv_ndate;

    public conso_poste_dly_ID() {
    }

    public conso_poste_dly_ID(int id_mesure, Timestamp rlv_ndate) {
        this.id_mesure = id_mesure;
        this.rlv_ndate = rlv_ndate;
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
}
