import es.usal.progiii.tools.Esdia;

public class Main {
    public static void main(String[] args) {
        
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person elQueMas = new Person();

        p1.setNombre(Esdia.readString_ne("\nIntroduce el nombre de la persona 1: "));
        p1.setAltura(Esdia.readFloat("Introduce la altura de " + p1.getNombre() + " (en m): " ));
        p1.setPeso(Esdia.readFloat("Introduce el peso de " + p1.getNombre() + " (en kg): " ));

        p2.setNombre(Esdia.readString_ne("\nIntroduce el nombre de la persona 2: "));
        p2.setAltura(Esdia.readFloat("Introduce la altura de " + p2.getNombre() + " en (m): " ));
        p2.setPeso(Esdia.readFloat("Introduce el peso de " + p2.getNombre() + " en (kg): " ));

        p3.setNombre(Esdia.readString_ne("\nIntroduce el nombre de la persona 3: "));
        p3.setAltura(Esdia.readFloat("Introduce la altura de " + p3.getNombre() + " (en m): " ));
        p3.setPeso(Esdia.readFloat("Introduce el peso de " + p3.getNombre() + " (en kg): " ));

        elQueMas.setAltura(p1.getAltura());
        elQueMas.setPeso(p1.getPeso());

        if(p1.getAltura() == p2.getAltura() && p1.getAltura() == p3.getAltura())
            System.out.printf("\nLas tres personas son igual de altas con %.2f m.", elQueMas.getAltura());
        else if(p1.getAltura() == p2.getAltura() && p1.getAltura() > p3.getAltura())
            System.out.printf("\nLos más altos son %s y %s, con %.2f m.", p1.getNombre(), p2.getNombre(), elQueMas.getAltura());
        else if(p1.getAltura() == p3.getAltura() && p1.getAltura() > p2.getAltura())
            System.out.printf("\nLos más altos son %s y %s, con %.2f m.", p1.getNombre(), p3.getNombre(), elQueMas.getAltura());
        else if(p2.getAltura() == p3.getAltura() && p2.getAltura() > p1.getAltura()){
            elQueMas.setAltura(p2.getAltura());
            System.out.printf("\nLos más altos son %s y %s, con %.2f m.", p2.getNombre(), p3.getNombre(), elQueMas.getAltura());             
        }
        else if(p1.getAltura() > p2.getAltura() && p1.getAltura() > p3.getAltura())
            System.out.printf("\nEl más alto es %s con %.2f m.", p1.getNombre(), elQueMas.getAltura()); 

        else if(p2.getAltura() > p1.getAltura() && p2.getAltura() > p3.getAltura()){
            elQueMas.setAltura(p2.getAltura());
            System.out.printf("\nEl más alto es %s con %.2f m.", p2.getNombre(), elQueMas.getAltura()); 
        }
        else{
            elQueMas.setAltura(p3.getAltura());
            System.out.printf("\nEl más alto es %s con %.2f m.", p3.getNombre(), elQueMas.getAltura()); 
        }

        if(p1.getPeso() == p2.getPeso() && p1.getPeso() == p3.getPeso())
            System.out.printf("\nLas tres personas pesan igual con %.2f kg.", elQueMas.getPeso());
        else if(p1.getPeso() == p2.getPeso() && p1.getPeso() > p3.getPeso())
            System.out.printf("\nLos que más pesan son %s y %s con %.2f kg.", p1.getNombre(), p2.getNombre(), elQueMas.getPeso());
        else if(p1.getPeso() == p3.getPeso() && p1.getPeso() > p2.getPeso())
            System.out.printf("\nLos que más pesan son %s y %s con %.2f kg.", p1.getNombre(), p3.getNombre(), elQueMas.getPeso());
        else if(p2.getPeso() == p3.getPeso() && p2.getPeso() > p1.getPeso()){
            elQueMas.setPeso(p2.getPeso());
            System.out.printf("\nLos que más pesan son %s y %s con %.2f kg.", p2.getNombre(), p3.getNombre(), elQueMas.getPeso());             
        }
        else if(p1.getPeso() > p2.getPeso() && p1.getPeso() > p3.getPeso())
            System.out.printf("\nEl que más pesa es %s con %.2f kg.", p1.getNombre(), elQueMas.getPeso()); 

        else if(p2.getPeso() > p1.getPeso() && p2.getPeso() > p3.getPeso()){
            elQueMas.setPeso(p2.getPeso());
            System.out.printf("\nEl que más pesa es %s con %.2f kg.", p2.getNombre(), elQueMas.getPeso()); 
        }
        else{
            elQueMas.setPeso(p3.getPeso());
            System.out.printf("\nEl que más pesa es %s con %.2f kg.", p3.getNombre(), elQueMas.getPeso()); 
        }

        System.out.println("\n\nIMC DE CADA PERSONA: ");
        System.out.printf("\nEl IMC de %s es %.2f\n", p1.getNombre(), p1.calcularIMC());
        System.out.printf("El IMC de %s es %.2f\n", p2.getNombre(), p2.calcularIMC());
        System.out.printf("El IMC de %s es %.2f\n", p3.getNombre(), p3.calcularIMC());
        
    }
}
