// Definición de una clase llamada Estudiante
public class Estudiante {
    // Atributos privados de la clase Estudiante
    private int id;        // Identificador del estudiante
    private String nombre; // Nombre del estudiante
    private String email;  // Dirección de correo electrónico del estudiante

    // Constructor de la clase Estudiante
    public Estudiante(int id, String nombre, String email) {
        // Inicialización de los atributos con los valores proporcionados al crear un objeto Estudiante
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    // Métodos getters y setters para acceder y modificar los atributos de la clase

    // Método getter para obtener el valor del atributo "id"
    public int getId() {
        return id;
    }

    // Método setter para modificar el valor del atributo "id"
    public void setId(int id) {
        this.id = id;
    }

    // Método getter para obtener el valor del atributo "nombre"
    public String getNombre() {
        return nombre;
    }

    // Método setter para modificar el valor del atributo "nombre"
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método getter para obtener el valor del atributo "email"
    public String getEmail() {
        return email;
    }

    // Método setter para modificar el valor del atributo "email"
    public void setEmail(String email) {
        this.email = email;
    }

    // Método toString para representar el objeto Estudiante como una cadena de texto
    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
