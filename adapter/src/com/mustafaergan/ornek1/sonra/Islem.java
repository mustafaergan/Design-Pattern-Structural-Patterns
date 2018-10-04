
package com.mustafaergan.ornek1.sonra;


public class Islem {

    public static void main(String[] args) {
        Sekil[] sekiller = {new DikdortgenAdapter(new Dikdortgen()),
                            new DogruAdapter(new Dogru())};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;

        for (Sekil sekil : sekiller) {
            sekil.ciz(x1,y1,x2,y2);
        }
    }
}
