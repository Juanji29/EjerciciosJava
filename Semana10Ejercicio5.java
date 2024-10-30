/*
CALCULAR LA SUMA Y LA MEDIA ARITMÉTICA DE LOS VALORES CONTENIDOS EN UN 
ARRAYLIST. 

Realizar un programa Java que lea una serie de valores numéricos enteros desde el teclado y los 
almacene en un ArrayList de tipo Integer. 

La lectura de números enteros termina cuando se introduce un valor 0 o negativo. 
A continuación el programa mostrará por pantalla el número de valores que se han leído, su suma 
y su promedio. 

Luego, calcular el número de elementos menores al promedio, y el número de elementos mayores 
o iguales al promedio. Imprimir ambos valores por pantalla. 

Por último se mostrarán todos los valores leídos menores al promedio, y todos los valores leídos 
mayores o igual al promedio. 

Tips para la Solución:  
● utilice como base el ejemplo5 de la plenaria10 
Para resolverlo utilizar 6 métodos además del método main: 

● Método leerValores(): pide por teclado los números enteros y los almacena en el ArrayList. 
La lectura acaba cuando se introduce el valor 0 o negativo. El método devuelve mediante 
return el ArrayList con los valores introducidos. 

● Método calcularSuma(): Recibe como parámetro el ArrayList con los valores numéricos y 
calcula y devuelve su suma. Utilice el equivalente a índices i para recorrer el ArrayList e 
Investige la utilización de un Iterator para recorrer el ArrayList. 

● Método calcularNroMenores(): Recibe como parámetro el ArrayList con los valores 
numéricos y el promedio, y calcula el número de elementos menores a dicho promedio y 
retorna dicho valor. 

● Método calcularNroMayores(): Recibe como parámetro el ArrayList con los valores 
numéricos y el promedio, y calcula el número de elementos mayores o igual al promedio y 
retorna dicho valor. 

● Método mostrarMenores(): Recibe como parámetro el ArrayList y el promedio. Muestra por 
pantalla todos los valores menores al promedio. 

● Método mostrarMayores(): Recibe como parámetro el ArrayList y el promedio. Muestra por 
pantalla todos los valores mayores o igual al promedio.
 */
import java.util.*;
public class Semana10Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> valores = leerValores();
        int suma = calcularSuma(valores);
        int promedio = suma / valores.size();

        for(int i = 0; i < valores.size(); i++){
            System.out.print(valores.get(i) + "|");
        }

        System.out.println("La suma de los valores es: " + suma);
        System.out.println("El promedio de los valores es: " + promedio);

        int nroMenores = calcularNroMenores(valores, promedio);
        int nroMayores = calcularNroMayores(valores, promedio);

        System.out.println("El número de elementos menores al promedio es: " + nroMenores);
        System.out.println("El número de elementos mayores o iguales al promedio es: " + nroMayores);

        System.out.println("Los valores menores al promedio son: ");
        mostrarMenores(valores, promedio);
        System.out.println();

        System.out.println("Los valores mayores o iguales al promedio son: ");
        mostrarMayores(valores, promedio);
        
        
    }

    static ArrayList<Integer> leerValores(){
        ArrayList<Integer> valores = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int valor = 1;
        while(valor > 0){
            System.out.print("Ingrese un valor: ");
            valor = sc.nextInt();
            if(valor > 0){
                valores.add(valor);
            }
        }
        return valores;
    }

    static int calcularSuma(ArrayList<Integer> valores){
        int suma = 0;
        for(int i = 0; i < valores.size(); i++){
            suma += valores.get(i);
        }
        return suma;
    }

    static int calcularNroMenores(ArrayList<Integer> valores, int promedio){
        int nroMenores = 0;
        for(int i = 0; i < valores.size(); i++){
            if(valores.get(i) < promedio){
                nroMenores++;
            }
        }
        return nroMenores;
    }

    static int calcularNroMayores(ArrayList<Integer> valores, int promedio){
        int nroMayores = 0;
        for(int i = 0; i < valores.size(); i++){
            if(valores.get(i) >= promedio){
                nroMayores++;
            }
        }
        return nroMayores;
    }

    static void mostrarMenores(ArrayList<Integer> valores, int promedio){
        for(int i = 0; i < valores.size(); i++){
            if(valores.get(i) < promedio){
                System.out.print(valores.get(i) + "|");
            }
        }
    }
    static void mostrarMayores(ArrayList<Integer> valores, int promedio){
        for(int i = 0; i < valores.size(); i++){
            if(valores.get(i) >= promedio){
                System.out.print(valores.get(i) + "|");
            }
        }
    }
}
