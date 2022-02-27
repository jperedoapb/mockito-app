package org.apb.mockitoapp.ejemplos.repositories;

import org.apb.mockitoapp.ejemplos.models.Examen;

import java.util.List;

public interface ExamenRepository {
    List<Examen> findAll();
}
