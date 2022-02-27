package org.apb.mockitoapp.ejemplos.repositories;

import org.apb.mockitoapp.ejemplos.models.Examen;

import java.util.Collections;
import java.util.List;

public class ExamenRepositoryImpl implements ExamenRepository{
    @Override
    public List<Examen> findAll() {
        return Collections.emptyList();
                /*Arrays.asList(new Examen(5L, "Matemáticas"),
                new Examen(6L, "Lenguaje"),
                new Examen(7L, "Historia"));*/
    }
}
