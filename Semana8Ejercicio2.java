/*
 Crear una matriz de n x n con los números del 1 al n x n
 */
import java.util.Scanner;
public class Semana8Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz: ");
        int n = sc.nextInt();
        int c = 1;
        int matriz[][] = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = c++;
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }
    }
    
}
