package com.preparcial.test;

import com.preparcial.model.Sumo;
import com.preparcial.service.SumoService;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import static org.junit.matchers.JUnitMatchers.hasItems;

public class SumoServiceTest {

    SumoService sumoService;

    @Test
    public void obtenerSumosDesdeArchivoTest() {
        sumoService = new SumoService();

        File file = new File("sumo.in");
        List<Sumo> obtenido = sumoService.obtenerSumosDesdeArchivo(file);

        Assert.assertThat(obtenido, hasItems(
                new Sumo(300, 1500),
                new Sumo(320, 1500),
                new Sumo(299, 1580),
                new Sumo(330, 1690),
                new Sumo(330, 1540),
                new Sumo(339, 1500),
                new Sumo(298, 1700),
                new Sumo(344, 1570),
                new Sumo(276, 1678),
                new Sumo(289, 1499)));
    }

}
