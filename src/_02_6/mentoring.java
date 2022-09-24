package _02_6;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mentoring {
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList(List.of(4, 5, 6, 7, 8, 9));
        ArrayList<Integer> B = new ArrayList(List.of(5, 6, 2, 12, 78, 58, 69));

        Collections.sort(A);
        System.out.println("A = " + A);
        Collections.sort(B);
        System.out.println("B = " + B);
        Collections.reverse(B);
        System.out.println("B = " + B);


        ArrayList<Integer> C=birleştir(A,B);
        System.out.println("C = " + C);

        ArrayList<Integer> M=doldurma(8);
        System.out.println("M = " + M);
        ArrayList<Integer> H=doldurma(8);
        System.out.println("H = " + H);

    }
    public static ArrayList<Integer> birleştir(ArrayList<Integer> A ,ArrayList<Integer> B){
        ArrayList<Integer> c=new ArrayList<>();
        c.addAll(A);
        c.addAll(B);
        return c;

    }
    public static ArrayList<Integer> doldurma(int elemansayisi){
        ArrayList<Integer> yenilist=new ArrayList<>();
        for (int i = 0; i < elemansayisi; i++) {
            yenilist.add((int) (Math.random()*100));

        }
        return yenilist;

    }
}
