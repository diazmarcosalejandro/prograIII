import es.usal.progiii.tools.Esdia;
public class App {
    public static void main(String[] args){
        int n,i;
        float f, suma=0;

        do{
            n = Esdia.readInt("Introduce un numero entero mayor que 0: ");
            if(n<=0){
                System.err.println("Error. El número introducido no es válido\n");
            }
        }while(n<=0);


        for(i=0; i<n; i++){
            f = Esdia.readFloat("Introduce un numero real: ");
            suma+=f;
        }

        System.out.printf("La media aritmética es %f.", suma/n );
    }
}