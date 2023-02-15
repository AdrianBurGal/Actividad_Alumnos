package alumnos;
import Alumno.Alumno;
import java.util.Scanner;

public class Alumnos {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    // Define la estructura, un array de 5 alumnos
    // pero no crea los objetos
    Alumno[] alum = new Alumno[5];
    

    // Pide los datos de los alumnos /////////////////////////////////
        
    System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumnos.");

    String nombreIntroducido;
    double notaIntroducida;
    
    for(int i = 0; i < 5; i++) {
      
      alum[i] = new Alumno();          
      System.out.println("Alumno " + i);
      System.out.print("Nombre: ");
      nombreIntroducido = entrada.nextLine();
      (alum[i]).nombre = nombreIntroducido;
      System.out.print("Nota media: ");
      notaIntroducida = Double.parseDouble(entrada.nextLine());
      alum[i].notaMedia = notaIntroducida;
    } // for i
    
    // Muestra los datos de los alumnos /////////////////////////////////
    
    System.out.println("Los datos introducidos son los siguientes:");

    double  sumaDeMedias = 0;
    
    for(int i = 0; i < 5; i++) {
      System.out.println("Alumno " + i);  
      System.out.println("Nombre: " + alum[i].nombre);    
      System.out.println("Nota media: " + alum[i].notaMedia);
      System.out.println("----------------------------");

      sumaDeMedias += alum[i].notaMedia;
    } // for i
    
    System.out.println("La media global de la clase es " + sumaDeMedias / 5);
  }
}
