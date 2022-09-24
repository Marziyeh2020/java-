package _01_6.okul2;

import _01_6.okul2.ogrenci;

import java.util.ArrayList;
import java.util.Scanner;

public class okul {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        Scanner oku2=new Scanner(System.in);
        ArrayList<_01_6.okul2.ogrenci> ogrencilar=new ArrayList<>();
        for (int i = 0; i <= 2; i++) {
            _01_6.okul2.ogrenci ogr=new _01_6.okul2.ogrenci();
            System.out.println("okul no:");
            ogr.okulNo= oku.nextInt();
            System.out.println("tam ad:");
            ogr.tamad= oku2.nextLine();
            System.out.println("notu:");
            ogr.notu= oku.nextInt();

            ogrencilar.add(ogr);
        }
        bilgiyazdir(ogrencilar);
    }
    public static void bilgiyazdir(ArrayList<ogrenci> ogrencis){
        for (ogrenci m :ogrencis)
            System.out.println(m.okulNo+" "+m.tamad+" "+m.notu);

    }
    public static void ortalama(ArrayList<ogrenci> ogrencis){
        int toplam=0;
        for (ogrenci m :ogrencis)
          toplam=toplam+m.notu;
        System.out.println("ortalam = " + (toplam/ogrencis.size()));


    }
}
