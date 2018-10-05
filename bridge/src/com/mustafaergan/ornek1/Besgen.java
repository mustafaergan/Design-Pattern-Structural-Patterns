package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 09:46
 */
public class Besgen extends Sekil {

    public Besgen(Renk renk) {
        super(renk);
    }

    @Override
    public void renkUygula() {
        System.out.println("Besgen Renk Uygulama İslemi");
        renk.renkUygula();
    }
}
