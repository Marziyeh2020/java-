package _05_5;

import java.util.Scanner;

public class şifre {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("şifre giriniz:");
        String şifre= oku.nextLine();
        String myşifre="iman";
        if (şifre.equalsIgnoreCase(myşifre))
            System.out.println("dogru şifre");
        else
            System.out.println("yanliş şifre");
    }
}
