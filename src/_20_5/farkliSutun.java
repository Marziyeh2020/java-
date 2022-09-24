package _20_5;

public class farkliSutun {
    public static void main(String[] args) {
        int[][] tablo={
                {1,45,65,4},
                {45,12,3,6},
                {4,2},
                {45,25,96,85,74}
        };
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j]+", ");

            }
            System.out.println();

        }
    }
}
