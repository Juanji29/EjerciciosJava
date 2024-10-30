/*
 * Lees 2 strings por teclado (str1 y str2) e imprimir sin son iguales o diferentes.
 */
import java.util.Scanner;
public class Semana9Ejercicio0{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if(str1.equals(str2)){
            System.out.println("Las palabras son iguales");
        }else{
            System.out.println("Las palabras son diferentes");
        }
    }
}
