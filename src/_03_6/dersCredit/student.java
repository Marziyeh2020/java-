package _03_6.dersCredit;

import java.util.ArrayList;

public class student {
String name;
int maxcredit;
ArrayList<lesson> dersleri =new ArrayList<>();

public void dersekle(lesson ders){

    int toplamalinankredi=0;
    for (lesson l:dersleri){
        toplamalinankredi+=l.credir;
    }
    System.out.println("toplamalinankredi = " + toplamalinankredi);


    if (toplamalinankredi+ders.credir<=maxcredit)
        dersleri.add(ders);
    else
        System.out.println("alinabilecek ders kredisi aşildi");

}

}
