package _17_6._02_soru;

public class vehicle {
    private String model;
    private double engine;

    public vehicle(String model, double engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "vehicle{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
