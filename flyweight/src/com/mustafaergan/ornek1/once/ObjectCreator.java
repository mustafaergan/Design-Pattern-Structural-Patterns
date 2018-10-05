package com.mustafaergan.ornek1.once;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 16:01
 */
public class ObjectCreator {

    public List createObjects(){
        List objects=new ArrayList();
        for (int i=0;i<10000;i++){
            if(ucunKati(i)){
                Anahtar goldenAnahtar =new Anahtar("yedininKati");
                Object bo =new Object(goldenAnahtar, i);
                objects.add(bo);
            }else if(besinKati(i)){
                Anahtar silverAnahtar =new Anahtar("besinKati");
                Object bo =new Object(silverAnahtar,  i);
                objects.add(bo);
            }else if(yedininKati(i)){
                Anahtar bronzeAnahtar =new Anahtar("ucunKati");
                Object bo =new Object(bronzeAnahtar,  i);
                objects.add(bo);
            }
        }
        return objects;
    }

    private boolean yedininKati(int i) {
        return (i % 7) == 0;
    }

    private boolean besinKati(int i) {
        return (i % 5) == 0;
    }

    private boolean ucunKati(int i) {
        return (i % 3) == 0;
    }


}
