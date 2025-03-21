/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop3;

/**
 * Esta clase es la clase principal del programa, donde se crean instancias de diferentes 
 * clases como Punto, Pokemon, Profesor, Alumno y Perro, y se invocan los métodos de 
 * estas clases para demostrar su funcionamiento. 
 * 
 * La clase ejecuta una serie de acciones como imprimir los atributos de los objetos, 
 * llamar a métodos de las clases y manipular objetos con los valores proporcionados.
 * 
 * @author evare
 */
public class POOP3 {

    /**
     * Método principal donde se crea y manipula una serie de objetos de diferentes clases.
     * Se muestran las capacidades de las clases definidas anteriormente.
     * 
     * @param args Los argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        
        // Crear un entero y mostrarlo
        int a = 5;
        System.out.println(a);
        
        // Creación de un objeto de la clase Punto y manipulación de sus atributos
        Punto punto = new Punto();
        System.out.println(punto); // Imprime la referencia del objeto punto
        punto.imprimePunto(); // Imprime los valores iniciales de los atributos del objeto
        punto.x = 3;
        punto.y = 6;
        punto.imprimePunto(); // Imprime los valores actualizados de los atributos
        
        // Creación de un objeto de la clase Punto usando el constructor con parámetros
        Punto punto2 = new Punto(4, 5);
        punto2.imprimePunto(); // Imprime los valores del objeto punto2
        
        // Creación de un objeto de la clase Pokemon y llamada a su método
        Pokemon snorlax = new Pokemon();
        snorlax.atacar(); // Llama al método atacar() del objeto snorlax
        
        System.out.println("******CLASE PROFESOR*********");
        // Creación de un objeto de la clase Profesor y asignación de atributos
        Profesor profesor1 = new Profesor();
        profesor1.carrera = "Ingenieria en Computacion";
        profesor1.conocimiento = 100;
        profesor1.cuenta = 455888;
        profesor1.empatia = true;
        profesor1.inteligencia = true;
        
        // Llamada a los métodos de la clase Profesor
        profesor1.exponer();
        profesor1.dirigir();
        profesor1.crearHabilidad();
        profesor1.evaluar();
        
        System.out.println("*******CLASES ALUMNO******");
        // Creación de un objeto de la clase Alumno y asignación de atributos
        Alumno alumno = new Alumno();
        alumno.nombre = "Jose Manuel";
        alumno.numeroDeCuenta = 321287853;
        alumno.promedio = 5.6f;
        alumno.semestre = 2;
        
        // Llamada a los métodos de la clase Alumno
        alumno.estudiar();
        alumno.tomarApuntes();
        alumno.hacerTareas();
        alumno.hacerExamenes();
        alumno.incribirse();
        
        System.out.println("*****CLASE PERRO*****");
        // Creación de un objeto de la clase Perro y asignación de atributos
        Perro perro = new Perro();
        perro.colorDeOjos = "cafes";
        perro.nombre = "max";
        perro.tamano = 56.5f;
        perro.colorDePelo = "blanco";
        perro.raza = "husky";
        
        // Llamada a los métodos de la clase Perro
        perro.dormir();
        perro.comer();
        perro.correr();
    }
}
