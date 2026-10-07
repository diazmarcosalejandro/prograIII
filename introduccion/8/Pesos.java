import java.util.Scanner;

public class Pesos { 
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);

    String n1, n2, n3;
    float p1, p2, p3, a1,a2,a3;

    System.out.print("Introduce tu nombre: ");
    n1 = teclado.next();
    System.out.print("Introduce tu peso: ");
    p1 = teclado.nextFloat();
    System.out.print("Introduce tu altura: ");
    a1 = teclado.nextFloat();

    System.out.print("\nIntroduce tu nombre: ");
    n2 = teclado.next();
    System.out.print("Introduce tu peso: ");
    p2 = teclado.nextFloat();
    System.out.print("Introduce tu altura: ");
    a2 = teclado.nextFloat();

    System.out.print("\nIntroduce tu nombre: ");
    n3 = teclado.next();
    System.out.print("Introduce tu peso: ");
    p3 = teclado.nextFloat();
    System.out.print("Introduce tu altura: ");
    a3 = teclado.nextFloat();

    float pesado = p1; 
    float alto = a1;
    String masPesado = n1;
    String masAlto = n1;

    if(p2 > pesado){
        pesado = p2;
        masPesado = n2;
    }
    if(p3 > pesado){
        pesado = p3;
        masPesado = n3;
    }

    if(a2 > alto ){
        alto = a2;
        masAlto = n2;
    }
    if(a3 > alto){
        alto = a3;
        masAlto = n3;
    }
        
    System.out.printf("\n\nEl más pesado es %s \n", masPesado);
    System.out.printf("El más alto es %s ", masAlto);

    }
}