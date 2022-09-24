package _09_6.dars;

public class enum1 {
   public enum Aylar{
        OCAK,MART,SUBAT,TEMUS,AGUSTOS
    }

    public static void main(String[] args) {
        Aylar aylar=Aylar.MART;


        for (Aylar a:Aylar.values())
            System.out.println("a= " + a);
    }
}
