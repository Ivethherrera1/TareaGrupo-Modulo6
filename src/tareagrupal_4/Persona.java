package tareagrupal_4;

/**
 *
 * @author mprad
 */

public abstract class Persona {
    private final String nombre;
    private final String apellido;
    private final int identidad;
    private final int edad;
    private final String carrera_estudia;
    private final String campus;

    public Persona(String nombre, String apellido, int identidad, int edad, String carrera_estudia, String campus) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identidad = identidad;
        this.edad = edad;
        this.carrera_estudia = carrera_estudia;
        this.campus = campus;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getIdentidad() {
        return identidad;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarreraestudia() {
        return carrera_estudia;
    }

    public String getCampus() {
        return campus;
    }
}
