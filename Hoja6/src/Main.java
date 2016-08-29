
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Olivet
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Bienvenido al programa");
        System.out.println();
        int x = 0;
        //Hacer loop para progra defensiva
        while (x == 0){
        System.out.println("Elija el numero de implementacion SET a utilizar: ");
        System.out.println("1.HashSet");
        System.out.println("2.TreeSet");
        System.out.println("3.LinkedHashSet");
        Scanner keyboard = new Scanner(System.in);
        try{
			    x = Integer.parseInt(keyboard.nextLine());
		    } catch (NumberFormatException e){
			    System.out.println();
			    System.out.println("Error: opcion invalida, intentelo de nuevo.");
			    System.out.println();
			    x = 0;
		    }
        if (x < 1 || x > 3)
            x = 0;
        }
        if (x == 1)
            //Factory de HASHSET
        if (x == 2)
            //Factory de TREESET
        if (x == 3)
            //Factory de LINKEDHASHSET
        
    }
}
