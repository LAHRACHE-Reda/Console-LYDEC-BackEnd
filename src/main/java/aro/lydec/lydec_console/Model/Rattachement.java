package aro.lydec.lydec_console.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Rattachement {
    @Id
    @GeneratedValue
    private int id_ouvrage;
    private String type_ouvrage;
    private String frn_cod;
    private int loc_idd;
    private int id_depart;
    private int id_phase;

    public Rattachement(){}

    public Rattachement(int id_ouvrage, String type_ouvrage, String frn_cod, int loc_idd, int id_depart, int id_phase) {
        this.id_ouvrage = id_ouvrage;
        this.type_ouvrage = type_ouvrage;
        this.frn_cod = frn_cod;
        this.loc_idd = loc_idd;
        this.id_depart = id_depart;
        this.id_phase = id_phase;
    }

    public Rattachement(String type_ouvrage, String frn_cod, int loc_idd, int id_depart, int id_phase) {
        this.type_ouvrage = type_ouvrage;
        this.frn_cod = frn_cod;
        this.loc_idd = loc_idd;
        this.id_depart = id_depart;
        this.id_phase = id_phase;
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

    public int getLoc_idd() {
        return loc_idd;
    }

    public void setLoc_idd(int loc_idd) {
        this.loc_idd = loc_idd;
    }

    public int getId_depart() {
        return id_depart;
    }

    public void setId_depart(int id_depart) {
        this.id_depart = id_depart;
    }

    public int getId_phase() {
        return id_phase;
    }

    public void setId_phase(int id_phase) {
        this.id_phase = id_phase;
    }
}
