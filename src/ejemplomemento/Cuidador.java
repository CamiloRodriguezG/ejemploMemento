/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomemento;

import java.util.ArrayList;

/**
 *
 * @author CAMILO
 */
public class Cuidador {
    
    ArrayList<Memento> mementos = new ArrayList<Memento>();
    Texto texto;

    public Cuidador(Texto t) {
        this.texto= t;
    }
    
    public void guardarMemento(){
        mementos.add(texto.createMemento());
    }
    
    public void restaurarMemento(){
        int size = mementos.size();
        this.texto.setMemento(mementos.get(size-1));
    }
    
}
