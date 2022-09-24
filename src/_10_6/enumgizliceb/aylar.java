package _10_6.enumgizliceb;

public enum aylar {
    Ocak(1,31,"ocak"),
    Subat(2,28,"subat"),
    Mart(3,28,"mart"),
    Nisan(4,30,"nisan");

    int ayno;
    int gunmiktari;
    String isim;

    aylar(int ayno, int gunmiktari, String isim) {
        this.ayno = ayno;
        this.gunmiktari = gunmiktari;
        this.isim = isim;
    }
}
