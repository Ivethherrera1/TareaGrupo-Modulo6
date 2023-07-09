public class deportista extends Persona {
    private String deporte;
    private String equipo;

    public Deportista(String nombre, int edad, String deporte, String equipo) {
        super(nombre, edad);
        this.deporte = deporte;
        this.equipo = equipo;
    }

    public void entrenar() {
        System.out.println("Soy " + nombre + " y estoy entrenando " + deporte + ".");
    }
}