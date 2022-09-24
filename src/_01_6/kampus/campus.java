package _01_6.kampus;

import _03_6.Utility;

public class campus {
    public static void main(String[] args) {
        okul okul=new okul();
        ogrenci ogrenci =new ogrenci();

        okul.muduradi="ismet";
        okul.okuladi="cumhuriyet";
        okul.ucret=12.54;

        ogrenci.okulno=45;
        ogrenci.tamad="mazi mani";
       // ogrenci.okulu=

        int sayi=98;
        Utility.getstring(sayi);



    }
}
