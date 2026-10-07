public class Primitivos{

    public static void main(String[] args){

        int n1=5;
        int n2=10;
        int suma = n1 + n2;

        System.out.println("La suma es: " + suma);

        //Segunda parte

        double n3 = 5.5;
        long n4 = 10000000000l;
        char c1 = 'A';
        boolean b1 = true;

        float n5 = 3.14f;

        double suma2 = n1 + n3;
        System.out.println("La suma es: " + suma2);

        int divisionEntera = 5 / 2;
        double divisionConDouble = (double)5 / 2;

        System.out.println("5 / 2 guardado en int: " + divisionEntera);
        System.out.println("5 / 2 guardado en double: " + divisionConDouble);

    }
} 