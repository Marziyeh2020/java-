package _08_6._02;

public class vatandas {

    String isim;
    final int tcno;

     static int tcnosayac=1001;
    public vatandas(String isim) {
        this.isim = isim;
        this.tcno=++tcnosayac;
    }

    @Override
    public String toString() {
        return "vatandas{" +
                "isim='" + isim + '\'' +
                ", tcno=" + tcno +
                '}';
    }
}
