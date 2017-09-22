/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_andreaescobar_labp2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Usuarios implements Serializable {

    private String username;
    private String nombre;
    private String edad;
    private String password;
    private ArrayList<Playlist> playlist;
    private ArrayList<Canciones> fav;
    private static final long SerialVersionUID = 777L;

    public Usuarios(String username, String nombre, String edad, String password, ArrayList<Playlist> playlist, ArrayList<Canciones> fav) {
        this.username = username;
        this.nombre = nombre;
        this.edad = edad;
        this.password = password;
        this.playlist = playlist;
        this.fav = fav;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Playlist> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Playlist> playlist) {
        this.playlist = playlist;
    }

    public ArrayList<Canciones> getFav() {
        return fav;
    }

    public void setFav(ArrayList<Canciones> fav) {
        this.fav = fav;
    }

    @Override
    public String toString() {
        return "Username: " + username + ", Nombre: " + nombre;
    }

}
