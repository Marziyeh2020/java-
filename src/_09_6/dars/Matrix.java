package _09_6.dars;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    private  int numberofRows;
    private int  numberOfColumns;
   public int[][] array;

    public Matrix() {
        Scanner sc=new Scanner(System.in);
        System.out.println("number of rows:");
        this.numberofRows = sc.nextInt();
        System.out.println("number of columns:");
        this.numberOfColumns = sc.nextInt();
        this.array = new int[numberofRows][numberOfColumns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=(int) (Math.random()*100);
            }

        }
    }

    public static void main(String[] args) {
       Matrix matrix=new Matrix();

        for (int i = 0; i < matrix.array.length; i++) {
            System.out.println(Arrays.toString(matrix.array[i]));
        }


    }




}
