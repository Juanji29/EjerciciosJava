/*
 * Crear una matriz de 3 x 3 con los números del 1 al 3x3 (9
 */
public class Semana8Ejercicio1 {
    public static void main(String[] args) {
        int matriz[][] = new  int[3][3];
        int c = 1;
        for( int i = 0; i < 3; i ++){
            for(int j = 0; j < 3; j++){
                matriz[i][j] = c++;
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }
    }
}
