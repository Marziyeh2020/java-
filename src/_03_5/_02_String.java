package _03_5;

import java.util.Scanner;

public class _02_String {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        String isim= oku.nextLine();
        char ilkharf=isim.toUpperCase().charAt(0);
        int boşluk=isim.indexOf(" ");
        char ikinciharf=isim.toUpperCase().charAt(boşluk+1);
        System.out.println(ilkharf+". "+ikinciharf);

        int sayi=45;
        long sayii=454444444555555555L;
        sayi=(int)sayii;
        System.out.println("sayi = " + sayi);
        System.out.println("sayii = " + sayii);;

    }
}
