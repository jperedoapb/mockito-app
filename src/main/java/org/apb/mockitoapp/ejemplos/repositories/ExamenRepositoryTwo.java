package org.apb.mockitoapp.ejemplos.repositories;

import org.apb.mockitoapp.ejemplos.models.Examen;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExamenRepositoryTwo implements ExamenRepository{

    @Override
    public List<Examen> findAll() {
        try {
            System.out.println(" Probando que Mockito no viene por acá");
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
