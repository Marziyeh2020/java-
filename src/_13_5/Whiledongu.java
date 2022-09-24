package _13_5;

import java.util.Scanner;

public class Whiledongu {
    public static void main(String[] args) {
        //girecegin sayi kadar toplam yapsin
        Scanner oku=new Scanner(System.in);
        int sayac=0;
        int toplam=0;
        while (sayac<=4){
            System.out.println("sayi giriniz:");
            int sayi= oku.nextInt();
            toplam=toplam+sayi;
            sayac++;
        }
        System.out.println("toplam = " + toplam);


    }
}
