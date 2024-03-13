import java.util.ArrayList;
import java.util.Scanner;

// Definición de la clase GestionCurso para administrar cursos
public class GestionCurso {
    private ArrayList<Curso> listaCursos; // Lista de cursos gestionados

    // Constructor de la clase GestionCurso
    public GestionCurso() {
        this.listaCursos = new ArrayList<>(); // Inicialización de la lista de cursos
    }

    // Método para agregar un curso
    public void agregarCurso(Scanner scanner) {
        System.out.println("Ingrese el nombre del curso:");
        String nombre = scanner.next();

        System.out.println("Ingrese el código del curso:");
        String codigo = scanner.next();

        // Verificar si el curso con el mismo código ya existe
        if (buscarCursoPorCodigo(codigo) == null) {
            Curso curso = new Curso(codigo, nombre); // Crear un nuevo curso
            this.listaCursos.add(curso); // Agregar el curso a la lista
            System.out.println("Curso agregado correctamente.");
        } else {
            System.out.println("El código ya existe. No se pudo agregar el curso.");
        }
    }

    // Método para listar todos los cursos
    public void listarCursos() {
        if (this.listaCursos.isEmpty()) {
            System.out.println("No hay cursos registrados.");
        } else {
            System.out.println("Lista de cursos:");
            for (Curso iterador : this.listaCursos) {
                System.out.println(iterador.toString());
            }
        }
    }

    // Método para buscar un curso por código
    public Curso buscarCursoPorCodigo(String codigoBuscar) {
        for (Curso iterador : this.listaCursos) {
            if (iterador.getCodigo().equalsIgnoreCase(codigoBuscar)) {
                return iterador; // Devolver el curso si se encuentra
            }
        }

        return null; // Devolver null si no se encuentra ningún curso con el código proporcionado
    }
}
