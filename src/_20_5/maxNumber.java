package _20_5;

public class maxNumber {
    public static void main(String[] args) {
        int[][] tablo={
                {1,2,3},
                {2,3,4},
                {4,8,6} };

        int enb=tablo[0][0];
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                if (tablo[i][j]>enb)
                    enb=tablo[i][j];
            }}
        System.out.println("enb = " + enb);
    }
}
