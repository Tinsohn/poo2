package com.repaso.ejercicios;

public class Numero {

    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    /*
     * Ejercicio 1
     */
    public boolean esPrimo() throws Exception {
        int cantDivisores = 0;

        if (valor < 0)
            throw new Exception("El número no puede ser menor a cero (0)");

        if (this.valor == 0 || this.valor == 1)
            return false;

        for (int i = 2; i <= this.valor; i++) {
            if (this.valor % i == 0)
                cantDivisores++;
        }

        if (cantDivisores > 1)
            return false;

        return true;
    }

    /*
     * Ejercicio 2
     */
    public int sumaMultiplos() throws Exception {
        int rta = 0;

        if (this.valor < 0)
            throw new Exception("El número no puede ser menor a cero (0)");

        for (int i = 0; i < this.valor; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                rta += i;
            }
        }

        return rta;
    }
}
