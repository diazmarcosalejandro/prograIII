import java.util.Scanner;
public class GoalAvg{

    public static void main(String[] args) {

        int totalGoles = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.print("¿Cuántos goles ha metido el equipo en el partido " + (i+1) + "? : ");
           
            totalGoles += teclado.nextInt();
        }

        double goalAvg = totalGoles / 10.0f;
        System.out.print("El promedio de goles por partido es: " + goalAvg);
        
    }
}