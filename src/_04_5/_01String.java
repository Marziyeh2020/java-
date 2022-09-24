package _04_5;

import java.util.Scanner;

public class _01String {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("isim:");
        String isim= oku.nextLine();
        int boşluk=isim.indexOf(" ");
        String name=isim.substring(0,boşluk);
        System.out.println("name = " + name);
        String surname=isim.substring(boşluk+1);
        System.out.println("surname = " + surname);



    }

}
