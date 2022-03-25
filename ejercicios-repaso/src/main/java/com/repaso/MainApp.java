package main.java.com.repaso;

import main.java.com.repaso.ejercicios.ArrayNumeros;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {
        ArrayNumeros arrayNumeros = new ArrayNumeros(new int[] {3, 4, -5, 2, 6, 11});

        int[] rta = arrayNumeros.crearArregloConAniadido(new int[] {5, 4, 3, 1, -3, 0, 55, -8});

        System.out.println(Arrays.toString(rta));
    }
}
