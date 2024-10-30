import java.util.Random;
import java.util.Scanner;

public class Semana8Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Ingrese el tamaño de la matriz: ");
        int n = sc.nextInt();
        int matriz[][] = new int [n][n];
        int decision;

        while(true){
            System.out.println("1.Función: Llenar toda la matriz con números pedidos al usuario.\r\n" + //
                                "2.Función: Llenar toda la matriz con números aleatorios\r\n" + //
                                "3.Función: Imprimir la matriz\r\n" + //
                                "4.Función: Resultado de la suma de una fila.\r\n" + //
                                "5.Función: Resultado de la suma de una columna.\r\n" + //
                                "6.Función: Imprimir la diagonal principal\r\n" + //
                                "7.Función: Resultado de la suma de la diagonal principal.\r\n" + //
                                "8.Función: Suma de todos los valores de la matriz\r\n" + //
                                "9.Función: Valor promedio de todos los valores de la matriz\r\n" + //
                                "10.Función: encontrar el valor máximo: imprimir el valor");

            System.out.print("Escoja la funcion que desea realizar: ");
            decision = sc.nextInt();
            if (decision == 0){
                break;
            }else if(decision == 1){
                llenarMatrizUsuario(matriz, sc);
            }else if(decision == 2){
                llenarMatrizAleatoria(matriz, rand);
            }else if(decision == 3){
                imprimirMatriz(matriz);
            }else if(decision == 4){
                sumarFila(matriz, sc);
            }else if(decision == 5){
                sumarColumna(matriz, sc);
            }else if(decision == 6){
                imprimirDiagonalPrincipal(matriz);
            }else if(decision == 7){
                sumarDiagonalPrincipal(matriz);
            }else if(decision == 8){
                sumarMatriz(matriz);
            }else if(decision == 9){
                promedioMatriz(matriz);
            }else if(decision == 10){
                encontrarMaximo(matriz);
            }else if(decision == 11){
                
            }

        }

    }
    // Función 1
    static void llenarMatrizUsuario(int[][] matriz, Scanner sc) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese el valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    // Función 2
    static void llenarMatrizAleatoria(int[][] matriz, Random rand) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(11);
            }
        }
    }

    // Función 3
    static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
    }

    // Función 4
    static void sumarFila(int[][] matriz, Scanner sc) {
        System.out.print("Ingrese el número de la fila a sumar: ");
        int fila = sc.nextInt();
        int suma = 0;
        for (int j = 0; j < matriz[fila].length; j++) {
            suma += matriz[fila][j];
        }
        System.out.println("La suma de la fila " + fila + " es: " + suma);
    }

    // Función 5
    static void sumarColumna(int[][] matriz, Scanner sc) {
        System.out.print("Ingrese el número de la columna a sumar: ");
        int columna = sc.nextInt();
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
        }
        System.out.println("La suma de la columna " + columna + " es: " + suma);
    }

    // Función 6
    static void imprimirDiagonalPrincipal(int[][] matriz) {
        System.out.print("Diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }

    // Función 7
    static void sumarDiagonalPrincipal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        System.out.println("La suma de la diagonal principal es: " + suma);
    }

    // Función 8
    static void sumarMatriz(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma de todos los valores de la matriz es: " + suma);
    }

    // Función 9
    static void promedioMatriz(int[][] matriz) {
        int suma = 0;
        int totalElementos = matriz.length * matriz.length;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        double promedio = (double) suma / totalElementos;
        System.out.println("El promedio de los valores de la matriz es: " + promedio);
    }

    // Función 10
    static void encontrarMaximo(int[][] matriz) {
        int maximo = matriz[0][0];
        int filaMax = 0;
        int colMax = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                    filaMax = i;
                    colMax = j;
                }
            }
        }
    }
}
