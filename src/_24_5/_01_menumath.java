package _24_5;

import java.util.Scanner;

public class _01_menumath {
    public static void main(String[] args) {
        //menu 1 toplama 2 cikartma 3çarpma 4 bolme 5 cikiş
        Scanner oku=new Scanner(System.in);
        int seçim;
        do {
            System.out.println(" *****menue****");
            System.out.println("toplama için 1 basiniz");
            System.out.println("cikarma için 2 basiniz");
            System.out.println("carpma için 3 basiniz");
            System.out.println("bolme icin 4 basiniz");
            System.out.print("seçim: ");
             seçim= oku.nextInt();
            System.out.println("numara giriniz:");
            int numara1= oku.nextInt();
            int numara2= oku.nextInt();

            switch (seçim){
                case 1:toplam(numara1,numara2); break;
                case 2:cikarma(numara1,numara2); break;
                case 3:carpma(numara1,numara2); break;
                case 4:bolme(numara1,numara2); break;
            }

//           int tpolam= toplam(numara1,numara2);
//            System.out.println("tpolam = " + tpolam);

        }while (seçim<=4 && seçim>0);
    }
    public static int toplam(int numara1,int numara2){
        System.out.println(numara1+numara2);
        return numara1+numara2;

    }
    public static void cikarma(int numara1,int numara2){
        System.out.println(numara1-numara2);
    }
    public static void carpma(int numara1,int numara2){
        System.out.println(numara1*numara2);
    }
    public static void bolme(int numara1,int numara2){
        System.out.println(numara1/numara2);
    }
}
