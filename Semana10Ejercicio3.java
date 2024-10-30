/* 
 Crear un programa en java, que cree un arreglo estático de enteros de tamaño n (n leído por 
teclado) y de valores aleatorios entre 0 y 99. Una vez creado, convertir este arreglo estático 
en otro dinámico ArrayList. Crear tres funciones que serán llamadas desde el main(): 
int[] crearArreglo(int n) 
ArrayList<Integer> convertirArrEstatico(int[] arr) 
void imprimirArrDin(ArrayList<Integer> arr)  
*/
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Semana10Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();
       

        
        int[] arreglo = crearArreglo(n);        
        ArrayList<Integer> arrDinamico = convertirArrEstatico(arreglo);
        imprimirArrDin(arrDinamico);
        
    }

    static int[] crearArreglo(int n) {
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }

    static ArrayList<Integer> convertirArrEstatico(int[] arr) {
        ArrayList<Integer> arrDin = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            arrDin.add(arr[i]);
        }
        return arrDin;
    }

    static void imprimirArrDin(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + "|");
        }
    }
}
