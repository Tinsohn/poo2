package com.preparcial.service;

import com.preparcial.model.Sumo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SumoService {

    public List<Sumo> obtenerSumosDesdeArchivo(File archivo) {
        List<Sumo> sumos = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            boolean flag = false;
            while ((linea = br.readLine()) != null) {
                if (!flag) {
                    flag = true;
                    continue;
                }
                String[] pesoAltura = linea.split(" ");
                Sumo sumo = new Sumo();
                sumo.setPeso(Double.parseDouble(pesoAltura[0]));
                sumo.setAltura(Double.parseDouble(pesoAltura[1]));
                sumos.add(sumo);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return sumos;
    }

    public void generarArchivoDominancias(List<Sumo> sumos) {
        int[] dominancias = this.obtenerDominancias(sumos);
        // TODO
        try {
            File file = new File("sumo.out");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < dominancias.length; i++) {
                System.out.println(dominancias[i]);
                bw.write(dominancias[i] + "\n");
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int[] obtenerDominancias(List<Sumo> sumos) {
        int[] dominancias = new int[sumos.size()];

        for (int i = 1; i < sumos.size(); i++) {
            for (int j = i; j < sumos.size(); j++) {
                Sumo sumo = sumos.get(i - 1);
                Sumo contrincante = sumos.get(j);
                if (sumo.dominaA(contrincante)) {
                    dominancias[i - 1]++;
                } else if (contrincante.dominaA(sumo)) {
                    dominancias[j]++;
                }
            }
        }

        return dominancias;
    }

}
