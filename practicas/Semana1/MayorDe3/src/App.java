import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n==================================");
        System.out.println("       NUMERO MAYOR ENTRE 3       ");
        System.out.println("==================================\n");

        int n1,n2,n3, mayor;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el primer numero: ");
        n1 = sc.nextInt();
        System.out.print("Introduce el segundo numero: ");
        n2 = sc.nextInt();
        System.out.print("Introduce el tercer numero: ");
        n3 = sc.nextInt();

        mayor = n1; 

        if(n1 == n2 && n1 == n3)
            System.out.printf("Los tres números son iguales y su valor es %d", mayor);
        else if(n1 == n2 && n1 > n3)
            System.out.printf("El mayor es el %d y son el primer y segundo número introducidos", mayor);
        else if(n1 == n3 && n1 > n2)
                System.out.printf("El mayor es el %d y son primer y tercer número introducidos", mayor);
        else if(n2 == n3 && n2 > n1){
            mayor = n2;
            System.out.printf("El mayor es el %d y son el segundo y tercer número introducidos", mayor);                }
        else if(n1 > n2 && n1 > n3)
            System.out.printf("El mayor es el %d y es el primer numero introducido ", mayor);
        else if(n2 > n1 && n2 > n3){
            mayor = n2; 
            System.out.printf("El mayor es el %d y es el segundo numero introducido ", mayor);
        }
        else{
            mayor = n3;
            System.out.printf("El mayor es el %d y es el tercer numero introducido ", mayor);
        }

        sc.close();
    }
}
