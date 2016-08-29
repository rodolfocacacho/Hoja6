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
    private Set<E> conjuntoP;
    private Set<E> conjuntoE;
    private String text;
    
    /* Constructor */
    public Tables(int value){
	conjuntoP = fabrica.setTable(value);
	conjuntoE = fabrica.setTable(value);
	text = "";
    }
    
}
