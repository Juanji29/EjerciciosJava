/*
 * El usuario ingresará un string por teclado (leer un string), y luego leerá un caracter por teclado y 
contará el número de veces que se haya ese caracter en el string leído por el usuario. 
 */
import java.util.Scanner;
public class Semana9Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();
        System.out.print("Ingrese un caracter: ");
        String caracterIngresado = sc.nextLine();

        char caracter = caracterIngresado.charAt(0);
        int contador = 0;


        for(int i = 0; i < palabra.length();i++){
            if(palabra.charAt(i) == caracter){
                contador += 1;
            }
        }
        System.out.println(contador);
    }
}
