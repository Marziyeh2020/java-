package _26_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        //kullanicidan alan sayilar sadece teklar donsun

        Scanner sc=new Scanner(System.in);
        int[] dizi=new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("sayi:");
            dizi[i]= sc.nextInt();
        }
        ArrayList<Integer> dizidekiteklar=donenteklar(dizi);
        System.out.println("dizidekiteklar = " + dizidekiteklar);

    }
    public static ArrayList<Integer>  donenteklar(int[] dizi){
        ArrayList<Integer> teklar=new ArrayList<>();
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==1)
                teklar.add(dizi[i]);

        }
        return teklar;

    }
}
