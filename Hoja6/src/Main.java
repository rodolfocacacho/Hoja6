
import java.util.Scanner;
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
public class Main{
    public static void main(String[] args){
        System.out.println("Bienvenido al programa");
        System.out.println();
        int x = 0;
        Scanner keyboard = new Scanner(System.in);
        //Hacer loop para progra defensiva
        while (x == 0){
            System.out.println("Elija el numero de implementacion SET a utilizar: ");
            System.out.println("1.HashSet");
            System.out.println("2.TreeSet");
            System.out.println("3.LinkedHashSet");
            try{
                x = Integer.parseInt(keyboard.nextLine());
            } catch (NumberFormatException e){
		System.out.println();
                System.out.println("Error: dato invalido, intentelo de nuevo.");
		System.out.println();
                x = 0;
            }
            if (x < 1 || x > 3){
                x = 0;
                System.out.println();
                System.out.println("Error: opcion invalida, intentelo de nuevo.");
                System.out.println();
            }
        }
        //Crear interface SET a utilizar
        Metodos conjuntoJava = new Metodos(x);
	Metodos conjuntoWeb = new Metodos(x);
	Metodos conjuntoMovil = new Metodos(x);
        Metodos conjuntoTemp = new Metodos(x);
        
        
        
        x = 0;
        String nombre;
        int y;
        int cont = 1;
        int z;
        //Loop ingreso de desarrolladores
        while (x == 0){
            System.out.println("Ingrese el nombre del desarrollador "+cont+": ");
            nombre = keyboard.nextLine();
            y = 0;
            int cont2 = 0;
            while (y == 0){
                System.out.println("Ingrese el numero correspondiente al area del desarrollador: ");
                System.out.println("1. Java");
                System.out.println("2. Web");
                System.out.println("3. Moviles");
                System.out.println("4. Terminar con este desarrollador");
                try{
                    y = Integer.parseInt(keyboard.nextLine());
                } catch (NumberFormatException e){
                    System.out.println();
                    System.out.println("Error: dato invalido, intentelo de nuevo.");
                    System.out.println();
                    y = 0;
                }
                if (y < 1 || y > 4){
                    y = 0;
                    System.out.println();
                    System.out.println("Error: opcion invalida, intentelo de nuevo.");
                    System.out.println();
                }
                if (y == 1){
                    if (cont2 == 1 || cont2 == 4 || cont2 == 6){
                        System.out.println("El desarrollador ya se encuentra en este conjunto");
                    } else{
                        conjuntoJava.add(nombre);
                        y = 0;
                        cont2 = cont2 + 1;
                    }
                }
                if (y == 2){
                    if (cont2 == 3 || cont2 == 4 || cont2 == 8){
                        System.out.println("El desarrollador ya se encuentra en este conjunto");
                    } else{
                        conjuntoWeb.add(nombre);
                        y = 0;
                        cont2 = cont2 + 3;
                    }
                }
                if (y == 3){
                    if (cont2 == 5 || cont2 == 6 || cont2 == 8){
                        System.out.println("El desarrollador ya se encuentra en este conjunto");
                    } else {
                        conjuntoMovil.add(nombre);
                        y = 0;
                        cont2 = cont2 + 5;
                    }
                }
                if (cont2 == 9) //Sale de este ciclo si esta en los 3 conjuntos
                    y = 1;
            }
            z = 0;
            while (z == 0){
                System.out.println("Desea continuar ingresando desarrolladores?");
                System.out.println("1. Si");
                System.out.println("2. No");
                 try{
                    z = Integer.parseInt(keyboard.nextLine());
                } catch (NumberFormatException e){
                    System.out.println();
                    System.out.println("Error: dato invalido, intentelo de nuevo.");
                    System.out.println();
                    z = 0;
                }
                if (z < 1 || z > 2){
                    z = 0;
                    System.out.println();
                    System.out.println("Error: opcion invalida, intentelo de nuevo.");
                    System.out.println();
                }
            }
            x = z - 1;
            cont++;
        }
        //Termino de ingresar desarrolladores
        //Llamar a unas funciones que hagan la logica de todo lo pedido en la hoja
    }
}
