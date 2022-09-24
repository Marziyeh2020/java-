package _27_5;

import java.util.Arrays;
import java.util.Scanner;

public class _2DarrayToplam {
    public static void main(String[] args) {
        //2d array tanitin ki kullanici kaç satir ve kac sutun oldugunu belirlesin
        //sonra satir larin toplami ve sutun lerin toplamini bulunuz
        Scanner sc=new Scanner(System.in);
        System.out.println("kaç satir olacak:");
        int satirS= sc.nextInt();
        System.out.println("kaç sutun olacak");
        int sutunS= sc.nextInt();

        int[][] array=new int[satirS][sutunS];

        for (int satir= 0;satir < array.length; satir++) {
            for (int sutun = 0; sutun<array[satir].length ; sutun++) {

               int eleman=(int)(Math.random()*10);
               array[satir][sutun]=eleman;
            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Arrays.toString(array[i]) = " + Arrays.toString(array[i]));
            
        }


           int sutuntoplam=0;
        for (int i = 0; i <array[0].length ; i++) {
            for (int j = 0; j <array.length ; j++) {
               sutuntoplam=array[j][i];
            }
            System.out.println("sutuntoplam = " + sutuntoplam);
            sutuntoplam=0;
        }



    }
}
