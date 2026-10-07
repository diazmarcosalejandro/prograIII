package otros;
import java.util.Scanner;

public class App{
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double numero2 = sc.nextDouble();

        int opcion;

        do{
            System.out.println("\n--- CALCULADORA ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Calcular la raiz cuadrada");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
        } while(opcion < 1 || opcion > 4);
 
    }
}