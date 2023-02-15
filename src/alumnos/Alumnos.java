
package alumnos;

import Alumno.Alumno;

import java.util.Scanner;

public class Alumnos {

    public static void main(String[] args) {

        double notaIntroducida, sumaDeMedias = 0;
        String nombreIntroducido;
        Alumno[] alumno = new Alumno[5];

        Scanner entrada = new Scanner(System.in);

        System.out.println("A continuación debera introducir el nombre y la nota de los 5 alumnos.");

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

        System.out.println("Los datos introducidos son los siguientes:");

        for (int numAlumno = 1; numAlumno <= 5; numAlumno++) {

            System.out.println("Alumno " + numAlumno);
            System.out.println("Nombre: " + alumno[numAlumno].getNombre());
            System.out.println("Nota media: " + alumno[numAlumno].getNota());
            System.out.println("----------------------------");

            sumaDeMedias += alumno[numAlumno].getNota();

        }

        System.out.println("La media global de la clase es " + sumaDeMedias / 5);
    }
}
