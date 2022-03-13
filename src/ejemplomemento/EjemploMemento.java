/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomemento;

import presentacion.Modelo;

/**
 *
 * @author CAMILO
 */
public class EjemploMemento {
    
    private Modelo modelo;
    
    public EjemploMemento(){
        this.modelo = new Modelo();
        modelo.iniciar();
    }
    
    public static void main(String[] args) {
       new EjemploMemento();
    }
    
}
