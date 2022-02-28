package org.apb.mockitoapp.ejemplos.services;

import org.apb.mockitoapp.ejemplos.models.Examen;

import java.util.Optional;

public interface ExamenService {
    Optional<Examen> findExamenPorNombre(String nombre);
    Examen findExamenPorNombreConPreguntas(String nombre);
}
