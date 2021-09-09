package aro.lydec.lydec_console.Common;

public class Consommation {
    private int date;
    private float consommation;

    public Consommation() {
    }

    public Consommation(int date, float consommation) {
        this.date = date;
        this.consommation = consommation;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public float getConsommation() {
        return consommation;
    }

    public void setConsommation(float consommation) {
        this.consommation = consommation;
    }
}
