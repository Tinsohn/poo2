package com.repaso.ejercicios;

public class Senial {

    private int[] senialAudio;
    private static final int VALOR_INFERIOR_PERMITIDO = 0;
    private static final int VALOR_SUPERIOR_PERMITIDO = 65536;

    public Senial(int[] senialAudio) throws Exception {
        for (int tono : senialAudio) {
            if (tono < VALOR_INFERIOR_PERMITIDO || tono > VALOR_SUPERIOR_PERMITIDO)
                throw new Exception("Los valores de la señal no pueden ser menores a " + VALOR_INFERIOR_PERMITIDO
                        + " o mayores a " + VALOR_SUPERIOR_PERMITIDO);
        }
        this.senialAudio = senialAudio;
    }

    public int[] getSenialAudio() {
        return senialAudio;
    }

    public void setSenialAudio(int[] senialAudio) {
        this.senialAudio = senialAudio;
    }

    /*
     * Ejercicio 9
     */
    public int[] aplicarFiltroPasaBanda(int tonoInferior, int tonoSuperior) throws Exception {
        int[] copiaSenial = this.senialAudio.clone();

        if (tonoInferior < VALOR_INFERIOR_PERMITIDO || tonoSuperior > VALOR_SUPERIOR_PERMITIDO)
            throw new Exception("Los valores de la señal no pueden ser menores a " + VALOR_INFERIOR_PERMITIDO
                    + " o mayores a " + VALOR_SUPERIOR_PERMITIDO);

        int contTonosFiltrados = this.filtrar(copiaSenial, tonoInferior, tonoSuperior);

        return this.compactar(copiaSenial, contTonosFiltrados);
    }

    private int filtrar(int[] senial, int tonoInferior, int tonoSuperior) {
        int contTonosFiltrados = 0;
        for (int i = 0; i < senial.length; i++) {
            if (senial[i] < tonoInferior || senial[i] > tonoSuperior) {
                senial[i] = 0;
                contTonosFiltrados++;
            } else if (senial[i] == 0) {
                // lo cuento para para poder descartarlo en el tamaño del array que se retornara
                // al compactar
                contTonosFiltrados++;
            }
        }
        return contTonosFiltrados;
    }

    private int[] compactar(int[] senial, int contTonosFiltrados) {
        int[] rta = new int[senial.length - contTonosFiltrados];
        int j = 0;

        for (int i = 0; i < senial.length; i++) {
            if (senial[i] != 0) {
                rta[j] = senial[i];
                j++;
            }
        }

        return rta;
    }

}
