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
public class AdminAlbum {
    private ArrayList<Album> albumes;
    private File archivo = null;
    
    public ArrayList<Album> getSongs() {
        return albumes;
    }

    public void setAlbum(Album a) {
        this.albumes.add(a);
    }

    public AdminAlbum(String path) {
        archivo = new File(path);
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdminAlbum{" + "albumes=" + albumes + ", archivo=" + archivo + '}';
    }
    public void cargarArchivoBinario() {
        try {
            albumes = new ArrayList();
            Album temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Album) objeto.readObject()) != null) {
                        albumes.add(temp);
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
            for (Album u : albumes) {
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
