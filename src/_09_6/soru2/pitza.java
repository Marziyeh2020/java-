package _09_6.soru2;

public class pitza
{
    double price;
    size pizasize;

    public pitza(size pizasize) {
        this.pizasize = pizasize;
    }

    @Override
    public String toString() {
        return "pitza{" +
                "pizasize=" + pizasize +
                '}';
    }
}
