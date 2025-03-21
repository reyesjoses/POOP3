
package poop3;

/**
 * Clase que representa a un perro con atributos como nombre, raza, color de pelo,
 * color de ojos y tamaño. Esta clase también incluye métodos que simulan las acciones
 * comunes que un perro puede realizar, como comer, dormir, correr, caminar y jugar.
 * 
 * @author evare
 */
class Perro {
    
    // Atributos de la clase Perro
    String nombre;          // Nombre del perro
    String raza;            // Raza del perro
    String colorDePelo;     // Color del pelaje del perro
    String colorDeOjos;     // Color de los ojos del perro
    float tamano;           // Tamaño del perro (en unidades de medida, por ejemplo, metros)

    /**
     * Constructor por defecto. Inicializa los atributos de la clase con valores predeterminados.
     */
    public Perro(){}

    /**
     * Constructor que permite inicializar los atributos del perro con los valores dados.
     *
     * @param nombre Nombre del perro.
     * @param raza Raza del perro.
     * @param colorDePelo Color del pelaje del perro.
     * @param colorDeOjos Color de los ojos del perro.
     * @param tamano Tamaño del perro.
     */
    public Perro(String nombre, String raza, String colorDePelo, String colorDeOjos, float tamano){
        this.nombre = nombre;
        this.raza = raza;
        this.colorDePelo = colorDePelo;
        this.colorDeOjos = colorDeOjos;
        this.tamano = tamano;
    }

    /**
     * Método que simula la acción de un perro comiendo. 
     * Imprime un mensaje indicando que el perro está comiendo.
     */
    public void comer(){
        System.out.println(nombre + " esta comiendo");
    }

    /**
     * Método que simula la acción de un perro durmiendo.
     * Imprime un mensaje indicando que el perro es muy dormilón.
     */
    public void dormir(){
        System.out.println(nombre + " es un perro muy dormilón");
    }

    /**
     * Método que simula la acción de un perro corriendo.
     * Imprime un mensaje indicando que el perro corre muy rápido.
     */
    public void correr(){
        System.out.println(nombre + " corre muy rápido");
    }

    /**
     * Método que simula la acción de un perro caminando.
     * Imprime un mensaje indicando que el perro está caminando.
     */
    public void caminar(){
        System.out.println("El perro camina");
    }

    /**
     * Método que simula la acción de un perro jugando.
     * Imprime un mensaje indicando que el perro está jugando.
     */
    public void jugar(){
        System.out.println(nombre + " esta jugando");
    }
}
