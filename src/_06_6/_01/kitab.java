package _06_6._01;

public class kitab {
    String nam;
    int publishTarih;
    String autor;

    public kitab(String nam, int publishTarih, String autor){
        this.nam=nam;
        this.publishTarih=publishTarih;
        this.autor=autor;

    }

    @Override
    public String toString() {
        return "kitab{" +
                "nam='" + nam + '\'' +
                ", publishTarih=" + publishTarih +
                ", autor='" + autor + '\'' +
                '}';
    }
}
