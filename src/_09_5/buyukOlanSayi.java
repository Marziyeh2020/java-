package _09_5;

import java.util.Scanner;

public class buyukOlanSayi {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        for (int i = 0; i <2 ; i++) {
            System.out.println("sayi giriniz:");
            int sayi1= oku.nextInt();
            int sayi2= oku.nextInt();
            int enb=sayi1;
            if (sayi2>enb)
                enb=sayi2;
            System.out.println("enb = " + enb);
        }

    }
}
