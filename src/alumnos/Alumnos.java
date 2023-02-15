package alumnos;

import Alumno.Alumno;

import java.util.Scanner;

public class Alumnos {

    public static double mostrarDatos(Alumno[] alumnos, double sumaDeMedias) {

        for (int numAlumno = 0; numAlumno < alumnos.length; numAlumno++) {
            
            Alumno alumno = alumnos[numAlumno];

            System.out.println("Alumno " + (numAlumno + 1));
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Nota media: " + alumno.getNota());
            System.out.println("----------------------------");

            sumaDeMedias += alumno.getNota();
        }

        return sumaDeMedias;
    }

    public static void pedirDatos(Alumno[] alumnos, Scanner entrada) {

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

    public static void main(String[] args) {

        Alumno[] alumnos = new Alumno[5];
        double sumaDeMedias = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("A continuación deberá introducir el nombre y la nota de los 5 alumnos.");
        pedirDatos(alumnos, entrada);

        System.out.println("Los datos introducidos son los siguientes:");
        sumaDeMedias = mostrarDatos(alumnos, sumaDeMedias);

        System.out.println("La media global de la clase es " + (sumaDeMedias / alumnos.length));
    }

}
