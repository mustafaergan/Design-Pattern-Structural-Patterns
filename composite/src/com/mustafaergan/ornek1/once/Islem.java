package com.mustafaergan.ornek1.once;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 12:50
 */
public class Islem {
    public static void main(String[] args) {
        Dizin ses = new Dizin("ses");
        Dizin film = new Dizin("film");

        Dosya sarki = new Dosya("Bendeki Aşıkı Heves Mi Sandın.mp3");
        Dosya filmKomik = new Dosya("Komik Videolar.mp4");

        ses.ekle(sarki);
        film.ekle(filmKomik);

        film.ekle(ses);

        film.bilgiVer();


    }
}
