package com.mycompany.proyecto1.labfinal;

public class Labfinal {

    public static void main(String[] args) {

        Cancion cancion1 = new Cancion("Enseñame a Bailar", 212, "Bad Bunny");
        Cancion cancion2 = new Cancion("Perderme Contigo", 205, "Bacilos");
        Cancion cancion3 = new Cancion("Die For You", 260, "The Weeknd");

        Playlist playlist = new Playlist();

        playlist.agregarCancion(cancion1);
        playlist.agregarCancion(cancion2);
        playlist.agregarCancion(cancion3);

        playlist.mostrarPlaylist();
    }
}