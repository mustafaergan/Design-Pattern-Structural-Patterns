package com.mustafaergan.ornek1;

import java.util.Scanner;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 17:02
 */
public class Islem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kullaniciAdi = "", sifre = "";
        double Tutar = 0;
        while (true) {
            System.out.println("Lütfen kullanıcı adınızı giriniz.");
            kullaniciAdi = sc.nextLine();

            System.out.println("Lütfen şifrenizi giriniz.");
            sifre = sc.nextLine();

            System.out.println("Lütfen ödenecek miktarı giriniz.");
            Tutar = Integer.parseInt(sc.nextLine());

            IBanka banka = new ProxyBanka(kullaniciAdi, sifre);
            banka.odemeYap(Tutar);

            System.out.println("************");
        }
    }
}
