package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 14:34
 */
public class KontrolSistemi {

    public boolean uygunluk(String TC) {
        if(TC.length() == 11){
            System.out.println("TC UYGUN");
            return true;
        }else{
            System.out.println("TC UYGUN DEGIL");
            return false;
        }
    }
}
