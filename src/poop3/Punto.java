/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop3;

/**
 * Clase que representa un punto en un plano cartesiano.
 * La clase contiene dos atributos enteros, `x` e `y`, que definen las coordenadas
 * del punto, así como métodos para inicializar el punto y mostrar sus valores.
 * 
 * @author evare
 */
public class Punto {
    
    // Atributos que representan las coordenadas del punto
    int x; // Coordenada en el eje X
    int y; // Coordenada en el eje Y

    /**
     * Constructor por defecto que inicializa las coordenadas del punto en 0.
     * Este constructor es opcional, ya que las coordenadas pueden establecerse
     * posteriormente mediante el otro constructor.
     */
    public Punto() {}

    /**
     * Constructor que inicializa las coordenadas del punto con los valores dados.
     * 
     * @param x La coordenada en el eje X del punto.
     * @param y La coordenada en el eje Y del punto.
     */
    public Punto(int x, int y){
       this.x = x;
       this.y = y;
    }

    /**
     * Método que imprime las coordenadas del punto en la consola.
     * Este método muestra las coordenadas X e Y del punto en un formato legible.
     */
    public void imprimePunto(){
        System.out.println("X = " + x + " Y = " + y);
    }
}
