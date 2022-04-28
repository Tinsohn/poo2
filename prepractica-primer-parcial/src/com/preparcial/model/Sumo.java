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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sumo sumo = (Sumo) o;

        if (Double.compare(sumo.peso, peso) != 0) return false;
        return Double.compare(sumo.altura, altura) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(peso);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(altura);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
