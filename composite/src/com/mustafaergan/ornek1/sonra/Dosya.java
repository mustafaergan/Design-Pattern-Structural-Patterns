package com.mustafaergan.ornek1.sonra;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 12:46
 */
public class Dosya implements IDosya {

    private String isim;

    public Dosya(String isim) {
        this.isim = isim;
    }

    @Override
    public void bilgiVer(){
        System.out.println("Dosya İsimi : "+ isim);
    }

}
