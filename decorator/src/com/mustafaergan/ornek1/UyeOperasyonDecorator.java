package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 14:09
 */
abstract public class UyeOperasyonDecorator implements IUyeOperasyon {

    IUyeOperasyon uyeOperasyon;

    public UyeOperasyonDecorator(IUyeOperasyon uyeOperasyon) {
        this.uyeOperasyon = uyeOperasyon;
    }

    @Override
    public void ekle() {
        uyeOperasyon.ekle();
    }

    @Override
    public void sil() {
        uyeOperasyon.sil();
    }
}
