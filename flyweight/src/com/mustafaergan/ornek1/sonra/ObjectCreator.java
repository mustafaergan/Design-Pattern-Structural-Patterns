package com.mustafaergan.ornek1.sonra;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : MustafaERGAN
 * Date: 5.10.2018 16:01
 */
public class ObjectCreator {

    public List createObjects(){
        List objects=new ArrayList();
        for (int i=0;i<500000;i++){
            Object bo =new Object(AnahtarFactory.olustur(i), i);
            objects.add(bo);
        }
        return objects;
    }

}
