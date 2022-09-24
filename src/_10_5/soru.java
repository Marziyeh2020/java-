package _10_5;

import java.util.Scanner;

public class soru {
    public static void main(String[] args) {
        //String>10 and contain Study
        Scanner oku=new Scanner(System.in);
        System.out.println("String giriniz:");
        String kelime= oku.nextLine();
        int u=kelime.length();
        if (u>10 && kelime.toLowerCase().contains("study"))
            System.out.println("yes");
        else
            System.out.println("hayir");
    }
}
