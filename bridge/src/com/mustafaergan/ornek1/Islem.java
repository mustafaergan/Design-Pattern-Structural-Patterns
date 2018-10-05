package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 09:49
 */
public class Islem {

    public static void main(String [] args){
        Sekil ucgen = new Ucgen(new KirmiziRenk());
        ucgen.renkUygula();

        Sekil besgen = new Besgen(new YesilRenk());
        besgen.renkUygula();

    }

}
