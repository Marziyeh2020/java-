package _10_6.okulmain;

import java.util.Scanner;

public class okulmain {
    public static void main(String[] args) {
    okul okul=new okul(3,"kabataş");
        Scanner oku=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);

     do {
         System.out.print("ogrenci adi:");
         String adi= oku.nextLine();

         System.out.print("ogrenci soyadi:");
         String soyadi= oku.nextLine();

         System.out.print("ogrenci yas:");
         int yas= okuInt.nextInt();

         if (yas<=15)
         {
             ogrenci ogr=new ogrenci(adi,soyadi,yas);
             okul.ogrencilar.add(ogr);
         }
         else
             System.out.println("yaş sebebiyle alinamadi");

         System.out.println("okul = " + okul.ogrencilar);
     }while (okul.ogrencilar.size()<okul.getKontenjan());


    }
}
