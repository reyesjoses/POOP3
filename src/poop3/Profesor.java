/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop3;

/**
 * Clase que representa a un profesor con atributos como carrera, conocimiento,
 * empatía, cuenta bancaria e inteligencia. La clase también contiene métodos
 * para realizar diversas acciones que un profesor puede realizar, como exponer
 * temas, dirigir clases, crear habilidades y evaluar a los estudiantes.
 * 
 * @author evare
 */
class Profesor {
    
    // Atributos de la clase Profesor
    String carrera;           // Carrera del profesor
    int conocimiento;         // Nivel de conocimiento del profesor
    boolean empatia;          // Nivel de empatía del profesor
    int cuenta;               // Número de cuenta bancaria del profesor
    boolean inteligencia;     // Indica si el profesor tiene alta inteligencia

    /**
     * Constructor por defecto. Inicializa los atributos de la clase con valores predeterminados.
     */
    public Profesor(){}

    /**
     * Constructor que permite inicializar los atributos de la clase con los valores dados.
     *
     * @param carrera La carrera del profesor.
     * @param conocimiento El nivel de conocimiento del profesor.
     * @param empatia La empatía del profesor.
     * @param cuenta El número de cuenta bancaria del profesor.
     * @param inteligencia La inteligencia del profesor.
     */
    public Profesor(String carrera, int conocimiento, boolean empatia, int cuenta, boolean inteligencia){
        this.conocimiento = conocimiento;
        this.carrera = carrera;
        this.empatia = empatia;
        this.cuenta = cuenta; // Número de cuenta bancaria
        this.inteligencia = inteligencia;
    }

    /**
     * Método que simula la exposición de un tema importante por parte del profesor.
     */
    public void exponer(){
        System.out.println("El profesor expondrá un tema de suma importancia para los alumnos.");
    }

    /**
     * Método que simula la acción del profesor de dirigir una clase, dependiendo
     * de su nivel de empatía.
     */
    public void dirigir(){
        if (empatia == true){
            System.out.println("El profesor puede dirigir una buena clase.");
        }
        else{
            System.out.println("El profesor no será muy bueno dirigiendo la clase.");
        }
    }

    /**
     * Método que permite al profesor crear y demostrar sus habilidades.
     * Si el profesor tiene inteligencia, se sugiere que puede estudiar para obtener otro grado.
     */
    public void crearHabilidad(){
        System.out.println("¿El profesor es muy inteligente?");
        if(inteligencia == true){
            System.out.println("Sí, el profesor es muy inteligente.");
            System.out.println("Puede estudiar para obtener otro grado.");
        }else{
            System.out.println("No lo suficiente.");
        }
    }

    /**
     * Método estático que simula la creación de exámenes para evaluar a los alumnos.
     * 
     * @return Retorna `true`, indicando que los exámenes han sido creados.
     */
    public static boolean crearExamenes(){
        System.out.println("Es momento de evaluar a los alumnos.");
        return true;
    }

    /**
     * Método que simula el proceso de evaluación de los estudiantes.
     * Primero, verifica si los exámenes han sido creados.
     */
    public void evaluar(){
        boolean a = crearExamenes();
        if (a == true){
            System.out.println("Ya se han aplicado los exámenes y se puede evaluar.");
        }
        else{
            System.out.println("Aún no se aplican los exámenes, no se puede evaluar.");
        }
    }

    /**
     * Método para imprimir los datos del profesor.
     * Este método actualmente no está implementado.
     */
    void imprimirDatos() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
