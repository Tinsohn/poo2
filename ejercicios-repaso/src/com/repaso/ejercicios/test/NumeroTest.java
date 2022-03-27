package com.repaso.ejercicios.test;

import com.repaso.ejercicios.Numero;
import org.junit.Assert;
import org.junit.Test;

public class NumeroTest {

    Numero numero;

    /*
     * Ejercicio 1
     */
    @Test
    public void esPrimoTest() throws Exception {
        numero = new Numero(1);
        boolean esperado = false;
        boolean obtenido = numero.esPrimo();
        Assert.assertEquals(esperado, obtenido);

        numero = new Numero(13);
        esperado = true;
        obtenido = numero.esPrimo();
        Assert.assertEquals(esperado, obtenido);

        numero = new Numero(0);
        esperado = false;
        obtenido = numero.esPrimo();
        Assert.assertEquals(esperado, obtenido);

        numero = new Numero(67);
        esperado = true;
        obtenido = numero.esPrimo();
        Assert.assertEquals(esperado, obtenido);

        numero = new Numero(2);
        esperado = true;
        obtenido = numero.esPrimo();
        Assert.assertEquals(esperado, obtenido);
    }

    /*
     * Ejercicio 2
     */
    @Test
    public void sumaMultiplosTest() throws Exception {
        numero = new Numero(10);
        int esperado = 23;
        int obtenido = numero.sumaMultiplos();
        Assert.assertEquals(esperado, obtenido);

        numero = new Numero(16);
        esperado = 60;
        obtenido = numero.sumaMultiplos();
        Assert.assertEquals(esperado, obtenido);
    }

}
