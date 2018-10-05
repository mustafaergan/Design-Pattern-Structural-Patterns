package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 14:12
 */
public class Islem {

    public static void main(String[] args) {
        UyeOperasyonu uyeOperasyonu = new UyeOperasyonu();

        UyeMesajOperasyonu uyeMesajOperasyonu = new UyeMesajOperasyonu(uyeOperasyonu);

        uyeMesajOperasyonu.ekle();

        uyeMesajOperasyonu.MesajGonder("Selamlar");

    }
}
