package _12_5;

import java.util.Scanner;

public class tahminOyunu {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("kaç kadar sayi tutulsun:");
        int kaçkadar= oku.nextInt();

        int tutulansayi=(int) (Math.random()*kaçkadar);

        System.out.println("tahmininiz nedir:");
        int tahmin= oku.nextInt();

        System.out.println(((tutulansayi==tahmin))?"tebrik":"kayibettin");
        System.out.println("tutulansayi = " + tutulansayi);
    }
}
