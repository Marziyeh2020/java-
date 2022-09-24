package _03_6.dersCredit;

public class soru {
    public static void main(String[] args) {
        //ogrencinin max credisini geçmesin
       lesson lesson=new lesson();
       lesson.dersisimi="matematik";
       lesson.credir=2;

        lesson lesson2=new lesson();
        lesson2.dersisimi="matematik";
        lesson2.credir=4;

        lesson lesson3=new lesson();
        lesson3.dersisimi="matematik";
        lesson3.credir=6;

        student student=new student();
        student.name="iman";
        student.maxcredit=10;

      student.dersekle(lesson);
      student.dersekle(lesson2);
      student.dersekle(lesson3);




    }
}
