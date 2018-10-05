package com.mustafaergan.ornek2.urun;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 10:02
 */
public class Radyo implements Urun {

    private boolean acik = false;
    private int ses = 30;
    private int kanal = 1;

    @Override
    public boolean acikMi() {
        return acik;
    }

    @Override
    public void acik() {
        acik = true;
    }

    @Override
    public void kapali() {
        acik = false;
    }

    @Override
    public int hangiKanal() {
        return kanal;
    }

    @Override
    public void hangiKanal(int kanal) {
        this.kanal = kanal;
    }

    @Override
    public int sesMiktari() {
        return ses;
    }

    @Override
    public void sesMikati(int ses) {
        this.ses = ses;
    }

    @Override
    public void bilgiVer() {
        System.out.println("------------------------------------");
        System.out.println("| Radyo:");
        System.out.println("| " + (acik ? "açık" : "kapalı"));
        System.out.println("| Ses Seviyesi" + ses + "%");
        System.out.println("| Kanal " + kanal);
        System.out.println("------------------------------------\n");
    }
}
