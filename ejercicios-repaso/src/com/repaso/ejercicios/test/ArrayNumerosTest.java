package com.repaso.ejercicios.test;

import com.repaso.ejercicios.ArrayNumeros;
import org.junit.Assert;
import org.junit.Test;

public class ArrayNumerosTest {

    ArrayNumeros arrayNumeros;

    /*
     * Ejercicio 3
     */
    @Test
    public void estaOrdenadoTest() {
        arrayNumeros = new ArrayNumeros(new int[] { 1, 2, 3, 4 });
        boolean esperado = true;
        boolean obtenido = arrayNumeros.estaOrdenado();
        Assert.assertEquals(esperado, obtenido);
        obtenido = arrayNumeros.estaOrdenado2();
        Assert.assertEquals(esperado, obtenido);
        obtenido = arrayNumeros.estaOrdenado3();
        Assert.assertEquals(esperado, obtenido);

        arrayNumeros = new ArrayNumeros(new int[] { 2, 3, 1, 4 });
        esperado = false;
        obtenido = arrayNumeros.estaOrdenado();
        Assert.assertEquals(esperado, obtenido);
        obtenido = arrayNumeros.estaOrdenado2();
        Assert.assertEquals(esperado, obtenido);
        obtenido = arrayNumeros.estaOrdenado3();
        Assert.assertEquals(esperado, obtenido);
    }

    /*
     * Ejercicio 4
     */
    @Test
    public void sumaPosicionesParesTest() {
        arrayNumeros = new ArrayNumeros(new int[] { 1, 2, 13, 4, 8, 6 });
        int esperado = 22;
        int obtenido = arrayNumeros.sumaPosicionesPares();
        Assert.assertEquals(esperado, obtenido);

        arrayNumeros = new ArrayNumeros(new int[] { 4, 3, 2, 5, 2 });
        esperado = 8;
        obtenido = arrayNumeros.sumaPosicionesPares();
        Assert.assertEquals(esperado, obtenido);
    }

    /*
     * Ejercicio 6
     */
    @Test
    public void crearArregloConAniadidoTest() {
        arrayNumeros = new ArrayNumeros(new int[] { 3, 4, -5, 2, 6, 11 });
        int[] arr = new int[] { 5, 4, 3, 1, -3, 0, 55, -8 };
        int[] esperado = new int[] { -8, -5, -3, 0, 1, 2, 3, 3, 4, 4, 5, 6, 11, 55 };
        int[] obtenido = arrayNumeros.crearArregloConAniadido(arr);
        Assert.assertArrayEquals(esperado, obtenido);
    }

}
