/*Ejercicio 1: arreglo básico
Leer el tamaño del arreglo por el usuario (variable x)
Defina un nuevo arreglo de enteros llamado arr_int, de tamaño x.
Pídale al usuario tantos números enteros como el tamaño del arreglo arr_int creado, y asígnele el doble
de cada uno de esos datos recibidos a las posiciones del arreglo arr_int.
Realice un ciclo para imprimir todos las variables del arreglo multiplicados por tres por pantalla.*/
        



import java.util.Scanner;
public class Semana7Ejercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int x = sc.nextInt();
        int arr_int[] = new int[x];

        for (int i = 0; i < arr_int.length; i++){
            System.out.print("Ingrese un numero: ");
            int j  = sc.nextInt();
            arr_int[i] = j * 2;
        }
        for (int i = 0; i < arr_int.length; i++){
                System.out.println("3 x " + arr_int[i] +" = " + arr_int[i] * 3 );
        }
        
        
    }
}