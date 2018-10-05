package com.mustafaergan.ornek2.uzaktankumanda;

import com.mustafaergan.ornek2.urun.Urun;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 10:16
 */
public class AkiliKumanda extends BasitKumanda  {

    public AkiliKumanda(Urun urun) {
        super.urun = urun;
    }

    public void sessiz() {
        System.out.println("Kumanda: Sessiz");
        urun.sesMikati(0);
    }
}
