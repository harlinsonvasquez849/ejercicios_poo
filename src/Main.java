import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario desde la consola
        try (Scanner scanner = new Scanner(System.in)) {
            // Creamos un objeto de la clase GestionCurso para manejar cursos y estudiantes
            GestionCurso objGestionCurso = new GestionCurso();

            // Variable para almacenar la opción seleccionada por el usuario en el menú principal
            int opcion;

            // Menú principal
            do {
                // Mostramos el menú principal y solicitamos la opción al usuario
                System.out.println("""
                        MENU DE OPCIONES
                        1. Administrar estudiantes
                        2. Administrar cursos
                        3. Salir
                        
                        Ingrese una opcion
                        """);
                opcion = scanner.nextInt();

                // Evaluamos la opción seleccionada por el usuario
                switch (opcion) {
                    case 1:
                        // Submenú para administrar estudiantes
                        int opcion1;
                        do {
                            System.out.println("""
                                    MENU DE OPCIONES
                                    1. Agregar estudiante a un curso
                                    2. Listar estudiantes de un curso
                                    3. Eliminar estudiante de un curso
                                    4. Salir
                                    
                                    Ingrese una opcion
                                    """);
                            opcion1 = scanner.nextInt();

                            // Evaluamos la opción seleccionada para administrar estudiantes
                            switch (opcion1) {
                                case 1:
                                    // Agrega un estudiante a un curso
                                    objGestionCurso.listarCursos();
                                    System.out.println("Ingrese el código del curso al que desea agregar el estudiante:");
                                    String codigoCurso = scanner.next();
                                    Curso curso = objGestionCurso.buscarCursoPorCodigo(codigoCurso);
                                    if (curso == null) {
                                        System.out.println("No se encontró el curso.");
                                    } else {
                                        curso.agregarEstudiante(scanner);
                                    }
                                    break;
                                case 2:
                                    // Lista estudiantes de un curso
                                    System.out.println("Ingrese el código del curso del que desea listar estudiantes:");
                                    codigoCurso = scanner.next();
                                    curso = objGestionCurso.buscarCursoPorCodigo(codigoCurso);
                                    if (curso == null) {
                                        System.out.println("No se encontró el curso.");
                                    } else {
                                        curso.listarEstudiantes();
                                    }
                                    break;
                                case 3:
                                    // Elimina un estudiante de un curso
                                    System.out.println("Ingrese el código del curso del que desea eliminar estudiantes:");
                                    codigoCurso = scanner.next();
                                    curso = objGestionCurso.buscarCursoPorCodigo(codigoCurso);
                                    if (curso == null) {
                                        System.out.println("No se encontró el curso.");
                                    } else {
                                        curso.eliminarEstudiante(scanner);
                                    }
                                    break;
                            }
                        } while (opcion1 != 4);
                        break;

                    case 2:
                        // Submenú para administrar cursos
                        int opcion2;
                        do {
                            System.out.println("""
                                    MENU DE OPCIONES
                                    1. Agregar curso
                                    2. Listar cursos
                                    3. Buscar curso por código
                                    4. Salir
                                    
                                    Ingrese una opcion
                                    """);
                            opcion2 = scanner.nextInt();

                            // Evaluamos la opción seleccionada para administrar cursos
                            switch (opcion2) {
                                case 1:
                                    // Agrega un nuevo curso
                                    objGestionCurso.agregarCurso(scanner);
                                    break;
                                case 2:
                                    // Lista todos los cursos
                                    objGestionCurso.listarCursos();
                                    break;
                                case 3:
                                    // Busca un curso por código
                                    System.out.println("Ingrese el código del curso a buscar:");
                                    String codigoBuscar = scanner.next();
                                    Curso cursoEncontrado = objGestionCurso.buscarCursoPorCodigo(codigoBuscar);
                                    if (cursoEncontrado == null) {
                                        System.out.println("No se encontró el curso.");
                                    } else {
                                        System.out.println(cursoEncontrado.toString());
                                    }
                                    break;
                            }
                        } while (opcion2 != 4);
                        break;
                }
            } while (opcion != 3);
        }
    }
}
