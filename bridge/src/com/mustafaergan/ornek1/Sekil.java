package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 09:43
 */
public abstract class Sekil {

    protected Renk renk;

    public Sekil(Renk renk) {
        this.renk = renk;
    }

    abstract public void renkUygula();
}
