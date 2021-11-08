package com.example.googlekeepneo;

public class Nota {

    private String contenido,titulo;
    private boolean idea,importante,tarea;

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isIdea() {
        return idea;
    }

    public void setIdea(boolean idea) {
        this.idea = idea;
    }

    public boolean isImportante() {
        return importante;
    }

    public void setImportante(boolean importante) {
        this.importante = importante;
    }

    public boolean isTarea() {
        return tarea;
    }

    public void setTarea(boolean tarea) {
        this.tarea = tarea;
    }
}
