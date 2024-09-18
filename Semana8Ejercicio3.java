/*
 Crear una matriz de m filas y n columnas (valores pedidos al usuario) y llenarlos con números aleatorios del 0 al 10.
 */
import java.util.Random;
import java.util.Scanner;
public class Semana8Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Ingresa el tamaño de las filas: ");
        int m = sc.nextInt();
        System.out.print("Ingresa el tamaño de las columnas: ");
        int n = sc.nextInt();
        int matriz[][] = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int numeroAleatorio = rand.nextInt(11);
                matriz[i][j] = numeroAleatorio;
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }
    }
}
