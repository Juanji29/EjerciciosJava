/*
 * A partir del ejercicio 3, Crear una segunda matriz de tamaño n (unidimensional) con el valor de 
la sumatoria de cada fila en la matriz de m x n.
*/

import java.util.Random;
import java.util.Scanner;

public class Semana8Ejercicio3p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Ingresa el tamaño de las filas: ");
        int m = sc.nextInt();
        System.out.print("Ingresa el tamaño de las columnas: ");
        int n = sc.nextInt();
        int matriz[][] = new int[n][m];
        int matrizUni[] = new int[n];


        System.out.println("Matriz");
        for(int i = 0; i < n; i++){
            int c = 0;
            for(int j = 0; j < m; j++){
                int numeroAleatorio = rand.nextInt(11);
                matriz[i][j] = numeroAleatorio;
                System.out.print(matriz[i][j] + "|");
                c = c + matriz[i][j];
                matrizUni[i] = c;
            }
            System.out.println();
        }
        System.out.println("Sumatoria de las filas");
        for (int i = 0 ; i < n; i++){
            System.out.print(matrizUni[i] +"|");
        }
    }
}
