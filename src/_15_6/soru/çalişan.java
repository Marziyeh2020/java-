package _15_6.soru;

public class çalişan extends kişi{
    private String departman;
    public çalişan(String ad, String soyad, String gorev,String departman) {
        super(ad, soyad, gorev);
        setDepartman(departman);
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    @Override
    public String toString() {
        return "çalişan{" +super.toString()+
                "departman='" + departman + '\'' +
                '}';
    }
}
