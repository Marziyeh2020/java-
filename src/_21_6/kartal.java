package _21_6;

public class kartal extends hayvan {
    public kartal(String isim, boolean vahsi, String dogumtarih) {
        super(isim, vahsi, dogumtarih);
    }

    @Override
    void yiyecegi() {
        System.out.println("et yer");
    }

    @Override
    void yemekmiktari() {
        System.out.println("gunde bir tane tavşan");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("2 saat");
    }

    @Override
    void sesi() {
        System.out.println("ses yokkkkkkkk");
    }
}
