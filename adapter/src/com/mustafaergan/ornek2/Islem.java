package com.mustafaergan.ornek2;

/**
 * @author : MustafaERGAN
 * Date: 4.10.2018 16:06
 */
public class Islem {

    public static void main(String[] args) {
        PrizAdapter sockAdapter = new Priz();
        Volt v22 = sockAdapter.get22Volt();
        Volt v120 = sockAdapter.get120Volt();
        System.out.println("v22 volt=" + v22.getDeger());
        System.out.println("v120 volt=" + v120.getDeger());
    }
}

