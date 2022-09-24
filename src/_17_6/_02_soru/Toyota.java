package _17_6._02_soru;

public class Toyota extends vehicle implements Ielectrik,Idisel {
    public Toyota(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changDisel() {
        return "disel degiştir";
    }

    @Override
    public String changeBaterry() {
        return "batery değiştir";
    }

    @Override
    public String drive() {
        return" ozell sur";
    }
}
