
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
        //Hacer loop para progra defensiva
        System.out.println("Elija el numero de implementacion SET a utilizar: ");
        System.out.println("1.HashSet");
        System.out.println("2.TreeSet");
        System.out.println("3.LinkedHashSet");
        Scanner keyboard = new Scanner(System.in);
        int x = keyboard.nextInt();
    }
}
