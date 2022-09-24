package _06_5;

import java.util.Scanner;

public class tersString {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("String giriniz");
        String kelime= oku.nextLine();

        String ters=new StringBuffer(kelime).reverse().toString();
        System.out.println("ters = " + ters);
        if (ters.equalsIgnoreCase(kelime))
            System.out.println("palindrom kelime dir");
        else
            System.out.println("palindrom kelime degildir");

    }

}
