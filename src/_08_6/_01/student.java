package _08_6._01;

import java.util.ArrayList;

public class student {
    int idnumber;
    String name;
    String surname;

     static  int sayac=0;



    public student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.idnumber=++sayac;
    }

    @Override
    public String toString() {
        return "student{" +
                "idnumber"+idnumber+'\''+
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }




}
