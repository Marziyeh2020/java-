package _07_6._01_soru;

public class banka {
    public static void main(String[] args) {

       musteri musteri=new musteri("iman","nargesi",4512);
       musteri.musterihesab=new hesab();

       hesab hesab=new hesab();



        System.out.println("musteri = " + musteri);



    }
}
