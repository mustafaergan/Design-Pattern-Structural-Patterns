package com.mustafaergan.ornek1.sonra;

import java.util.ArrayList;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 12:47
 */
public class Dizin implements IDosya {

    private String isim;
    private ArrayList dosyalar = new ArrayList();

    public Dizin(String isim) {
        this.isim = isim;
    }

    public void ekle(Object obj) {
        dosyalar.add(obj);
    }


    @Override
    public void bilgiVer(){
        System.out.println("Dizin İsimi : "+ isim);
        for (Object obj : dosyalar) {
            IDosya o = (IDosya) obj;
            o.bilgiVer();
        }

    }

}
