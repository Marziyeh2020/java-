package _13_5;

import java.util.Scanner;

public class _02_soru {
    public static void main(String[] args) {
        //girilen sayi kadar sadece teklar toplansin
        Scanner oku=new Scanner(System.in);
        System.out.println("kaça kadar sailar toplanacak");
        int sinir= oku.nextInt();
        int sayac=1;
        int toplam=0;
        while (sayac<=sinir){
            toplam=toplam+sayac;
            sayac=sayac+2;//inja agr bege ke faghat takharo jam kon sayac=sayac+2 mineneveshtim
        }           //agar faghat zojharo jam kon sayac=sayac+1 ya inke bala migo
        System.out.println("toplam = " + toplam);

    }
}
