package Alumno;

/**
 * Alumno.java Definición de la clase Alumno
 *
 * @author Adrián Burgos Gálvez
 */
public class Alumno {

    private String nombre;
    private double nota;

    /**
     * Devuelve el nombre del alumno.
     *
     * @return Devuelve el nombre de ese alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Recibe el nombre del alumno.
     *
     * @param nombre Nombre del alumno en cuestión
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la nota del alumno.
     *
     * @return Devuelve la nota de dicho alumno
     */
    public double getNota() {
        return nota;
    }

    /**
     * Recibe la nota del alumno.
     *
     * @param nota Nota del alumno
     */
    public void setNota(double nota) {
        this.nota = nota;
    }

}
