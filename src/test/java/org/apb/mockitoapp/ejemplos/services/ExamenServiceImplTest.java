package org.apb.mockitoapp.ejemplos.services;

import org.apb.mockitoapp.ejemplos.models.Examen;
import org.apb.mockitoapp.ejemplos.repositories.ExamenRepository;
import org.apb.mockitoapp.ejemplos.repositories.ExamenRepositoryTwo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class ExamenServiceImplTest {

    ExamenRepository repository;
    ExamenService service;

  @BeforeEach
  void setUp() {
      repository = mock(ExamenRepositoryTwo.class);
      service = new ExamenServiceImpl(repository);
  }

    @Test
    @DisplayName("Buscando por tema o ID")
    void findExamenPorNombre() {
        List<Examen> datos = Arrays.asList(new Examen(5L, "Matemáticas"),
                new Examen(6L, "Lenguaje"),
                new Examen(7L, "Historia"));
        // Cuando se invoque el metodo del repositorio entonces devolver una lista en este caso la lista "datos"
        when(repository.findAll()).thenReturn(datos);
        Optional<Examen> examen = service.findExamenPorNombre("Matemáticas");

        assertTrue(examen.isPresent());
        assertEquals("Matemáticas",examen.orElseThrow().getNombre());
        assertEquals(5L, examen.get().getId());
    }

    @Test
    @DisplayName("Buscando por lista vacia")
    void findExamenPorNombreEmpty() {

        List<Examen> datos = Collections.emptyList();
        // Cuando se invoque el metodo del repositorio entonces devolver una lista en este caso la lista "datos"
        when(repository.findAll()).thenReturn(datos);
        Optional<Examen> examen = service.findExamenPorNombre("Matemáticas");

        assertFalse(examen.isPresent());

    }
}