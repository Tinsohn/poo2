package com.repaso.ejercicios;

public class CadenaCaracteres {

    private String cadena;

    public CadenaCaracteres(String cadena) {
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }

    /*
     * Ejercicio 10
     */
    public String getConsonantes() {
        char[] arr = this.cadena.toCharArray();
        int j = 0;
        char[] rta = new char[arr.length];

        for (int i = 0; i < arr.length; i++) {
            char toLower = Character.toLowerCase(arr[i]);
            if (toLower != 'a' && toLower != 'e' && toLower != 'i'
                    && toLower != 'o' && toLower != 'u') {
                rta[j] = arr[i];
                j++;
            }
        }

        return  String.valueOf(rta);
    }

    public String getConsonantes2() {
        return this.cadena.replace("a", "")
                .replace("e", "")
                .replace("i", "")
                .replace("o", "")
                .replace("u", "");
    }

}
