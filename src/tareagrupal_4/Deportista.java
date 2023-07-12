/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareagrupal_4;

/**
 *
 * @author IvethHerrera
 */

/*
* Aquí declaramos la clase "Deportista" que extiende (hereda de) la clase "Persona". 
* Esto significa que la clase "Deportista" heredará los atributos y métodos de la clase "Persona".
*/

public class Deportista extends Persona {

/*
* Estas líneas declaran dos atributos privados y finales ("final") en la clase "Deportista". 
* Los atributos "deporte" y "equipo" son de tipo String y no podrán ser modificados después de su inicialización.
*/
    private final String deporte;
    private final String equipo;

// Creamos el constructor 
    public Deportista(String nombre, String apellido, int identidad, int edad, String carreraEstudia, String campus, String deporte, String equipo) {
        super(nombre, apellido, identidad, edad, carreraEstudia, campus);
        this.deporte = deporte;
        this.equipo = equipo;
    }
    //Recibe los primeros 6 parámetros a la clase padre. 
    //Luego, inicializa los atributos "deporte" y "equipo" con los valores proporcionados.
    
    //métodos setter and getter
    public String getDeporte() {
        return deporte;
    }

    public String getEquipo() {
        return equipo;
    }

    //método toString
    @Override
    public String toString() {
        return "Deportista{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", identidad=" + getIdentidad() +
                ", edad=" + getEdad() +
                ", carreraEstudia='" + getCarreraestudia() + '\'' +
                ", campus='" + getCampus() + '\'' +
                ", deporte='" + deporte + '\'' +
                ", equipo='" + equipo + '\'' +
                '}';
    }
}

