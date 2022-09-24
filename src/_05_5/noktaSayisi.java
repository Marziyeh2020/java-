package _05_5;

import java.util.Scanner;

public class noktaSayisi {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("cumle giriniz:");
        String cumle= oku.nextLine();

        int uzunluk=cumle.length();
      String noktasiz= cumle.replace(".","");
       int uzunluk2=noktasiz.length();
        System.out.println("nokta sayisi:"+(uzunluk-uzunluk2));




    }
}
