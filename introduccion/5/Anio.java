import java.util.Scanner;

public class Anio{

    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.print("Introduce el año de nacimiento: ");
    int aNacimiento = teclado.nextInt();
    System.out.print("Introduce el año actual: ");
    int aActual = teclado.nextInt();

    int edad = aActual - aNacimiento;
    System.out.println("La edad es: " + edad);
    }
}