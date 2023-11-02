package co.edu.uniquindio.poo;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Trailer {
    private final Pelicula pelicula;
    private final Collection<Persona> editores;
    private final double duracion;

    public Trailer(Pelicula pelicula, double duracion) {

        ASSERTION.assertion(duracion != 0, "La duración es requerida");
        this.duracion = duracion;
        this.pelicula = pelicula;
        this.editores = new LinkedList<>();
    }

    public Collection<Persona> getEditores() {
        return Collections.unmodifiableCollection(editores);
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public double getDuracion() {
        return duracion;
    }

}