package com.mycompany.proyecto1.labfinal;

public class Labfinal {

    public static void main(String[] args) {

        Cancion cancion1 = new Cancion("Enseniame a Bailar", 212, "Bad Bunny");
        Cancion cancion2 = new Cancion("Perderme Contigo", 205, "Bacilos");
        Cancion cancion3 = new Cancion("Die For You", 260, "The Weeknd");

        Playlist playlist = new Playlist();

        playlist.agregarCancion(cancion1);
        playlist.agregarCancion(cancion2);
        playlist.agregarCancion(cancion3);

        playlist.mostrarPlaylist();

        System.out.println("----- SIGUIENTE -----");
        playlist.siguiente();

        System.out.println("----- SIGUIENTE -----");
        playlist.siguiente();

        System.out.println("----- ANTERIOR -----");
        playlist.anterior();

        System.out.println("----- ELIMINAR ACTUAL -----");
        playlist.eliminarActual();

        playlist.mostrarPlaylist();
    }
}