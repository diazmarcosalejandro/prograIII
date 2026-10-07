import java.util.Scanner;
import es.usal.progiii.tools.Esdia;

class Fruta{
    String nombre;
    double precioSinIVA;
    double precioConIVA;
    double precioFinal;
    double peso;
}

public class Facturas{

    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);

    double IVA = 0.21;
    
    Fruta manzana = new Fruta();
    manzana.nombre = "Manzanas";

    Fruta pera = new Fruta();
    pera.nombre = "Peras";

    System.out.println("\n===============================================");
    System.out.println("BIENVENIDO AL PROGRAMA DE CREACION DE FACTURAS");
    System.out.println("===============================================");

    manzana.precioSinIVA = Esdia.readDouble("\nIntroduce el precio de hoy de las MANZANAS (sin IVA): ");
    pera.precioSinIVA = Esdia.readDouble("\nIntroduce el precio de hoy de las PERAS (sin IVA): ");

    manzana.precioConIVA = manzana.precioSinIVA + (manzana.precioSinIVA * IVA);
    pera.precioConIVA = pera.precioSinIVA + (pera.precioSinIVA * IVA);


    String opcion;  
    int numCliente = 1;

    do{
    
    System.out.printf("\nCLIENTE %d: \n", numCliente);
    manzana.peso = Esdia.readDouble("Introduce la cantidad de manzanas: ");
    pera.peso = Esdia.readDouble("Introduce la cantidad de peras: ");

    manzana.precioFinal = manzana.precioConIVA * manzana.peso;
    pera.precioFinal = pera.precioConIVA * pera.peso;
    double total = manzana.precioFinal + pera.precioFinal;

    System.out.println("\n|---------------------------------------------|");
    System.out.printf("| Cliente                               |  %d  |\n", numCliente  );
    System.out.printf("| Manzanas | %.2f kg | precio Kg con IVA %.2f | %.2f €|\n", manzana.peso, manzana.precioConIVA, manzana.precioFinal );
    System.out.printf("| Peras    | %.2f kg | precio Kg con IVA %.2f | %.2f €|\n", pera.peso, pera.precioConIVA, pera.precioFinal );
    System.out.println("|---------------------------------------------|\n");
    System.out.printf("|Total con IVA                          %.2f €|\n", total);
    System.out.println("|---------------------------------------------|\n");
    numCliente++;       
    System.out.println("\n=========    SELECCIONA UNA OPCIÓN    =========");
    System.out.println("A) Añadir cliente");
    System.out.println("B) Salir");
    opcion = Esdia.readString("OPCIÓN: ");


    }while(!opcion.equalsIgnoreCase("b"));

    System.out.println("¡Caja cerrada!");
    



    







    }



}