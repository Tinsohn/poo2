package com.repaso.ejercicios.test;

import com.repaso.ejercicios.CadenaCaracteres;
import org.junit.Assert;
import org.junit.Test;

public class CadenaCaracteresTest {

    CadenaCaracteres cadenaCaracteres;

    /*
     * Ejercicio 10
     */
    @Test
    public void getConsonantesTest() {
        cadenaCaracteres = new CadenaCaracteres("Hola mundo");
        String esperado = "Hl mnd";
        String obtenido = cadenaCaracteres.getConsonantes();
        Assert.assertEquals(esperado, obtenido);
    }

}
