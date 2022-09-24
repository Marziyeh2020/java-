package _06_5;

import java.util.Scanner;

public class UcBasamakliSayi {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("şifre giriniz:");
        int sayi= oku.nextInt();

        int birinciBasamak=sayi%10;
        int onlarbasamagi=(sayi/10)%10;
        int yuzlarbasamaği=(sayi/100)%10;
        System.out.println((birinciBasamak*100)+(onlarbasamagi*10)+yuzlarbasamaği);
    }
}
