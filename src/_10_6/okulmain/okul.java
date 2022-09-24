package _10_6.okulmain;

import java.util.ArrayList;

public class okul {
     static String okulad;
     private  int kontenjan;
     ArrayList<ogrenci> ogrencilar=new ArrayList<>();

    public okul(int kontenjan, String okulad) {
        setKontenjan(kontenjan);
        setOkulad(okulad);
    }

    public static String getOkulad() {
        return okulad;
    }

    public static void setOkulad(String okulad) {
        okul.okulad = okulad;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        this.kontenjan = kontenjan;
    }


}
