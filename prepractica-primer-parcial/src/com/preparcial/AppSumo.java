package com.preparcial;

import com.preparcial.model.Sumo;
import com.preparcial.service.SumoService;

import java.io.File;
import java.util.List;

public class AppSumo {

    public static void main(String[] args) {
        execute();
    }

    private static void execute() {
        SumoService sumoService = new SumoService();

        File archivo = new File("sumo.in");
        List<Sumo> sumos = sumoService.obtenerSumosDesdeArchivo(archivo);
        sumoService.generarArchivoDominancias(sumos);
    }

}
