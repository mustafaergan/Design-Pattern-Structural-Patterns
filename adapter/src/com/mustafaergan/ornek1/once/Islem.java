
package com.mustafaergan.ornek1.once;

public class Islem {

    public static void main(String[] args) {
        Object[] sekiller = {new Dogru(), new Dikdortgen()};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        int en = 40, boy = 40;

        for (Object sekil : sekiller) {

            if (sekil.getClass().getSimpleName().equals("Dogru")) {
                ((Dogru) sekil).ciz(x1, x2, y1, y2);
            } else if (sekil.getClass().getSimpleName().equals("Dikdortgen")) {
                ((Dikdortgen) sekil).ciz(x2, y2, en, boy);
            }

        }

    }
}
