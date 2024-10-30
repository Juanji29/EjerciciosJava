/*
 *Leer un String desde el teclado por el usuario, imprimir el string al revés (en una sola línea).
 */
import java.util.Scanner;
public class Semana9Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = sc.nextLine();
        

        for(int i = palabra.length(); i > 0; i-- ){
            System.out.print(palabra.charAt(i-1));
        }
    }
}
