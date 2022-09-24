package _17_6._02_soru;

public class Tesla extends vehicle implements Ielectrik{
    public Tesla(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBaterry() {
        return "batery degiştir";
    }

    @Override
    public String drive() {
        return "auto pilot ozel suruşu ozelliği var";
    }
}
