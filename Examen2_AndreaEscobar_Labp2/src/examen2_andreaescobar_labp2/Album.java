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
public class Album implements Serializable{
    private String nombre;
    private String artista;
    private ArrayList<Canciones> canciones = new ArrayList();
    private static final long SerialVersionUID = 777L;

    public Album(String nombre, String artista, ArrayList<Canciones> canciones) {
        this.nombre = nombre;
        this.artista = artista;
        this.canciones = canciones;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Canciones> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Canciones> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
