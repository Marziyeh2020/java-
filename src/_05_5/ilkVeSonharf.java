package _05_5;

import java.util.Scanner;

public class ilkVeSonharf {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("şifre giriniz:");
        String kelime= oku.nextLine();
        Character ilkHarf=kelime.charAt(0);
        Character sonharf=kelime.charAt(kelime.length()-1);
        System.out.println("ilkHarf = " + ilkHarf);
        System.out.println("sonharf = " + sonharf);
    }

}
