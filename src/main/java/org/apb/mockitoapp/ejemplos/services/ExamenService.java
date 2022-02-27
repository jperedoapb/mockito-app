package org.apb.mockitoapp.ejemplos.services;

import org.apb.mockitoapp.ejemplos.models.Examen;

public interface ExamenService {
    Examen findExamenPorNombre(String nombre);
}
