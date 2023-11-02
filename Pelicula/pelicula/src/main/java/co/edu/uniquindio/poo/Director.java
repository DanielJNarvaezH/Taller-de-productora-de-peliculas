package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Director extends Persona {
    private final Collection<Pelicula> peliculas;

    public Director(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad) {
        super(nombre, apellido, fechaNacimiento, nacionalidad);
        this.peliculas = new LinkedList<>();
    }

    public Collection<Pelicula> getPeliculasDirector() {
        return Collections.unmodifiableCollection(peliculas);
    }
}