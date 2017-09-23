/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_andreaescobar_labp2;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class hilo extends Thread{
    private Canciones can;
    private JLabel lb;

    public hilo(Canciones can, JLabel lb) {
        this.can = can;
        this.lb = lb;
    }

    public Canciones getCan() {
        return can;
    }

    public void setCan(Canciones can) {
        this.can = can;
    }

    public JLabel getLb() {
        return lb;
    }

    public void setLb(JLabel lb) {
        this.lb = lb;
    }
    
    
    @Override
    public void run() {
            lb.setText(can.getDuracion() + "");
            while (can.getDuracion() > 0) {
                can.setDuracion(can.getDuracion() - 1);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException interruptedException) {
                }
                lb.setText(can.getDuracion() + "");
            }
        JOptionPane.showMessageDialog(null, "La cancion ha finalizado");
    }
}
