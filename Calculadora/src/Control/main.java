
package Control;

import Moldelo.Persona;
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        ejecucion1();
        ejecucion2();
    }
    
    private static void ejecucion1(){
        System.out.println("Ejecucion 1 | Valores inicales en el constructor\n");
        Persona alguien = new Persona("120000235", "Pedro Perez", 2020);
        System.out.println("Datos registrados:");
        System.out.println(alguien.toString());
        System.out.println("Edad:\t"+alguien.edad()+"\n\n");
    }
    
    private static void ejecucion2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejecucion 2 | Creacion de objeto con datos de entrada\n");
        Persona alguien = new Persona();
        System.out.print("Nombre:\t");
        alguien.setNombre(sc.nextLine());
        System.out.print("\nIdentificacion:\t");
        alguien.setId(sc.next());
        System.out.println("\nAño de nacimiento:\t");
        alguien.setAa(sc.nextInt());
        System.out.println("Datos registrados:\n"+alguien.toString());
        System.out.println("Edad:\t"+alguien.edad());
    }
}
