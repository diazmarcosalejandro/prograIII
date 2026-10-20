public class Person {
    private String nombre = "Declaracion";
    private float altura = 1.0f ;
    private float peso = 70.0f ;


    public Person() {   
        this.nombre = "Desconocido"; 
        this.altura = 0;
        this.peso = 0.0f;
    }   

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public float getAltura(){
        return this.altura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getPeso(){
        return this.peso;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }

    public float calcularIMC(){
        
        if(this.altura <= 0 || this.peso <= 0){
            System.out.println("Error. Los valores no son válidos");
            return -1.0f;
        }
        else{
            return (this.peso / (this.altura * this.altura));
        }
    }
}