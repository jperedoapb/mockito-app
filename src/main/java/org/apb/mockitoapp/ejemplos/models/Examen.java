package org.apb.mockitoapp.ejemplos.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Examen {
    private Long id;
    private String nombre;
    private List<String> preguntas;

    /* Esto es necesario porque debemos inicializar la instancia del atributo "preguntas"
       crear la instancia de un ArrayList, porque si no va ser un Null y va lanzar algún error típico
       un NUll pointer execption
    */
    public Examen(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.preguntas = new ArrayList<>();
    }
}
