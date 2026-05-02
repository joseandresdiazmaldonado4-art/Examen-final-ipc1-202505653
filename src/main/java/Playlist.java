package com.mycompany.proyecto1.labfinal;

public class Playlist {

    private NodoDoble cabeza;
    private NodoDoble cola;
    private NodoDoble actual;
    private int tamanio;

    public Playlist() {
        this.cabeza = null;
        this.cola = null;
        this.actual = null;
        this.tamanio = 0;
    }

    public void agregarCancion(Cancion c) {
        NodoDoble nuevo = new NodoDoble(c);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            actual = nuevo;
        } else {
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
        }

        tamanio++;
    }

    public void mostrarPlaylist() {
        NodoDoble auxiliar = cabeza;

        System.out.println("----- PLAYLIST COMPLETA -----");

        if (auxiliar == null) {
            System.out.println("La playlist esta vacia.");
            return;
        }

        while (auxiliar != null) {
            auxiliar.getDato().reproducir();
            auxiliar = auxiliar.getSiguiente();
        }

        System.out.println("Total de canciones: " + tamanio);
    }
}