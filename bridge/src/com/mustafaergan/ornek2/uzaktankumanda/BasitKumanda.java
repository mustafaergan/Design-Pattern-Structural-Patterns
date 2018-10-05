package com.mustafaergan.ornek2.uzaktankumanda;

import com.mustafaergan.ornek2.urun.Urun;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 10:16
 */
public class BasitKumanda implements Kumanda {
    
    protected Urun urun;

    public BasitKumanda() {}

    public BasitKumanda(Urun urun) {
        this.urun = urun;
    }

    @Override
    public void guc() {
        System.out.println("Kumanda: kapat");
        if (urun.acikMi()) {
            urun.kapali();
        } else {
            urun.acik();
        }
    }

    @Override
    public void sesAsagi() {
        System.out.println("Kumanda: ses asağı");
        urun.sesMikati(urun.sesMiktari() - 10);
    }

    @Override
    public void sesYukari() {
        System.out.println("Kumanda: ses yukari");
        urun.sesMikati(urun.sesMiktari() + 10);
    }

    @Override
    public void kanalAsagi() {
        System.out.println("Kumanda: aşağı kanal");
        urun.hangiKanal(urun.hangiKanal() - 1);
    }

    @Override
    public void kanalYukari() {
        System.out.println("Kumanda: aşağı yukari");
        urun.hangiKanal(urun.hangiKanal() + 1);
    }
}
