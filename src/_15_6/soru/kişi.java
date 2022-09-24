package _15_6.soru;

public class kişi {
    private String ad;
    private  String soyad;
    private String gorev;

    public kişi(String ad, String soyad, String gorev) {
        this.ad = ad;
        this.soyad = soyad;
        this.gorev = gorev;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    @Override
    public String toString() {
        return "kişi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", gorev='" + gorev + '\'' +
                '}';
    }
    public static void  kimlikyaz(kişi gelenkişi){
        System.out.println("ad = " + gelenkişi.ad);
        System.out.println("soyad = " + gelenkişi.soyad);
        System.out.println("gorev = " +gelenkişi. gorev);


        if (gelenkişi instanceof ogrenci)
            System.out.println("gelenkişi = " + ((ogrenci)gelenkişi).getSubesi());


        if (gelenkişi instanceof çalişan)
            System.out.println("gelenkişi = " + ((çalişan)gelenkişi).getDepartman());
    }
}
