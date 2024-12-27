package com.aluracursos.screenmatch.modelos;

//Con la palabra reservada extends, hereda los atributos de la clase titulo
public class Pelicula extends Titulo {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
