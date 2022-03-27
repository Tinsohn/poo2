package com.repaso.ejercicios.test;

import com.repaso.ejercicios.MatrizCuadradaNumeros;
import org.junit.Assert;
import org.junit.Test;

public class MatrizCuadradaNumerosTest {

    MatrizCuadradaNumeros matrizCuadradaNumeros;

    /*
     * Ejercicio 5
     */
    @Test
    public void sumarMatrizTest() throws Exception {
        matrizCuadradaNumeros = new MatrizCuadradaNumeros(new int[][] { { 2, 4, 6 }, { 1, 3, 5 }, { 7, 8, 9 } });
        int[][] mtz = new int[][] { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
        int[][] esperado = new int[][] { { 3, 5, 7 }, { 2, 4, 6 }, { 8, 9, 10 } };
        int[][] obtenido = matrizCuadradaNumeros.sumarMatriz(mtz);
        Assert.assertArrayEquals(esperado, obtenido);
    }

    /*
     * Ejercicio 8
     */
    @Test
    public void mayoresALaMediaDeDiagonalTest() throws Exception {
        matrizCuadradaNumeros = new MatrizCuadradaNumeros(new int[][] { { 2, 1, 1 }, { 1, 1, 1 }, { 1, 1, 3 } });
        boolean esperado = false;
        boolean obtenido = matrizCuadradaNumeros.mayoresALaMediaDeDiagonal();
        Assert.assertEquals(esperado, obtenido);

        matrizCuadradaNumeros = new MatrizCuadradaNumeros(new int[][] { { 1, 2, 2 }, { 2, 1, 2 }, { 2, 2, 1 } });
        esperado = true;
        obtenido = matrizCuadradaNumeros.mayoresALaMediaDeDiagonal();
        Assert.assertEquals(esperado, obtenido);
    }

}
