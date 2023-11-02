package co.edu.uniquindio.poo;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.function.Predicate;

public class Productora {
    private final String nombre;
    private final Collection<Persona> participantes;
    private final Collection<Pelicula> peliculas;

    public Productora(String nombre) {

        ASSERTION.assertion(nombre != null && !nombre.isBlank(), "El nombre es requerido");
        this.nombre = nombre;
        this.peliculas = new LinkedList<>();
        this.participantes = new LinkedList<>();

    }

    public Collection<Actor> obtenerActoresDrama() {
        ASSERTION.assertion(!participantes.isEmpty());
        Predicate<Pelicula> condicion = pelicula -> pelicula.getGenero() == Genero.DRAMA;
        return participantes.stream()
                .map(participante -> (Actor) participante)
                .filter((actor) -> actor.getPeliculasActor().stream().anyMatch(condicion))
                .toList();
    }

    public void agregarParticipante(Persona participante) {
        ASSERTION.assertion(participante != null);
        participantes.add(participante);
    }

    public Collection<Persona> getParticipantes() {
        return Collections.unmodifiableCollection(participantes);
    }

    public Collection<Pelicula> getPeliculas() {
        return Collections.unmodifiableCollection(peliculas);
    }

    public String getNombre() {
        return nombre;
    }

}
