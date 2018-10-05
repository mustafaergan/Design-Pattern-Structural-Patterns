package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 14:08
 */
public class UyeOperasyonu implements IUyeOperasyon {
    @Override
    public void ekle() {
        System.out.println("Üye Ekledi");
    }

    @Override
    public void sil() {
        System.out.println("Üye Silindi");
    }
}
