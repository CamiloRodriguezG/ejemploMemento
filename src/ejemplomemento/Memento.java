/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomemento;

/**
 *
 * @author CAMILO
 */
public class Memento {
    
    private String texto;

    public Memento(String texto) {
        this.texto = texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
}
