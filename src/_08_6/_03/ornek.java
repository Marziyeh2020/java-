package _08_6._03;

import java.util.Scanner;

public class ornek {
    public static void main(String[] args) {
        //bir class içinde sabir bir şekilde
        //bir gun saat  dakika saniye sayisi
        //main de kullanilan gun saat dakika olarak toplam saniye bulun
         int gun=0;
         int saat=0;
         int dakika=0;
        Scanner oku=new Scanner(System.in);
        System.out.println("gun");gun= oku.nextInt();
        System.out.println("saat");saat= oku.nextInt();
        System.out.println("dakika");dakika= oku.nextInt();


        System.out.println(" toplamsaniye= "+zaman.toplamsaniye(gun,saat,dakika));


    }
}
