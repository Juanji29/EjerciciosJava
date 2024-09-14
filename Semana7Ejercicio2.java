/* 
 Cree un arreglo de n enteros (arreglo1) con datos generados a partir de cualquier serie de su preferencia 
(aproveche la variable del índice i). A partir de este arreglo1, crea otro arreglo (arreglo2) de igual 
tamaño (n) a partir del arreglo1 pero con los datos invertidos.
Imprima ambos arreglos
*/
import java.util.Scanner;
public class Semana7Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n = sc.nextInt();
        int arreglo1[] = new int[n];
        int arreglo2[] = new int[n];
        
        for(int i = 0; i < arreglo1.length; i++){
            arreglo1[i] = i * 2; 
            System.out.print(arreglo1[i] + "|");
        }
        System.out.println();
        for (int i = 0; i < arreglo2.length; i++){
            arreglo2[i] = arreglo1[arreglo1.length - 1 - i];
            System.out.print(arreglo2[i] + "|");

        }
    }
     
}