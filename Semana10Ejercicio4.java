/*
 Crear un programa en java, que cree un arreglo dinámico de enteros de tamaño n (n leído 
por teclado) y de valores aleatorios entre 0 y 99. Una vez creado, convertir este arreglo 
dinámico en otro estático. Crear tres funciones que serán llamadas desde el main(): 
ArrayList<Integer> crearArreglo(int n) 
int[] convertirArrDinamico(ArrayList<Integer> arr) 
void imprimirArrEst(int[] arr)
 */
import java.util.*;
public class Semana10Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();

        
        ArrayList<Integer> arrDinamico = crearArreglo(n);
        int[] arrEstatico = convertirArrDinamico(arrDinamico);

        imprimirArrEst(arrEstatico);
    }

    static ArrayList<Integer> crearArreglo(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr.add(rand.nextInt(100));
        }
        return arr;
    }

    static int[] convertirArrDinamico(ArrayList<Integer> arr) {
        int[] arrEst = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            arrEst[i] = arr.get(i);
        }
        return arrEst;
    }

    static void imprimirArrEst(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "|");
        }
    }
}
