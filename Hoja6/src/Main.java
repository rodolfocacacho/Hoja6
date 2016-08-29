
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
        if (x == 1)
            //Factory de HASHSET
        if (x == 2)
            //Factory de TREESET
        if (x == 3)
            //Factory de LINKEDHASHSET
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
            while (y == 0){
                System.out.println("Ingrese el numero correspondiente al area del desarrollador: ");
                System.out.println("1. Java");
                System.out.println("2. Web");
                System.out.println("3. Moviles");
                try{
                    y = Integer.parseInt(keyboard.nextLine());
                } catch (NumberFormatException e){
                    System.out.println();
                    System.out.println("Error: dato invalido, intentelo de nuevo.");
                    System.out.println();
                    y = 0;
                }
                if (y < 1 || y > 3){
                    y = 0;
                    System.out.println();
                    System.out.println("Error: opcion invalida, intentelo de nuevo.");
                    System.out.println();
                }
            }
            
            //INGRESAR DATOS EN LA INTERFACE SET UTILIZADA
            z = 0;
            while (z == 0){
                System.out.println("Desea continuar?");
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