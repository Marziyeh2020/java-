package _10_6.soru1;

public class kisi {
    String ad;
    String soyad;
     private int yaş;

    public kisi() {
    }

    public int getYaş() {
        return yaş;
    }

    public void setYaş(int yaş) {
        this.yaş = yaş;
    }

    public kisi(String ad, String soyad, int yaş) {
        this.ad = ad;
        this.soyad = soyad;
        setYaş(yaş);
    }
}
