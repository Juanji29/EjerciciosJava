/*
Leer un string1 por parte del usuario, crear una función que ingrese como parámetro string1 y retorne: 
si string1 es de longitud par, retorne otro nuevo string con el primer y último caracter. 
si string1 es de longitud impat, retorne otro nuevo string con el primero, la mitad y último 
caracter. 
imprimir por pantalla el nuevo string.
 */
import java.util.Scanner;
public class Semana9Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String str1 = sc.nextLine();

        String resultado = funcionPar(str1);
        System.out.println("El resultado es: "+ resultado);
    }

    static String funcionPar(String str1){

        if((str1.length() % 2) == 0){
            char a1 = str1.charAt(0);
            char a2 = str1.charAt(str1.length()-1);
            return String.valueOf(a1)+ a2;
        }else{
            char a1 = str1.charAt(0);
            char a2 = str1.charAt(str1.length()-1);
            char a3 = str1.charAt(str1.length() / 2);
            return String.valueOf(a1) + a3 + a2; 
        }
        
        
       
    }
}
