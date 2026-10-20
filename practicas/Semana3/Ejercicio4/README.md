# Análisis del Flujo de Ejecución: Constructor vs Inicialización de Atributos

Para comprobar el orden de ejecución, he modificado la clase `Person` asignando valores directamente en la declaración de los atributos y valores distintos dentro del constructor:

```java
public class Person {
    // Inicialización directa en la declaración
    private String nombre = "ValorDeclaracion";
    private float altura = 1.0f;
    private float peso = 10.0f;

    public Person() {
        // Inicialización dentro del constructor
        this.nombre = "Desconocido"; 
        this.altura = 0.0f;
        this.peso = 0.0f;
    }
    // ...
}
```

Posteriormente, he colocado puntos de interrupción (*breakpoints*) tanto en la línea de la declaración del atributo como dentro del constructor, y he iniciado la depuración con `new Person()`.

---

## Conclusión

Al depurar paso a paso el programa, he comprobado que **la inicialización en la declaración del atributo se ejecuta antes que el constructor**.

El flujo observado en la ejecución es el siguiente:
1. Al instanciarse el objeto con `new`, primero se evalúan y asignan los valores definidos directamente en la **declaración de los atributos**.
2. Justo después, pasa a ejecutarse el cuerpo del **constructor**, el cual termina sobrescribiendo los valores asignados previamente.

