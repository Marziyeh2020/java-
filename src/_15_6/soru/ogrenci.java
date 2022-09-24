package _15_6.soru;

public class ogrenci extends kişi{
    private String subesi;
    public ogrenci(String ad, String soyad, String gorev,String subesi) {
        super(ad, soyad, gorev);
        setSubesi(subesi);
    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }

    @Override
    public String toString() {
        return "ogrenci{" +super.toString()+
                "subesi='" + subesi + '\'' +
                '}';
    }
}
