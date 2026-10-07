import java.util.Scanner;

class Persona{
    String nombre;
    float peso;
    float altura;
}

public class PesosYaltura { 

    public static void main (String[] args){
    Scanner teclado = new Scanner (System.in);

    Persona p1 = new Persona();
    Persona p2 = new Persona();
    Persona p3 = new Persona();

    System.out.print("Introduce tu nombre: ");
    p1.nombre = teclado.next();
    System.out.print("Introduce tu peso: ");
    p1.peso = teclado.nextFloat();
    System.out.print("Introduce tu altura: ");
    p1.altura = teclado.nextFloat();

    System.out.print("\nIntroduce tu nombre: ");
    p2.nombre = teclado.next();
    System.out.print("Introduce tu peso: ");
    p2.peso = teclado.nextFloat();
    System.out.print("Introduce tu altura: ");
    p2.altura = teclado.nextFloat();

    System.out.print("\nIntroduce tu nombre: ");
    p3.nombre = teclado.next();
    System.out.print("Introduce tu peso: ");
    p3.peso = teclado.nextFloat();
    System.out.print("Introduce tu altura: ");
    p3.altura = teclado.nextFloat();

    float pesado = p1.peso; 
    float alto = p1.altura;
    String masPesado = p1.nombre;
    String masAlto = p1.nombre;

    if(p2.peso > pesado){
        pesado = p2.peso;
        masPesado = p2.nombre;
    }
    if(p3.peso > pesado){
        pesado = p3.peso;
        masPesado = p3.nombre;
    }

    if(p2.altura > alto ){
        alto = p2.altura;
        masAlto = p2.nombre;
    }
    if(p3.altura > alto){
        alto = p3.altura;
        masAlto = p3.nombre;
    }
        
    System.out.printf("\n\nEl más pesado es %s \n", masPesado);
    System.out.printf("El más alto es %s ", masAlto);

    }
}