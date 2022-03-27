package com.repaso.ejercicios.test;

import com.repaso.ejercicios.Senial;
import org.junit.Assert;
import org.junit.Test;

public class SenialTest {

    Senial senial;

    /*
     * Ejercicio 9
     */
    @Test
    public void aplicarFiltroPasaBandaTest() throws Exception {
        senial = new Senial(new int[] { 5656, 0, 33, 2345, 5432, 7563 });
        int[] esperado = new int[] { 5656, 5432 };
        int[] obtenido = senial.aplicarFiltroPasaBanda(5000, 6000);
        Assert.assertArrayEquals(esperado, obtenido);

        esperado = new int[] { 33, 2345, 5432 };
        obtenido = senial.aplicarFiltroPasaBanda(0, 5500);
        Assert.assertArrayEquals(esperado, obtenido);
    }

}
