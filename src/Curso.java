import java.util.ArrayList;
import java.util.Scanner;

// Definición de la clase Curso para representar un curso con estudiantes
public class Curso {
    private String codigo; // Código único del curso
    private String nombre; // Nombre del curso
    private ArrayList<Estudiante> listaEstudiantes; // Lista de estudiantes inscritos en el curso
    private static int index = 1; // Variable estática para asignar un identificador único a cada estudiante

    // Constructor de la clase Curso
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaEstudiantes = new ArrayList<>(); // Inicialización de la lista de estudiantes
    }

    // Método para agregar un estudiante al curso
    public void agregarEstudiante(Scanner scanner) {
        scanner.nextLine(); // Consumir el salto de línea pendiente

        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el email del estudiante:");
        String email = scanner.nextLine();

        Estudiante estudiante = new Estudiante(index++, nombre, email); // Crear un nuevo estudiante con un ID único
        this.listaEstudiantes.add(estudiante); // Agregar el estudiante a la lista

        System.out.println("Estudiante agregado correctamente.");
    }

    // Método para listar todos los estudiantes del curso
    public void listarEstudiantes() {
        if (this.listaEstudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados en el curso.");
        } else {
            System.out.println("Lista de estudiantes del curso " + this.nombre);
            for (Estudiante estudiante : this.listaEstudiantes) {
                System.out.println(estudiante.toString());
            }
        }
    }

    // Método para eliminar un estudiante del curso
    public void eliminarEstudiante(Scanner scanner) {
        this.listarEstudiantes(); // Mostrar la lista de estudiantes para referencia

        if (this.listaEstudiantes.isEmpty()) {
            return; // No hay estudiantes para eliminar
        }

        System.out.println("Ingrese el ID del estudiante a eliminar:");
        int idEliminado = scanner.nextInt();

        // Intentar eliminar el estudiante con el ID proporcionado
        boolean eliminado = this.listaEstudiantes.removeIf(estudiante -> estudiante.getId() == idEliminado);

        // Mostrar el resultado de la operación
        System.out.println(eliminado ? "Estudiante eliminado correctamente." : "No se pudo eliminar el estudiante.");
    }

    // Getters y setters para acceder y modificar atributos de la clase

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    // Método toString para representar el objeto Curso como una cadena de texto
    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", listaEstudiantes=" + listaEstudiantes +
                '}';
    }
}
