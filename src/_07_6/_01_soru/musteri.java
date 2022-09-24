package _07_6._01_soru;

public class musteri {
    String ad;
    String soyad;
    int hesabid;

    hesab musterihesab;


    public musteri(String ad, String soyad,int hesabid) {
        this.ad = ad;
        this.soyad = soyad;
        this.hesabid = hesabid;
        this.musterihesab = musterihesab;
    }



    @Override
    public String toString() {
        return "musteri{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", hesabid=" + hesabid +
                ", musterihesab=" + musterihesab +
                '}';
    }
}
