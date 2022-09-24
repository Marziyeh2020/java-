package _19_5;

public class _1_soru {
    public static void main(String[] args) {
        //50 elemanli dizi random sayi at sonra donguile tek ve çift ayri bir dongu de yap
        int sayac=1;
        int[] dizi=new int[50];

        for (int i = 0; i < 50; i++) {
            dizi [i]=(int)(Math.random()*50)+1;
            System.out.print(dizi[i]+" ");
            sayac++;
        }
        System.out.println();
        for (int i = 0; i < 50; i++) {
            if (dizi[i]%2==0)
                System.out.print("2"+" ");
            else
                System.out.print("1"+" ");

        }



    }
}
