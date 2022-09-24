package _27_5;

import java.util.Arrays;
import java.util.Scanner;

public class enbFarkEnkFark {
    //kullanici diziye kaç sayi atanacagini belirlesin ondan sonra enbuyuk fark ve en kucuk fark
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" dizinin eleman sayisini giriniz: ");
        int elemansayisi= sc.nextInt();
        int[] dizi=new int[elemansayisi];

        for (int i = 0; i < dizi.length; i++) {
             dizi[i] =(int) (Math.random()*100)+1;
        }
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));

        int enkfark=0;
        int enbfark=0;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = i+1; j < dizi.length; j++) {
                int fark=Math.abs(dizi[i]-dizi[j]);

                if (fark>enbfark)
                    enbfark=fark;

                if (j==1)
                    enkfark=fark;

                if (fark<enkfark)
                    enkfark=fark;

            }

        }
        System.out.println("enbfark = " + enbfark);
        System.out.println("enkfark = " + enkfark);
    }
}
