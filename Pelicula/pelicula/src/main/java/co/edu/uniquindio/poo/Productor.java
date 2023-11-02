package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Productor extends Persona {
    private final Collection<Pelicula> peliculas;

    public Productor(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad) {
        super(nombre, apellido, fechaNacimiento, nacionalidad);
        this.peliculas = new LinkedList<>();
    }

    public Collection<Pelicula> getPeliculasProductor() {
        return Collections.unmodifiableCollection(peliculas);
    }
}
