/*
 Leer un string1 y un string2, determinar si string2 es un substring de string1. El tamaño de string1 es 
mayor que el tamaño de string 1.
 */
import java.util.Scanner;
public class Semana9Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra1, palabra2;
        System.out.print("Ingrese String1: ");
        palabra1 = sc.nextLine();
        System.out.print("Ingrese String2: ");
        palabra2 = sc.nextLine();
        
        if (palabra1.contains(palabra2)) {
            System.out.println("String2 es un substring de String1.");
        } else {
            System.out.println("String2 no es un substring de String1.");
        }
    }
}
