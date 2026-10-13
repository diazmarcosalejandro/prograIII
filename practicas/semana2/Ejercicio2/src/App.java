import java.io.Console;

public class App {
    public static void main(String[] args) {
        Console cs = System.console();
        int anioNacimiento = Integer.parseInt(cs.readLine("Introduce el año de nacimiento: "));
        int anioActual = Integer.parseInt(cs.readLine("Introduce ahora el año actual: "));
        cs.printf("La edad es %d años.", anioActual - anioNacimiento);
    }
}
