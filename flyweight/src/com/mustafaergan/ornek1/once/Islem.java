package com.mustafaergan.ornek1.once;

import java.util.List;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 16:01
 */
public class Islem {

    public static void main(String[] args) {
        ObjectCreator objectCreator =new ObjectCreator();
        List businessObjects =objectCreator.createObjects();
    }
}
