package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 14:11
 */
public class UyeMesajOperasyonu extends UyeOperasyonDecorator {

    public UyeMesajOperasyonu(IUyeOperasyon uyeOperasyon) {
        super(uyeOperasyon);
    }

    public void MesajGonder(String mesaj) {
        System.out.println("Mesaj Gönderildi Mesaj:" + mesaj);
    }
}
