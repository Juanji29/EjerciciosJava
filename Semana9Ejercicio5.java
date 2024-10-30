/*Leer un String desde teclado, crear otro string, del mismo tamaño del string leido, pero al revés, 
imprimir el string creado.  */
import java.util.Scanner;
public class Semana9Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un String: ");
        String palabra = sc.nextLine();


        StringBuilder palabraAlreves = new StringBuilder();
        
        for(int i = palabra.length()-1; i >= 0; i--){ 
            palabraAlreves.append(palabra.charAt(i)); 
        }
        System.out.println("La palabra al reves es: "+ palabraAlreves.toString());
    }
    
}
