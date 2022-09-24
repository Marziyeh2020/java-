package _21_6;

public  abstract   class hayvan {
    private  int id;
    private String isim;
    private boolean vahsi;
    private String dogumtarih;
    static int idsayac=0;

    abstract void yiyecegi();
    abstract void  yemekmiktari();
    abstract  void  gunlukUykuSuresi();
    abstract void sesi();

    public hayvan( String isim, boolean vahsi, String dogumtarih) {

        this.isim = isim;
        this.vahsi = vahsi;
        this.dogumtarih = dogumtarih;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id=++idsayac;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumtarih() {
        return dogumtarih;
    }

    public void setDogumtarih(String dogumtarih) {
        this.dogumtarih = dogumtarih;
    }

    @Override
    public String toString() {
        yiyecegi();
        yemekmiktari();
        gunlukUykuSuresi();
        sesi();
        return "hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumtarih='" + dogumtarih + '\'' +
                '}';
    }
}
