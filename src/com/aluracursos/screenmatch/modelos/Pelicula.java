package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

//Con la palabra reservada extends, hereda los atributos de la clase titulo
public class Pelicula extends Titulo implements Clasificacion {
    private String director;

    //Como se creo un construstor en la clase madre titulo (debe crearse en serie y pelicula)
    public Pelicula(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento); // con super llama al constructor de la madre y le pasa los parametros
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Pelicula: " + this.getNombre() + "(" + getFechaDeLanzamiento() + ")";
    }
}
