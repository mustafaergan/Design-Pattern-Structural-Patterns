package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 09:44
 */
public class Ucgen extends Sekil {


    public Ucgen(Renk renk) {
        super(renk);
    }

    @Override
    public void renkUygula() {
        System.out.println("Ucgen Renk Uygulama İslemi");
        renk.renkUygula();
    }
}
