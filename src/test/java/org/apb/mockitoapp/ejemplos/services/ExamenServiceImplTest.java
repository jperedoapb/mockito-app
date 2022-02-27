package org.apb.mockitoapp.ejemplos.services;

import org.apb.mockitoapp.ejemplos.models.Examen;
import org.apb.mockitoapp.ejemplos.repositories.ExamenRepository;
import org.apb.mockitoapp.ejemplos.repositories.ExamenRepositoryImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ExamenServiceImplTest {

    @Test
    @DisplayName("Buscando por tema o ID")
    void findExamenPorNombre() {
        ExamenRepository repository = new ExamenRepositoryImpl();
        ExamenService service = new ExamenServiceImpl(repository);
        Examen examen = service.findExamenPorNombre("Matemáticas");
        List<Examen> datos = Arrays.asList(new Examen(5L, "Matemáticas"),
                new Examen(6L, "Lenguaje"),
                new Examen(7L, "Historia"));
        assertNotNull(examen);
        assertEquals("Matemáticas",examen.getNombre());
        assertEquals(5L, examen.getId());
    }
}