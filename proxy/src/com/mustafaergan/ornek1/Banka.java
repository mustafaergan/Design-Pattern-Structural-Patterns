package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 16:58
 */
public class Banka implements IBanka {
    public boolean odemeYap(double Tutar) {
        if (Tutar < 100)
            System.out.println("Ödeyeceğiniz tutar 100 TL'den az olamaz. Fark -> { 100 - Tutar }");
        else if (Tutar > 100)
            System.out.println("Ödeyeceğiniz tutar 100 TL'den fazla olamaz. Fark -> { Tutar - 100 }");
        else {
            System.out.println("Ödeme başarıyla gerçekleştirildi. -> { Tutar }");
            return true;
        }
        return false;
    }

}
