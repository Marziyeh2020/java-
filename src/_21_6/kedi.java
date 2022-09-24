package _21_6;

public class kedi extends hayvan{
    public kedi(String isim, boolean vahsi, String dogumtarih) {
        super(isim, vahsi, dogumtarih);
    }

    @Override
    void yiyecegi() {
        System.out.println("balik ve mama ");
    }

    @Override
    void yemekmiktari() {
        System.out.println("gınde50 gram");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("gunde 5 saat");
    }

    @Override
    void sesi() {
        System.out.println("miyawwwww");
    }
}
