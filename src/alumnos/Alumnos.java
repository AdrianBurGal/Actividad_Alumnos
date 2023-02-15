package alumnos;

import Alumno.Alumno;

import java.util.Scanner;

public class Alumnos {

    /**
     * Pide los datos (nombre de los alumnos y nota de los alumnos).
     *
     * @param alumnos Nombre de los alumnos
     */
    public static void pedirDatos(Alumno[] alumnos) {

        Scanner entrada = new Scanner(System.in);

        for (int numAlumno = 0; numAlumno < alumnos.length; numAlumno++) {

            Alumno alumno = new Alumno();
            double notaIntroducida;

            System.out.println("Alumno " + (numAlumno + 1));
            System.out.print("Nombre: ");
            String nombreIntroducido = entrada.nextLine();
            alumno.setNombre(nombreIntroducido);
            System.out.print("Nota media: ");
            notaIntroducida = Double.parseDouble(entrada.nextLine());
            alumno.setNota(notaIntroducida);

            alumnos[numAlumno] = alumno;
        }
    }

    /**
     * Muestra los datos que se les paso en el anterior método y devuelve la
     * media de las notas.
     *
     * @param alumnos Nombre del alumno
     * @param sumaNotas Suma las notas de los alumnos para después hacer la
     * media
     * @return Devuelve la suma de las notas de los alumnos
     */
    public static double mostrarDatos(Alumno[] alumnos, double sumaNotas) {

        for (int numAlumno = 0; numAlumno < alumnos.length; numAlumno++) {

            Alumno alumno = alumnos[numAlumno];

            System.out.println("Alumno " + (numAlumno + 1));
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Nota media: " + alumno.getNota());
            System.out.println("----------------------------");

            sumaNotas += alumno.getNota();
        }

        return sumaNotas;
    }

    public static void main(String[] args) {

        Alumno[] alumnos = new Alumno[5];
        double sumaNotas = 0;

        System.out.println("A continuación deberá introducir el nombre y la nota de los 5 alumnos.");
        pedirDatos(alumnos);

        System.out.println("Los datos introducidos son los siguientes:");
        sumaNotas = mostrarDatos(alumnos, sumaNotas);

        System.out.println("La media global de la clase es " + (sumaNotas / alumnos.length));
    }

}
