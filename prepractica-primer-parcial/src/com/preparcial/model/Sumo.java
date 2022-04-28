package com.preparcial.model;

public class Sumo {

    private double peso;
    private double altura;

    public Sumo(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public Sumo() {
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean dominaA(Sumo contrincante) {
        if (this.peso > contrincante.getPeso()
                && this.altura > contrincante.getAltura()) {
            return true;
        } else if ((this.peso == contrincante.getPeso()
                && this.altura > contrincante.getAltura())
                || (this.peso > contrincante.getPeso()
                && this.altura == contrincante.getAltura())) {
            return true;
        }

        return false;
    }

}
