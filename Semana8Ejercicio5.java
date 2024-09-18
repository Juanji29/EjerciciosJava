/*
 Se tiene una matriz de 4 x n, donde hay 4 filas fijas y n estudiantes (pedir n al usuario).
Por cada estudiante se tiene: id, edad, año_nacimiento, nro_materias.
Hacer las siguientes funciones:
Función 1: Leer los datos de un estudiante y almacenarlos en la posición i (i está entre 0 y n-1). Debe leer del usuario: i y los atributos de un estudiante. i es la columna que va a llenar.
Función 2: Pedir al usuario un id de estudiante e imprimir todos los datos del estudiante.
Función 3: Imprimir el número de estudiantes que hay entre un rango de edad (edad_min, 
edad_max)
Función 4: Imprimir todos los estudiantes
Función 5: Imprimir los estudiantes de un año determinado. Leer el año.
Función 6: Imprimir el número promedio de materias de toda la matriz
Realizar una función 0, a modo de Menú, que permita elegir ejecutar cualquier función entre 1 
y 6
 */
import java.util.Scanner;
public class Semana8Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de estudiantes: ");
        int n = sc.nextInt();

        int decision;
        boolean tru = true;
        int matriz[][] = new int[n][4];

        while (tru = true) {
            System.out.print("Ingresa la funcion que deseas hacer: ");
            decision = sc.nextInt();
            if (decision == 0) {
                break;
            }else if(decision == 1){
                funcion1(n, matriz, sc);
            }else if (decision == 2) {
                funcion2(n, matriz, sc);
            }else if (decision == 3){
                funcion3(n, matriz, sc);
            }else if(decision == 4){
                funcion4(n, matriz);
            }else if (decision == 5) {
                funcion5(n, matriz, sc);
            }else if(decision == 6){
                funcion6(n, matriz);
            }
        }
        
        

    }
    static void funcion1(int n, int matriz[][], Scanner sc){
        System.out.println("Selecciona un numero entre 0 y " + (n - 1));
        int i = sc.nextInt();
        System.out.println("Id  |   Edad    |   Año de nacimiento   |   Numero de materias");
        for(int j = 0; j < 4; j++){
            matriz[i][j] = sc.nextInt();
        }
    }


    
    static void funcion2(int n, int matriz[][], Scanner sc){
        System.out.print("Ingresa el id de un estudiante: ");
        int j = sc.nextInt();
        for(int i = 0; i < n; i++){
            if (j == matriz[i][0]){
                for (int k = 0; k < 4; k++){
                    System.out.print(matriz[i][k] + "|");
                }
            }
        }
        System.out.println();

    }
    static void funcion3(int n, int matriz[][], Scanner sc){
        System.out.print("Ingrese la edad minima: ");
        int edadMin = sc.nextInt();
        System.out.print("Ingrese la edad maxima: ");
        int edadMax = sc.nextInt();
        for(int i = 0; i < n; i++){
            if((edadMin <= matriz[i][1]) && (matriz[i][1] <= edadMax)){
                for(int j = 0; j < 4; j++){
                    System.out.print(matriz[i][j] + "|");
                }
            }
            System.out.println();
        }
    }
    static void funcion4(int n, int matriz[][]){
        for(int i = 0; i < n; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }
    }
    static void funcion5(int n, int matriz[][], Scanner sc){
        System.out.print("Ingresa el año que deseeas buscar: ");
        int buscar = sc.nextInt();
        for(int i = 0; i < n; i++){
            if (buscar == matriz[i][2]){
                for(int j = 0; j < 4; j++){
                    System.out.print(matriz[i][j] + "|");
                }
            }
            System.err.println();
        }
    }

    static void funcion6(int n, int matriz[][]){
        int c = 0;
        double resultado;
        for(int i = 0; i < n; i++){
            c = c + matriz[i][3];
        }
        resultado = c / n;
        System.out.println("El promedio de materias es de: " + resultado);
    }
}
