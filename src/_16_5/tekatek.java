package _16_5;

import java.util.Scanner;

public class tekatek {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("cumle:");
        String cumle= oku.nextLine();

        for (int i = 0; i < cumle.length(); i++){
            if (cumle.charAt(i)==' ')  continue;
            System.out.println(cumle.charAt(i)) ;
        }







    }
}
