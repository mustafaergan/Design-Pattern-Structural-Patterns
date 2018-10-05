package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 15:01
 */
public class Facade {

    KontrolSistemi kontrolSistemi = new KontrolSistemi();
    OperasyonSistemi operasyonSistemi = new OperasyonSistemi();

    public void uyeEkle(String TC) {
        if(kontrolSistemi.uygunluk(TC)){
            operasyonSistemi.kisiyiEkle(TC);
        }
    }

}
