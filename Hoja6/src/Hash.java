import java.util.Set;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodolfo Cacacho/Rene Olivet
 */
public class Hash<E> {
    Factory fabrica = new Factory();
    /* Conjuntos que se utilizaran */
    private Set<E> conjuntoPrincipal;
    private Set<E> conjuntoResultado;
    
    /* Constructor */
    public Hash(int value){
	conjuntoPrincipal = fabrica.setInterfaz(value);
        conjuntoResultado = fabrica.setInterfaz(value);
    }
    public void add(E name){
        conjuntoPrincipal.add(name);
    }
    public Set<E> getConjunto(){
        return conjuntoPrincipal;
    }
    
    public Set<E> interseccionTresConjuntos(Set<E> conjuntoB, Set<E> conjuntoC){
        
        conjuntoResultado.clear();
        conjuntoResultado.addAll(conjuntoPrincipal);
        conjuntoResultado.retainAll(conjuntoB);
        conjuntoResultado.retainAll(conjuntoC);
        return conjuntoResultado;
    }
    
    public Set<E> interseccionDosConjuntos(Set<E> conjuntoB){
        
        conjuntoResultado.clear();
        conjuntoResultado.addAll(conjuntoPrincipal);
        conjuntoResultado.retainAll(conjuntoB);
        return conjuntoResultado;
    }
    
    public Set<E> unionDosConjuntos(Set<E> conjuntoB){
        
        conjuntoResultado.clear();
        conjuntoResultado.addAll(conjuntoPrincipal);
        conjuntoResultado.addAll(conjuntoB);
        return conjuntoResultado;
    }
    
    public Set<E> restaDosConjuntos(Set<E> conjuntoB){
    
        conjuntoResultado.clear();
        conjuntoResultado.addAll(conjuntoPrincipal);
        conjuntoResultado.removeAll(conjuntoB);
        return conjuntoResultado;
    
    }
    
    public int cantElementos(){
        
        int a = conjuntoPrincipal.size();
        return a;
    }
    
    public Object[] elementos(){
        
        Object[] elementos;
        elementos = conjuntoPrincipal.toArray();
        
        return elementos;
        
    }
    
    public Set<E> CopiarResultado(){
    
        return conjuntoResultado;
    }
    
}
