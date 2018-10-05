package com.mustafaergan.ornek2;

import com.mustafaergan.ornek2.urun.Radyo;
import com.mustafaergan.ornek2.urun.Tv;
import com.mustafaergan.ornek2.urun.Urun;
import com.mustafaergan.ornek2.uzaktankumanda.AkiliKumanda;
import com.mustafaergan.ornek2.uzaktankumanda.BasitKumanda;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 10:43
 */
public class Islem {

    public static void main(String[] args) {
        test(new Tv());
        test(new Radyo());
    }

    public static void test(Urun urun) {
        System.out.println("Test Basit Kumanda.");
        BasitKumanda basitKumanda = new BasitKumanda(urun);
        basitKumanda.guc();
        urun.bilgiVer();

        System.out.println("Test Akıllı Kumanda");
        AkiliKumanda akiliKumanda = new AkiliKumanda(urun);
        akiliKumanda.guc();
        akiliKumanda.sessiz();
        urun.bilgiVer();
    }
}
