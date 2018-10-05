package com.mustafaergan.ornek1.once;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 12:46
 */
public class Dosya {

    private String isim;


    public Dosya(String isim) {
        this.isim = isim;
    }

    public void bilgiVer(){
        System.out.println("Dosya İsimi : "+ isim);
    }

}
