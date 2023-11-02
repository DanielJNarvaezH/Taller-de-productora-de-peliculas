package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Actor extends Persona {
    private final Collection<Pelicula> peliculas;

    public Actor(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad) {
        super(nombre, apellido, fechaNacimiento, nacionalidad);
        this.peliculas = new LinkedList<>();
    }

    public void agregarParticipacion(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public Collection<Pelicula> getPeliculasActor() {
        return Collections.unmodifiableCollection(peliculas);
    }

    @Override
    public String toString() {
        return "Actor:" + super.toString();
    }

}