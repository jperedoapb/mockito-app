package org.apb.mockitoapp.ejemplos.services;

import org.apb.mockitoapp.ejemplos.models.Examen;
import org.apb.mockitoapp.ejemplos.repositories.ExamenRepository;

import java.util.Optional;

public class ExamenServiceImpl implements ExamenService{

    private ExamenRepository examenRepository;

    public ExamenServiceImpl(ExamenRepository examenRepository) {
        this.examenRepository = examenRepository;
    }

    @Override
    public Examen findExamenPorNombre(String nombre) {
        Optional<Examen> examenOptional = examenRepository.findAll()
                .stream()
                .filter(f -> f.getNombre().contains(nombre)).findFirst();
        Examen examen = null;
        if (examenOptional.isPresent()){
            examen = examenOptional.orElseThrow();
        }
        return examen;
    }
}
