import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        int entero;

        System.out.print("Introduce un número entero: ");
        entero = teclado.nextInt();
        for(int i = 0; i<entero; i++)
        System.out.println("Hello, World!");
    }
}
