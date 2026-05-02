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

    public NodoDoble getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoDoble cabeza) {
        this.cabeza = cabeza;
    }

    public NodoDoble getCola() {
        return cola;
    }

    public void setCola(NodoDoble cola) {
        this.cola = cola;
    }

    public NodoDoble getActual() {
        return actual;
    }

    public void setActual(NodoDoble actual) {
        this.actual = actual;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
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

    public Cancion siguiente() {
        if (actual == null) {
            return null;
        }

        if (actual.getSiguiente() == null) {
            return null;
        }

        actual = actual.getSiguiente();
        actual.getDato().reproducir();
        return actual.getDato();
    }

    public Cancion anterior() {
        if (actual == null) {
            return null;
        }

        if (actual.getAnterior() == null) {
            return null;
        }

        actual = actual.getAnterior();
        actual.getDato().reproducir();
        return actual.getDato();
    }

    public void eliminarActual() {
        if (actual == null) {
            System.out.println("No hay cancion actual para eliminar.");
            return;
        }

        NodoDoble nodoEliminar = actual;

        if (cabeza == cola) {
            cabeza = null;
            cola = null;
            actual = null;
        } else if (nodoEliminar == cabeza) {
            cabeza = cabeza.getSiguiente();
            cabeza.setAnterior(null);
            actual = cabeza;
        } else if (nodoEliminar == cola) {
            cola = cola.getAnterior();
            cola.setSiguiente(null);
            actual = cola;
        } else {
            NodoDoble anteriorNodo = nodoEliminar.getAnterior();
            NodoDoble siguienteNodo = nodoEliminar.getSiguiente();

            anteriorNodo.setSiguiente(siguienteNodo);
            siguienteNodo.setAnterior(anteriorNodo);

            actual = siguienteNodo;
        }

        tamanio--;

        System.out.println("Cancion eliminada: " + nodoEliminar.getDato().getTitulo());
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