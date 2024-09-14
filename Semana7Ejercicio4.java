/*
 *Realice un algoritmo y programa en java, que lea n (n es par) del usuario como tamaño del arreglo1, 
será de enteros, y lo llenará con datos de alguna serie de su preferencia aprovechando el índice i. Una 
vez tengo definido, creado y con datos el arreglo1:
● Defina y cree otro arreglo2 de tamaño n/2 de tipo float 
● Cada valor del arreglo2 en la posición j, será el promedio de dos consecutivos del arreglo1, 
ejemplo:
arreglo1, n = 10, valores {1,2,3,4,5,6,7,8,9,10}
arreglo2, n/2 = 5, valores {(1+2)/2, (3+4)/2, (5+6)/2, (7+8)/2, (9+10)/2}
 valores {1.5, 3.5, 5.5, 7.5, 9.5}
o de forma general arreglo2[j] = ( arreglo1[i] + arreglo2[i+1] ) / 2
 */

import java.util.Scanner;
public class Semana7Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el tamaño del arreglo: ");
        int n = sc.nextInt();
        int arreglo1[] = new int[n];
        double arreglo2[] = new double[n/2];



        for(int i = 0; i < arreglo1.length; i++){
            arreglo1[i] = i + 1;
            System.out.print(arreglo1[i] + "|");
        }
        System.out.println();
        for(int j = 0; j < arreglo2.length; j++){
            arreglo2[j] = (arreglo1[j * 2] + arreglo1[j * 2 + 1]) / 2.0;
            System.out.print(arreglo2[j] + "|");

        }
        
    }
}
