import java.util.Scanner;
public class Tablas { 

    public static void main (String[] args) {

        Scanner teclado = new Scanner (System.in);

        String n1, n2, n3;
        int e1, e2, e3;
        int t1, t2, t3;

        System.out.print("Introduce el primer nombre: ");
        n1 = teclado.next();
        System.out.print("Introduce la edad: ");
        e1 = teclado.nextInt();
        System.out.print("Introduce la talla: ");
        t1 = teclado.nextInt();

        System.out.print("\nIntroduce el segundo nombre: ");
        n2 = teclado.next();
        System.out.print("Introduce la edad: ");
        e2 = teclado.nextInt();
        System.out.print("Introduce la talla: ");
        t2 = teclado.nextInt();

        System.out.print("\nIntroduce el tercer nombre: ");
        n3 = teclado.next();
        System.out.print("Introduce la edad: ");
        e3 = teclado.nextInt();
        System.out.print("Introduce la talla: ");
        t3 = teclado.nextInt();

        System.out.printf("\n%-15s %-10s %-10s \n", "NOMBRE", "EDAD", "TALLA" );
        System.out.println("===================================");
        System.out.printf("%-15s %-10d %-10d\n", n1, e1, t1);
        System.out.printf("%-15s %-10d %-10d\n", n2, e2, t2);
        System.out.printf("%-15s %-10d %-10d\n", n3, e3, t3);
    }
}