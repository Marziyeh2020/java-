package _09_6.soru2;

import java.util.ArrayList;
import java.util.Scanner;

public class pitzaSiparisHatti {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        ArrayList<pitza> sipariş=new ArrayList<>();
        int secim=0;
        do {
            menu();
            secim= sc.nextInt();

            switch (secim){
                case 1:pitza ps=new pitza(size.SMALL);
                        sipariş.add(ps);break;
                case 2:pitza pm=new pitza(size.MEDİUM);
                    sipariş.add(pm);break;

                case 3:pitza pl=new pitza(size.LARGE);
                    sipariş.add(pl);break;


                case 4:siparişyaz(sipariş);break;


            }
            //System.out.println("sipariş = " + sipariş);

        }while (secim<=4);

    }
    public static void menu(){
        System.out.println("****menue****");
        System.out.println("1.small pitza");
        System.out.println("2.medium pitza");
        System.out.println("3.larg pitza");
        System.out.println("4.işleme al pitza");
        System.out.println("5.ciliş");
        System.out.print("secim");
    }
    public static void siparişyaz(ArrayList<pitza> sipariş){
      int smallcount=0;
      int mediumcount=0;
      int largecount=0;
        for (pitza p :sipariş){
            if (p.pizasize==size.SMALL)   smallcount++;
            if (p.pizasize==size.MEDİUM)   mediumcount++;
            if (p.pizasize==size.LARGE)  largecount++;
        }

        System.out.println("small pitza = " + smallcount);
        System.out.println("medium pitza = " + mediumcount);
        System.out.println("large pitza= " + largecount);;

    }
}
