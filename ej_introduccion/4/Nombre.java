public class Nombre {

    public static void main(String[] args) {
       String nombre = "Alejandro";
       String apellido1 = "Díaz";
       String apellido2 = "Marcos";

       int n = nombre.length();
       int a1 = apellido1.length();
       int a2 = apellido2.length();

       System.out.println("El nombre tiene " + n + " letras");
       System.out.println("El primer apellido tiene " + a1 + " letras");
       System.out.println("El segundo apellido tiene " + a2 + " letras");
    
    }
}