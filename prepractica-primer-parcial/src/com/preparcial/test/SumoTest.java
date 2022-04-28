package com.preparcial.test;

import com.preparcial.model.Sumo;
import junit.framework.Assert;
import org.junit.Test;

public class SumoTest {

    Sumo sumo;

    @Test
    public void dominaATest() {
        sumo = new Sumo(300, 1500);
        boolean esperado = true;
        boolean obtenido = sumo.dominaA(new Sumo(250, 1400));
        Assert.assertEquals(esperado, obtenido);

        obtenido = sumo.dominaA(new Sumo(250, 1500)) ;
        Assert.assertEquals(esperado, obtenido);

        obtenido = sumo.dominaA(new Sumo(300, 1400)) ;
        Assert.assertEquals(esperado, obtenido);

        esperado = false;
        obtenido = sumo.dominaA(new Sumo(300, 1500)) ;
        Assert.assertEquals(esperado, obtenido);

        esperado = false;
        obtenido = sumo.dominaA(new Sumo(400, 1500)) ;
        Assert.assertEquals(esperado, obtenido);

        esperado = false;
        obtenido = sumo.dominaA(new Sumo(300, 1600)) ;
        Assert.assertEquals(esperado, obtenido);

        esperado = false;
        obtenido = sumo.dominaA(new Sumo(400, 1600)) ;
        Assert.assertEquals(esperado, obtenido);
    }

}
