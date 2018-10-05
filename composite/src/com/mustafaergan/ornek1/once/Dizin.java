package com.mustafaergan.ornek1.once;

import java.util.ArrayList;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 12:47
 */
public class Dizin {

    private String isim;
    private ArrayList dosyalar = new ArrayList();

    public Dizin(String isim) {
        this.isim = isim;
    }

    public void ekle(Object obj) {
        dosyalar.add(obj);
    }


    public void bilgiVer(){
        System.out.println("Dizin İsimi : "+ isim);
        for (Object obj : dosyalar) {
            if (obj instanceof Dizin) {
                ((Dizin)obj).bilgiVer();
            } else {
                ((Dosya)obj).bilgiVer();
            }
        }

    }

}
