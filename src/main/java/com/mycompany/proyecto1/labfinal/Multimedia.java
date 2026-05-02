package com.mycompany.proyecto1.labfinal;

public abstract class Multimedia {

    private String titulo;
    private int duracion; // EN SEGUNDOS

    public Multimedia(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public abstract void reproducir();
}