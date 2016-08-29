import java.util.Set;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Olivet
 */
public class Metodos<E> {
    Factory fabrica = new Factory();
    /* Conjuntos que se utilizaran */
    private Set<E> conjunto;
    
    /* Constructor */
    public Metodos(int value){
	conjunto = fabrica.setInterfaz(value);
    }
    public void add(E name){
        conjunto.add(name);
    }
    public E get(){
        conjunto.
    }
    
}
