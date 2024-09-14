/*
Pídale al usuario un tamaño de un arreglo por pantalla (int n)
Cree un arreglo llamado arr_int del tamaño n
Pídale al usuario tantos números enteros como el tamaño del arreglo arr_int n, y asígnele cada uno de 
esos datos leídos a las posiciones del arreglo arr_int.

Invierta el arreglo en otro arreglo2.
imprima por pantalla cada uno de los arreglos.
Ejemplo:
•Usuario ingresa 3
•Usuario ingresa 1 2 5
•Ahora sale por pantalla:
Arreglo1: 1 2 5
Arreglo2: 5 2 1
 */
import java.util.Scanner;
public class Semana7Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();
        int arr_int[] = new int[n];
        int arreglo2[] = new int[n];
        System.out.println();

        for(int i = 0; i < arr_int.length; i++){
            System.out.print("Ingrese un valor: ");
            arr_int[i] = sc.nextInt();
        }
        for(int i = 0; i < arr_int.length; i++){
            System.out.print(arr_int[i] + "|");
        }

        System.out.println();
        for(int i = 0; i < arreglo2.length; i++){
            arreglo2[i] = arr_int[arr_int.length - 1 - i];
            System.out.print(arreglo2[i] + "|");
        }
    }
    
}