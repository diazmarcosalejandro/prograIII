import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int n1, n2;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=================================");
        System.out.println("       SUMA DE DOS NÚMEROS       ");
        System.out.println("=================================");
        System.out.print("\nIntroduce el primer número: ");
        n1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        n2 = sc.nextInt();

        int suma = n1 + n2;

        System.out.printf("\nEl resultado de la suma es: %d", suma);
        
    }
}
