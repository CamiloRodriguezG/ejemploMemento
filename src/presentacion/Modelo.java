/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import ejemplomemento.Cuidador;
import ejemplomemento.Texto;
import javax.swing.JFrame;

/**
 *
 * @author CAMILO
 */
public class Modelo {
    
    private Vista vista;
    private Cuidador cuidador;
    private Texto texto;
    
    public Modelo(){
        texto = new Texto("Hola que tal");
        cuidador = new Cuidador(texto);
    }

    public Vista getVista() {
        if(this.vista == null){
            vista = new Vista(this);
        }
        return vista;
    }

    public Cuidador getCuidador() {
        return cuidador;
    }

    public String getTexto() {
        return texto.getTexto();
    }
    
    public void iniciar(){
        this.getVista().setSize(450, 200);
        this.getVista().setVisible(true);
/*        this.getVista().setResizable(false);*/
        this.getVista().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    
}
