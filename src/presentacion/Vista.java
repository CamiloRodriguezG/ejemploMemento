/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author CAMILO
 */
public class Vista extends JFrame implements ActionListener{
    
    private JPanel panelBotones;
    private JPanel panelTexto;
    private JTextField texto;
    private JButton botonGuardar;
    private JButton botonRestaurar;
    
    private Modelo modelo;
    private Controlador controlador;

    public Vista(Modelo m){
        this.modelo = m;
        
        this.panelTexto = new JPanel();
        this.panelBotones = new JPanel();
        this.texto = new JTextField();
        this.texto.setBounds(10, 100, 200, 50);
        this.botonGuardar = new JButton("Guardar");
        this.botonRestaurar = new JButton("Restaurar");
        
        this.panelTexto.add(texto);
        this.panelBotones.add(botonGuardar);
        this.panelBotones.add(botonRestaurar);
        
        this.getContentPane().add(texto);
        this.getContentPane().add(panelBotones);
        this.pack();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
