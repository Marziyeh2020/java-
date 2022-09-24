package _19_5;

import java.util.Scanner;

public class _2_soru {
    public static void main(String[] args) {
        //bir cumle kaç kelime
        Scanner oku=new Scanner(System.in);
        System.out.println("cumle:");
        String cumle= oku.nextLine();
           int kaçkelime=0;
        for (int i = 0; i < cumle.length(); i++) {

          if(cumle.charAt(i)==' ')
            kaçkelime++;
        }
        System.out.println(cumle.trim()+"adet = " + (kaçkelime+1));
    }
}
