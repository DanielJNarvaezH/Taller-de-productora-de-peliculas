package co.edu.uniquindio.poo;

import static co.edu.uniquindio.poo.util.AssertionUtil.ASSERTION;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Pelicula {
    private final String titulo;
    private final String sinopsis;
    private final LocalDate anio;
    private final Genero genero;
    private final String pais;
    private final Collection<Trailer> trailers;
    private final Collection<Actor> actores;
    private final Collection<Director> directores;
    private final Collection<Guionista> guionistas;
    private final Collection<Productor> productores;

    public Pelicula(String titulo, String sinopsis, LocalDate anio, Genero genero, String pais) {

        ASSERTION.assertion(titulo != null && !titulo.isBlank(), "El título es requerido");
        ASSERTION.assertion(sinopsis != null && !sinopsis.isBlank(), "La sinopsis es requerida");
        ASSERTION.assertion(anio != null, "El año es requerido");
        ASSERTION.assertion(genero != null, "El género es requerido");
        ASSERTION.assertion(pais != null && !pais.isBlank(), "El país es requerido");
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.anio = anio;
        this.genero = genero;
        this.pais = pais;
        this.trailers = new LinkedList<>();
        this.actores = new LinkedList<>();
        this.directores = new LinkedList<>();
        this.guionistas = new LinkedList<>();
        this.productores = new LinkedList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public LocalDate getAnio() {
        return anio;
    }

    public Genero getGenero() {
        return genero;
    }

    public String getPais() {
        return pais;
    }

    public Collection<Trailer> getTrailers() {
        return Collections.unmodifiableCollection(trailers);
    }

    public Collection<Actor> getActores() {
        return Collections.unmodifiableCollection(actores);
    }

    public Collection<Director> getDirectores() {
        return Collections.unmodifiableCollection(directores);
    }

    public Collection<Guionista> getGuionistas() {
        return Collections.unmodifiableCollection(guionistas);
    }

    public Collection<Productor> getProductor() {
        return Collections.unmodifiableCollection(productores);
    }

}
