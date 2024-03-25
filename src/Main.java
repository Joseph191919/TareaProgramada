
/**
 *
 * @author PC
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<String> nombresCompletos = new HashSet<>();
        LinkedList<String> listaEstudiantesLinkedList = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("TareaProgramada.txt"))) {
            String nombreCompleto;
            while ((nombreCompleto = br.readLine()) != null) {
                if (!nombresCompletos.add(nombreCompleto)) {
                    System.out.println("Nombre completo repetido: " + nombreCompleto);
                }
                listaEstudiantesLinkedList.add(nombreCompleto);
            }
        } catch (IOException e) {
            System.err.println("Error : " + e.getMessage());
        }

        
        Collections.sort(listaEstudiantesLinkedList);
        System.out.println("Lista de estudiantes ordenada alfabéticamente:");
        listaEstudiantesLinkedList.forEach(System.out::println);

      
        listaEstudiantesLinkedList.addFirst("Nuevo Estudiante al Inicio ");
        listaEstudiantesLinkedList.addLast("Nuevo Estudiante al Final ");

  
        listaEstudiantesLinkedList.remove("Estudiante a remover");

        int indiceEditar = listaEstudiantesLinkedList.indexOf("Estudiante a editar");
        if (indiceEditar != -1) {
            listaEstudiantesLinkedList.set(indiceEditar, "Nuevo nombre para el estudiante editado ");
        }

        boolean encontradoLinkedList = listaEstudiantesLinkedList.contains("Estudiante a buscar");
      

        System.out.println("\nResultados:");
        if (encontradoLinkedList) {
            System.out.println("Estudiante encontrado en la lista ");
        } else {
            System.out.println("Estudiante no encontrado en la lista ");
        }

     
    }
}

