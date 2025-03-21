
package poop3;

/**
 * Clase que representa a un alumno con atributos como número de cuenta, semestre,
 * promedio y nombre. Esta clase también incluye métodos que simulan las acciones
 * comunes que un alumno puede realizar, como estudiar, hacer tareas, inscribirse,
 * hacer exámenes y tomar apuntes.
 * 
 * @author evare
 */
public class Alumno {
    
    // Atributos de la clase Alumno
    int numeroDeCuenta;   // Número de cuenta del alumno
    int semestre;          // Semestre en el que se encuentra el alumno
    float promedio;        // Promedio del alumno
    String nombre;         // Nombre del alumno

    /**
     * Constructor por defecto. Inicializa los atributos de la clase con valores predeterminados.
     */
    public Alumno(){}

    /**
     * Constructor que permite inicializar los atributos del alumno con los valores dados.
     *
     * @param numeroDeCuenta Número de cuenta del alumno.
     * @param semestre Semestre en el que se encuentra el alumno.
     * @param promedio Promedio del alumno.
     * @param nombre Nombre del alumno.
     */
    public Alumno(int numeroDeCuenta, int semestre, float promedio, String nombre){
        this.numeroDeCuenta = numeroDeCuenta;
        this.semestre = semestre;
        this.promedio = promedio;
        this.nombre = nombre;
    }

    /**
     * Método que simula la acción de estudiar. Si el promedio es menor o igual a 6,
     * se le indica al alumno que debe estudiar más.
     */
    public void estudiar(){
        if(promedio <= 6){
            System.out.println("Tu promedio es de "+promedio);
            System.out.println("Debes de estudiar más");
        }
    }

    /**
     * Método que simula la acción de hacer tareas. Imprime el número de tareas que
     * el alumno debe hacer y muestra un mensaje indicando que está haciendo cada tarea.
     */
    public void hacerTareas(){
        int tareas = 5;  // Número de tareas a hacer
        System.out.println("El alumno debe de hacer "+ tareas + " tareas");
        for (int i = 0; i < tareas; i++) {
            System.out.println("Haciendo tarea... " + (i+1));
        }
        System.out.println("Se han terminado las tareas");
    }

    /**
     * Método que simula el proceso de inscripción. Muestra los datos necesarios para
     * que el alumno se inscriba, como el número de cuenta, nombre y promedio.
     */
    public void incribirse(){
        System.out.println("Los datos para inscribirse son los siguientes:");
        System.out.println("Número de cuenta: " + numeroDeCuenta);
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio del semestre anterior: " + promedio);
    }

    /**
     * Método que simula la temporada de exámenes. Muestra un mensaje indicando que
     * el alumno está presentando algún examen parcial.
     */
    public void hacerExamenes(){
        System.out.println("--TEMPORADA DE EXÁMENES--");
        System.out.println("El alumno presenta algún examen parcial.");
    }

    /**
     * Método que simula el acto de tomar apuntes en clase. Imprime un mensaje indicando
     * que el alumno está tomando apuntes durante las clases.
     */
    public void tomarApuntes(){
        System.out.println("--EN CLASES...--");
        System.out.println("El alumno toma apuntes durante sus clases.");
    }
}
