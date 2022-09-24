package _17_6.soru._16_6;

import _17_6.soru._16_6.Isekil;

public class Dikdortgen implements Isekil {
    @Override
    public double alan(double... dizi) {
        return  dizi[0]*dizi[1];
    }

    @Override
    public double cevre(double... dizi) {
        return (dizi[0]+dizi[1])*2;
    }
}
