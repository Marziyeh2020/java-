package _17_6._02_soru;

public class Bus extends vehicle implements Igas{
    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changOil() {
        return "her 50 kilometrede oil degiştirman gerek";
    }

    @Override
    public String drive() {
        return "Bus diver";
    }
}
