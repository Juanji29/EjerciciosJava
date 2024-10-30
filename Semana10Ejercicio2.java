/*
 Crea un ArrayList con los nombres de varios compañeros de clase. A continuación, muestra 
esos nombres por pantalla. Utiliza para ello un ciclo for que recorra todo el ArrayList SIN 
USAR NINGÚN índice. Utilice como base el ejemplo6 de la plenaria10.
 */
import java.util.ArrayList;
public class Semana10Ejercicio2 {
    public static void main(String[] args) {
        ArrayList <String> estudiantes = new ArrayList<>();
        estudiantes.add("Juan");
        estudiantes.add("Sebastian");
        estudiantes.add("Andres");
        estudiantes.add("Camilo");
        estudiantes.add("Santiago");
        int n = estudiantes.size();

        for(int i = 0; i < estudiantes.size(); i++){
            System.out.println(estudiantes.get(i));
        }
    }
}
