package com.mustafaergan.ornek2;

/**
 * @author : MustafaERGAN
 * Date: 4.10.2018 15:59
 */
public class Priz implements PrizAdapter {

    public Volt getVolt(){
        return new Volt(220);
    }

    @Override
    public Volt get220Volt() {
        return getVolt();
    }

    @Override
    public Volt get120Volt() {
        return donusturVolt(2);
    }

    @Override
    public Volt get22Volt() {
        return donusturVolt(10);
    }

    private Volt donusturVolt(int i) {
        return new Volt(getVolt().getDeger()/i);
    }

}
