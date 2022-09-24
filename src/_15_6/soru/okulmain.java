package _15_6.soru;

public class okulmain {
    public static void main(String[] args) {

        kişi ogrenci1=new ogrenci("iman","ak","41","a1");

        kişi calişan=new çalişan("man","mano","işçi","okul");

        System.out.println("ogrenci1 = " + ogrenci1);
        System.out.println("calişan = " + calişan);


       kişi.kimlikyaz(ogrenci1);
       kişi.kimlikyaz(calişan);


    }
}
