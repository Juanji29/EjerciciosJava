/*
 Crea un ArrayList con los nombres de varios compañeros de clase. A continuación, muestra 
esos nombres por pantalla. Utiliza para ello un Iterator para recorrer el ArrayList en vez de 
utilizar un índice i. Utilice como base el ejemplo6 de la plenaria10.
 */
import java.util.ArrayList;
public class Semana10Ejercicio1 {
    public static void main(String[] args) {
        ArrayList <String> estudiantes = new ArrayList<>();
        estudiantes.add("Juan");
        estudiantes.add("Sebastian");
        estudiantes.add("Andres");
        estudiantes.add("Camilo");
        estudiantes.add("Santiago");

        imprimirEstudiantes(estudiantes);
    }
    static void imprimirEstudiantes(ArrayList<String> estudiantes){
        int n = estudiantes.size();
        for (int i = 0; i < n; i++) {
            System.out.println(estudiantes.get(i));
        }
    }
}