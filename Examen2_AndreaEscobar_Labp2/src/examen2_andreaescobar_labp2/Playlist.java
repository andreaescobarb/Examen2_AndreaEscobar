/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_andreaescobar_labp2;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Playlist {
    private Usuarios user;
    private ArrayList<Canciones> playlist = new ArrayList();

    public Playlist(Usuarios user, ArrayList<Canciones> playlist) {
        this.user = user;
        this.playlist = playlist;
    }

    public Usuarios getUser() {
        return user;
    }

    public void setUser(Usuarios user) {
        this.user = user;
    }

    public ArrayList<Canciones> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Canciones> playlist) {
        this.playlist = playlist;
    }

    @Override
    public String toString() {
        return "Playlist{" + "user=" + user + ", playlist=" + playlist + '}';
    }
    
}
