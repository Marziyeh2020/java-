package _24_5;

import java.util.Scanner;

public class _02_notdefter {
    public static void main(String[] args) {
        //ogrenci adi ve notlar sonra ortalama

        Scanner oku=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("ogrenci ad = " );
            String ad= oku.nextLine();
            System.out.println(" notlar= ");
            String strnotlar= oku.nextLine();

            int ort=ortalama(strnotlar);
            System.out.println("ort = " + ort);
        }


    }
    public static int ortalama(String notlar){
        String[] notdizi=notlar.split(" ");
        int toplam=0;
        for (int i = 0; i < notdizi.length; i++) {
            toplam=toplam+Integer.parseInt(notdizi[i]);


        }
        return  toplam/ notdizi.length;

    }
}
