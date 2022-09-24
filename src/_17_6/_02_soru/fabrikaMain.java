package _17_6._02_soru;

import java.util.ArrayList;

public class fabrikaMain {
    public static void main(String[] args) {
        Tesla teslacar=new Tesla("model5",4.56);

        Toyota toyota=new Toyota("pyrus",1200);

        Bus bus=new Bus("bmw",7000);

        ArrayList<vehicle> arabalar=new ArrayList<>();
        arabalar.add(teslacar);
        arabalar.add(toyota);
        arabalar.add(bus);


        for (vehicle v:arabalar){

            System.out.println(v.getClass().getSimpleName());

            System.out.println("model:"+v.getModel());
            System.out.println("engine:"+v.getEngine());

            if (v instanceof Tesla){
                System.out.println(((Tesla) v).changeBaterry());
                System.out.println(((Tesla)v).drive());
            }
            if (v instanceof Bus){
                System.out.println(((Bus)v).changOil());
                System.out.println(((Bus)v).drive());
            }
            if (v instanceof Toyota){
                System.out.println(((Toyota)v).changDisel());
                System.out.println(((Toyota)v).changeBaterry());
                System.out.println(((Toyota)v).drive());
            }



        }
    }
}
