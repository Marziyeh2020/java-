package _04_5;

import java.util.Scanner;

public class boşOlupOlmadiği {
    public static void main(String[] args) {
//        Scanner oku=new Scanner(System.in);
//        System.out.println("cumle giriniz:");
//        String isim= oku.nextLine();
//        System.out.println("isim.isEmpty() = " + isim.isEmpty());

        Scanner oku=new Scanner(System.in);
        System.out.println("cumle giriniz:");
        String isim= oku.nextLine();
        int uzunluk=isim.toLowerCase().replace("a","").length();
        int uzunluk2=isim.replaceAll("[Aa]","").length();

        System.out.println("uzunluk = " + uzunluk);
        System.out.println("uzunluk2 = " + uzunluk2);


    }
}
