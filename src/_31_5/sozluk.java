package _31_5;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class sozluk {
    public static void main(String[] args) {
        Map<String,String> sozluk=new TreeMap<>();

        Scanner oku=new Scanner(System.in);
        Scanner oku2=new Scanner(System.in);
        int secim=0;
        String kelime="";
        String anlami="";
        do {
            System.out.println(" ekleme icin 1 bas: ");
            System.out.println(" duzeltme icin 2 bas: ");
            System.out.println(" leisteye gormek icin 3 bas bas: ");
            System.out.println(" arama içi 4 bas ");
            System.out.println(" silme için 5 bas ");
            System.out.println("cikiş için 6 bas ");


            System.out.println("seciminizi giriniz");

            secim= oku.nextInt();


            switch (secim){
                case 1:
                    System.out.println("kelimeye giriniz");
                     kelime= oku2.nextLine();
                    System.out.println("anlami");
                    anlami= oku2.nextLine();
                    sozluk.put(kelime,anlami);
                    break;
                case 2:
                    System.out.println("duzeieltilecek kelime");
                     kelime=oku2.nextLine();
                     sozluk.containsKey(kelime);
                    System.out.println("kelimeyi duzeltin");
                    kelime=oku2.nextLine();
                    anlami= oku2.nextLine();
                    sozluk.remove(kelime,anlami);


                    break;
                case 3:
                    System.out.println("sozluk = " + sozluk);

                    break;
                case 4://arama
                    break;
                case 5://silme
                    break;
                case 6://cikiş
                    break;



            }


        }while (secim<6);








    }
}
