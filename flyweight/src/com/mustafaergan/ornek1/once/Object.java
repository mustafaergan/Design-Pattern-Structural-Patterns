package com.mustafaergan.ornek1.once;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 16:01
 */
public class Object {
    private Anahtar anahtar;;
    private int number;

    public Object(Anahtar anahtar, int number) {
        this.anahtar = anahtar;
        this.number = number;
    }

    public Anahtar getAnahtar() {
        return anahtar;
    }

    public int getNumber() {
        return number;
    }
}