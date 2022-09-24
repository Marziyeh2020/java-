package _10_6.Arabamain;

public class Araba {
  private   String renk;
  private   String model;
  private   int motorhacmi;
  private   int kapisayisi;

    public Araba(String renk, String model, int motorhacmi, int kapisayisi) {
       setRenk(renk);
        setModel(model);
        setMotorhacmi(motorhacmi);
        setKapisayisi(kapisayisi);
    }
    public Araba(){

    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMotorhacmi() {
        return motorhacmi;
    }

    public void setMotorhacmi(int motorhacmi) {
        this.motorhacmi = motorhacmi;
    }

    public int getKapisayisi() {
        return kapisayisi;
    }

    public void setKapisayisi(int kapisayisi) {
        this.kapisayisi = kapisayisi;
    }
}
