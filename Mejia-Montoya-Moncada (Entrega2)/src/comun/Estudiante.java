/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comun;

/**
 *
 * @author usuario
 */
public class Estudiante {

    private String nombre;
    private String apellido;
    private String numeroIdentificacion;
    private int anioIngreso;
    private int edad;
    private double nota;

    public Estudiante() {
    }

    public Estudiante(String nombre, String numeroIdentificacion, String apellido, int anioIngreso, int edad, double nota) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
        this.edad = edad;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public boolean aproboCurso() {
        return nota >= 3.0;
    }

    public void setNota(double nota) {
        this.nota = (nota >= 0.0 && nota <= 5.0) ? nota : 0;
    }

    @Override
    public String toString() {
        String informacion = "";

        informacion += "Nombre: " + nombre + "\nApellido: " + apellido
                + "\nIdentificación: " + numeroIdentificacion + "\nNota: " + nota;

        return informacion;
    }
}
