package _01_6.okul1;

import java.util.ArrayList;
import java.util.Scanner;

public class okul {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        ArrayList<ogrenci> ogrencilar=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ogrenci ogr=new ogrenci();
            System.out.println("ogrenci adi:");
            ogr.adi= oku.nextLine();
            System.out.println("soyad:");
            ogr.soyad= oku.nextLine();
            System.out.println("sinif:");
            ogr.sinif= oku.nextLine();
            System.out.println("adress:");
            ogr.adress= oku.nextLine();
           ogrencilar.add(ogr);
        }
       for ( ogrenci f:ogrencilar){
           System.out.println("ogrencilar = " + f.adi);
           System.out.println("f.soyad = " + f.soyad);
           System.out.println("f.sinif = " + f.sinif);
           System.out.println("f.adress = " + f.adress);
       }


    }
}


class ogrenci{
    String adi;
    String soyad;
    String sinif;
    String adress;
}