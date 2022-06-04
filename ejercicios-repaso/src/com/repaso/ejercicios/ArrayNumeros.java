package com.repaso.ejercicios;

import java.util.Arrays;

public class ArrayNumeros {

    private int[] numeros;

    public ArrayNumeros(int[] arr) {
        this.numeros = arr;
    }

    public int[] getNumeros() {
        return numeros;
    }

    /*
     * Ejercicio 3
     */
    public boolean estaOrdenado() {
        int numeroAnterior = 0;
        for (int i = 0; i < this.numeros.length; i++) {
            if (i == 0) {
                numeroAnterior = this.numeros[i];
                continue;
            }

            if (numeroAnterior < this.numeros[i]) {
                numeroAnterior = this.numeros[i];
                continue;
            } else {
                return false;
            }
        }

        return true;
    }

    public boolean estaOrdenado2() {
        int[] arrCopia = this.numeros.clone();
        Arrays.sort(arrCopia);
        for (int i = 0; i < arrCopia.length; i++) {
            if (arrCopia[i] != this.numeros[i])
                return false;
        }
        return true;
    }

    public boolean estaOrdenado3() {
        int[] arrCopia = this.numeros.clone();
        Arrays.sort(arrCopia);

        return Arrays.equals(arrCopia, numeros);
    }

    /*
     * Ejercicio 4
     */
    public int sumaPosicionesPares() {
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0)
                suma += numeros[i];
        }

        return suma;
    }

    /*
     * Ejercicio 6
     */
    public int[] crearArregloConAniadido(int[] arr) {
        int[] rta = new int[this.numeros.length + arr.length];

        int[] copiaThis = this.numeros.clone();
        ordenarArreglo(copiaThis);
        ordenarArreglo(arr);

        int i = 0, j = 0, k = -1;

        while (i < copiaThis.length && j < arr.length) {
            k++;
            if (copiaThis[i] < arr[j]) {
                rta[k] = copiaThis[i];
                i++;
            } else {
                rta[k] = arr[j];
                j++;
            }
        }

        while (i < copiaThis.length) {
            k++;
            rta[k] = copiaThis[i];
            i++;
        }

        while (j < arr.length) {
            k++;
            rta[k] = arr[j];
            j++;
        }

        return rta;
    }

    private void ordenarArreglo(int[] arr) {
        boolean ordenado = false;
        int aux;

        while (!ordenado) {
            ordenado = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    aux = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = aux;
                    ordenado = false;
                }
            }
        }
    }

}
