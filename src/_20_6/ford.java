package _20_6;

public class ford extends abstract1{
    @Override
    public String getMarka() {
        return "ford";
    }

    @Override
    public int getUretimyili() {
        System.out.println("urtildi yil");
        return super.getUretimyili();
    }
}
