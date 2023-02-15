package alumnos;

import Alumno.Alumno;

import java.util.Scanner;

public class Alumnos {

    public static double muestraDatos(Alumno[] alumno, double sumaDeMedias) {

        for (int numAlumno = 1; numAlumno <= 5; numAlumno++) {

            System.out.println("Alumno " + numAlumno);
            System.out.println("Nombre: " + alumno[numAlumno].getNombre());
            System.out.println("Nota media: " + alumno[numAlumno].getNota());
            System.out.println("----------------------------");

            sumaDeMedias += alumno[numAlumno].getNota();

        }

        return sumaDeMedias;
    }

    public static void pedirDatos(Alumno[] alumno, Scanner entrada) throws NumberFormatException {

        String nombreIntroducido;
        double notaIntroducida;

        for (int numAlumno = 1; numAlumno <= 5; numAlumno++) {

            alumno[numAlumno] = new Alumno();

            System.out.println("Alumno " + numAlumno);
            System.out.print("Nombre: ");
            nombreIntroducido = entrada.nextLine();
            (alumno[numAlumno]).setNombre(nombreIntroducido);
            System.out.print("Nota media: ");
            notaIntroducida = Double.parseDouble(entrada.nextLine());
            alumno[numAlumno].setNota(notaIntroducida);

        }
    }

    public static void main(String[] args) {

        Alumno[] alumno = new Alumno[5];
        double sumaDeMedias = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("A continuación debera introducir el nombre y la nota de los 5 alumnos.");
        pedirDatos(alumno, entrada);

        System.out.println("Los datos introducidos son los siguientes:");
        sumaDeMedias = muestraDatos(alumno, sumaDeMedias);

        System.out.println("La media global de la clase es " + sumaDeMedias / 5);
    }

}
