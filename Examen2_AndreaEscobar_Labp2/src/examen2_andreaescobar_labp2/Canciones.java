/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_andreaescobar_labp2;

import java.io.Serializable;
import javax.swing.JLabel;

/**
 *
 * @author andre
 */
public class Canciones extends Thread implements Serializable {

    private String nombre;
    private String artista;
    private int duracion;
    private static final long SerialVersionUID = 777L;

    public Canciones(String nombre, String artista, int duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", artista=" + artista;
    }



}
