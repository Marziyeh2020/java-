package _17_6.soru._16_6;

import _17_6.soru._16_6.Isekil;

public class Daire implements Isekil {
    @Override
    public double alan(double... dizi) {
        return Math.PI*dizi[0];
    }

    @Override
    public double cevre(double... dizi) {
        return Math.PI*dizi[0]*2;
    }
}
