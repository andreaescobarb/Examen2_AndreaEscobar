/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_andreaescobar_labp2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Admin {
    private ArrayList<Usuarios> users;
    private ArrayList<Canciones> songs;
    private File archivo = null;

    public Admin() {
    }

    public ArrayList<Usuarios> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<Usuarios> users) {
        this.users = users;
    }

    public ArrayList<Canciones> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Canciones> songs) {
        this.songs = songs;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setUser(Usuarios u){
        this.users.add(u);
    }
    
    public Admin(String path) {
        archivo = new File(path);
    }
    
    public void cargarArchivoBinario() {
        try {
            users = new ArrayList();
            Usuarios temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Usuarios) objeto.readObject()) != null) {
                        users.add(temp);
                    }
                } catch (EOFException ex) {
                }
                objeto.close();
                //entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivoBinario() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Usuarios u : users) {
                bw.writeObject(u);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
