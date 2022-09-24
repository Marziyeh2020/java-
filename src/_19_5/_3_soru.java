package _19_5;

public class _3_soru {
    public static void main(String[] args) {
        //dizi random sayi   enbuyuk eleman ve index

        int[] arrey=new int[100];

        for (int i = 0; i < 100; i++) {
            arrey[i]=(int) (Math.random()*100)+1;
            System.out.println(i+"arrey = " + arrey[i]);
        }
        int enb=arrey[0];
        int enbindex=0;
        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i]>enb){
                enb=arrey[i];
                enbindex=i;
            }


        }
        System.out.println("enb = " + enb);
        System.out.println("enbindex = " + enbindex);


    }
}
