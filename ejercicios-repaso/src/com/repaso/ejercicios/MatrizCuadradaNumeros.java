package com.repaso.ejercicios;

public class MatrizCuadradaNumeros {

    private int[][] matrizNumeros;
    private int tamanioI = 0;
    private int tamanioJ = 0;

    public MatrizCuadradaNumeros(int[][] matrizNumeros) throws Exception {
        for (int i = 0; i < matrizNumeros.length; i++) {
            if (tamanioJ == 0) {
                tamanioJ = matrizNumeros[i].length;
            } else if (tamanioJ != matrizNumeros[i].length) {
                throw new Exception("No es una matriz cuadrada.");
            }
            tamanioI++;
        }
        if (tamanioI == tamanioJ)
            this.matrizNumeros = matrizNumeros;
        else
            throw new Exception("No es una matriz cuadrada.");
    }

    public int[][] getMatrizNumeros() {
        return matrizNumeros;
    }

    public void setMatrizNumeros(int[][] matrizNumeros) {
        this.matrizNumeros = matrizNumeros;
    }

    /*
     * Ejercicio 5
     */
    public int[][] sumarMatriz(int[][] matriz) throws Exception {
        int tamanioIMatrizIngresada = 0;
        int tamanioJMatrizIngresada = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (tamanioJMatrizIngresada == 0) {
                tamanioJMatrizIngresada = matrizNumeros[i].length;
            } else if (tamanioJMatrizIngresada != matrizNumeros[i].length) {
                throw new Exception("No es una matriz cuadrada.");
            }
            tamanioIMatrizIngresada++;
        }

        if (tamanioIMatrizIngresada != tamanioJMatrizIngresada)
            throw new Exception("No es una matriz cuadrada.");
        if (this.tamanioI == tamanioIMatrizIngresada)
            throw new Exception("No son matrices de mismo tamaño.");

        int[][] matrizSuma = new int[tamanioI][tamanioJ];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizSuma[i][j] = matriz[i][j] + this.matrizNumeros[i][j];
            }
        }

        return matrizSuma;
    }

    /*
     * Ejercicio 8
     */
    public boolean mayoresALaMediaDeDiagonal() {
        float media = obtenerTraza() / tamanioI;

        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[i].length; j++) {
                if (i != j && media >= matrizNumeros[i][j])
                    return false;
            }
        }

        return true;
    }

    private int obtenerTraza() {
        int traza = 0;

        for (int i = 0; i < matrizNumeros.length; i++) {
            traza += matrizNumeros[i][i];
        }

        return traza;
    }

}
