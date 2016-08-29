
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Olivet
 * @param <E>
 */
public class Factory<E> {
    public Set<E> setInterfaz(int x){
        Set<E> lista = null;
        if (x == 1)
            lista = new HashSet();
        if (x == 2)
            lista = new TreeSet();
        if (x == 3)
            lista = new LinkedHashSet();
        return lista;
    }
}
