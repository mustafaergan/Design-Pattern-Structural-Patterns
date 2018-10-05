package com.mustafaergan.ornek1;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 16:59
 */
public class ProxyBanka extends Banka {
    Banka banka;
    boolean Login;
    String kullaniciAdi, sifre;

    public ProxyBanka(String KullaniciAdi, String Sifre) {
        this.kullaniciAdi = KullaniciAdi;
        this.sifre = Sifre;
    }

    boolean girisYap() {
        if (kullaniciAdi.equals("mustafa") && sifre.equals("1234")) {
            banka = new Banka();
            Login = true;
            System.out.println("Hesaba giriş yapıldı.");
            return true;
        } else
            System.out.println("Lütfen kullanıcı adı ve şifreinizi doğru girdiğinize emin olunuz.");

        Login = false;
        return false;
    }

    public boolean odemeYap(double Tutar) {
        girisYap();
        if (!Login) {
            System.out.println("Hesaba giriş yapılmadığından dolayı ödeme alamıyoruz.");
            return false;
        }
        banka.odemeYap(Tutar);
        return true;
    }
}
