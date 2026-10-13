import java.util.Scanner;
/* 

1. Escribe un programa que solicite el año de nacimiento de una persona y 
el año actual. Suponiendo que ya ha cumplido años, se calculará la edad.
Revisa el uso de la clase Scanner, el método printf (viejo conocido de C)
de System.out. La sintaxis es similar a la que ya conocéis.
¿Diferencia con println?

*/

public class App {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int anioNacimiento, anioActual;

        System.out.print("Introduce el año de nacimiento: ");
        anioNacimiento = sc.nextInt();
        System.out.print("Introduce el año actual: ");
        anioActual = sc.nextInt();

        System.out.printf("\nSu edad actual es %d años", anioActual - anioNacimiento);

        sc.close();
    }
}
