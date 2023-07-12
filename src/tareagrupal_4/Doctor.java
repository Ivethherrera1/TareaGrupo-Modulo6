package tareagrupal_4;

/*
 * Creaando clase que representa a un doctor.
 * Extiende la clase abstracta Persona. 
 */
public class Doctor extends Persona {
    private String especialidad; // Especialidad del doctor
    private String hospital; // Hospital donde trabaja

    // Creando constructor, utilizando los atributos de la superclase, y
    // referenciando los propios obtenidos.
    public Doctor(String nombre, String apellido, int identidad, int edad, String carrera_estudia, String campus,
            String especialidad, String hospital) {
        super(nombre, apellido, identidad, edad, carrera_estudia, campus);
        this.especialidad = especialidad;
        this.hospital = hospital;
    }

    /*
     * Método para obtener la especialidad del doctor.
     */

    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Método para obtener el hospital donde trabaja el doctor.
     */
    public String getHospital() {
        return hospital;
    }

    /**
     * Método toString() que devuelve una representación en forma de cadena de texto
     * del objeto Doctor.
     */
    @Override
    public String toString() {
        return "Doctor{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", identidad=" + getIdentidad() +
                ", edad=" + getEdad() +
                ", carreraEstudia='" + getCarreraestudia() + '\'' +
                ", campus='" + getCampus() + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", hospital='" + hospital + '\'' +
                '}';
    }
}