package com.aluracursos.screenmatch.modelos;

//Una clase es una estructura que define un tipo de objeto (com.aluracursos.screenmatch.modelos.Titulo)
public class Titulo {
    //Características (Atributos)
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    //Setters métodos que establecen un nuevo valor para un atributo
    public void setNombre(String nombre) {
        this.nombre = nombre; //this. que se refiere al atributo de la clase pelicula / valor que el usuario ingresa
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    //Getters métodos que devuelven el valor actual de un atributo
    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public int getTotalDeLasEvaluaciones() {
        return totalDeLasEvaluaciones;
    }

    //Comportamientos (Métodos)
    public void muestraFichaTecnica() {
        System.out.println("El nombre de mi pelicula es: " + nombre);
        System.out.println("su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos es: " + getDuracionEnMinutos());
    }

    public void evalua(double nota) {
        sumaDeLasEvaluaciones += nota;
        //sumaDeLasEvaluaciones = sumaDeLasEvaluaciones + nota;
        totalDeLasEvaluaciones++;
    }

    public double calculaMedia() {
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }
}
