package _20_5;

public class teklar {
    public static void main(String[] args) {
        //100 elemanli dizi teklar başka bir dizi

        int[] dizi=new int[100];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] =(int)(Math.random()*100);
        }
        int[] teklar=new  int[100];
        int tekindex=0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==1){
                teklar[tekindex]=dizi[i];
                tekindex++;
            }
            System.out.println("dizi = " + dizi);
            System.out.println("teklar = " + teklar);
        }
    }
}
