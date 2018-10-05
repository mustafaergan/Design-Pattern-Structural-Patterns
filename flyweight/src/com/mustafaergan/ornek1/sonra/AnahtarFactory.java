package com.mustafaergan.ornek1.sonra;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 16:11
 */
public class AnahtarFactory {
    private static Map<String,Anahtar> keyMap = new HashMap();

    public static Anahtar olustur(int i) {
        if (ucunKati(i)) {
            if (keyMap.containsKey("yedininKati")) {
                return keyMap.get("yedininKati");
            } else {
                Anahtar yedininKati = new Anahtar("yedininKati");
                keyMap.put("yedininKati",yedininKati);
                return yedininKati;
            }

        } else if (besinKati(i)) {
            if (keyMap.containsKey("besinKati")) {
                return keyMap.get("besinKati");
            } else {
                Anahtar besinKati = new Anahtar("besinKati");
                keyMap.put("besinKati",besinKati);
                return besinKati;
            }
        } else if (yedininKati(i)) {
            if (keyMap.containsKey("ucunKati")) {
                return keyMap.get("ucunKati");
            } else {
                Anahtar ucunKati = new Anahtar("ucunKati");
                keyMap.put("ucunKati",ucunKati);
                return ucunKati;
            }
        }else{
            return null;
        }
    }

    private static boolean yedininKati(int i) {
        return (i % 7) == 0;
    }

    private static boolean besinKati(int i) {
        return (i % 5) == 0;
    }

    private static boolean ucunKati(int i) {
        return (i % 3) == 0;
    }

}
