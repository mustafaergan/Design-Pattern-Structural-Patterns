package com.mustafaergan.ornek1.sonra;

/**
 * @author : MustafaERGAN
 * Date: 4.10.2018 14:18
 */
public class DikdortgenAdapter implements Sekil {

    private Dikdortgen adaptee;

    public DikdortgenAdapter(Dikdortgen dikdortgen) {
        this.adaptee = dikdortgen;
    }

    @Override
    public void ciz(int x1, int y1, int x2, int y2) {
        int x = Math.min(x1, x2);
        int y = Math.min(y1, y2);
        int en = Math.abs(x2 - x1);
        int boy = Math.abs(y2 - y1);
        adaptee.ciz(x, y, en, boy);
    }

}
