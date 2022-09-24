package _04_5;

import java.util.Scanner;

public class _3kelime {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("cumle giriniz:");
        String isim= oku.nextLine();

        char birinciHarf=isim.charAt(0);
        char ikinciHarf=isim.charAt(isim.indexOf(" ")+1);
        char ucuncuHarf=isim.charAt(isim.lastIndexOf(" ")+1);

        System.out.println(birinciHarf+"."+ikinciHarf+"."+ucuncuHarf);



    }

}
