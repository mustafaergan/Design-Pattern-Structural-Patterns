package com.mustafaergan.ornek1.sonra;

/**
 * @author : MustafaERGAN
 * Date: 4.10.2018 14:18
 */
public class DogruAdapter implements Sekil {

    private Dogru adaptee;

    public DogruAdapter(Dogru dogru) {
        this.adaptee = dogru;
    }

    public void ciz(int x1, int x2, int y1, int y2) {
        System.out.println(
                "Nokta A("+x1+","+y1+") "
                +" Nokta  B("+x2+","+y2+")"
        );
    }



}
