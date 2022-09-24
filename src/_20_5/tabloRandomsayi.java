package _20_5;

public class tabloRandomsayi {
    public static void main(String[] args) {
        //2 boyutlu 3*4 diziye random sayi doldurup

        int[][] tablo=new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                tablo[i][j]=(int) (Math.random()*10);//butun eleman lar random sayi atandi
            }
        }
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j <4 ; j++) {
                System.out.print(tablo[i][j]);

            }
            System.out.println();
        }




    }
}
