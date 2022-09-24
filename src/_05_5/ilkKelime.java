package _05_5;

import java.util.Scanner;

public class ilkKelime {
    public static void main(String[] args) {


        Scanner oku=new Scanner(System.in);
        System.out.println("cumle giriniz:");
        String cumle= oku.nextLine();

        int boşlkindex=cumle.indexOf(" ");
        int ikinciboşluk=cumle.indexOf(" ",boşlkindex+1);
        String ikincikelime=cumle.substring(0,ikinciboşluk);
        System.out.println("ikincikelime = " + ikincikelime);
    }
}
