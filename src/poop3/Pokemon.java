/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop3;

/**
 * Clase que representa un Pokémon con atributos de combate como ataque, defensa,
 * defensa especial, ataque especial y velocidad. Esta clase incluye métodos
 * para realizar diferentes acciones que un Pokémon puede ejecutar durante un combate.
 * 
 * @author evare
 */
public class Pokemon {
    
    // Atributos de la clase Pokémon
    int ataque;              // Nivel de ataque físico del Pokémon
    int defensa;             // Nivel de defensa física del Pokémon
    int defensaEspecial;     // Nivel de defensa especial del Pokémon
    int ataqueEspecial;      // Nivel de ataque especial del Pokémon
    float velocidad;         // Velocidad del Pokémon

    /**
     * Constructor por defecto. Inicializa los atributos de la clase con valores predeterminados.
     */
    public Pokemon(){}

    /**
     * Constructor que permite inicializar los atributos de la clase con los valores dados.
     *
     * @param ataque El nivel de ataque físico del Pokémon.
     * @param defensa El nivel de defensa física del Pokémon.
     * @param defensaEspecial El nivel de defensa especial del Pokémon.
     * @param ataqueEspecial El nivel de ataque especial del Pokémon.
     * @param velocidad La velocidad del Pokémon.
     */
    public Pokemon(int ataque, int defensa, int defensaEspecial, int ataqueEspecial, float velocidad){
        this.ataque = ataque;
        this.defensa = defensa;
        this.defensaEspecial = defensaEspecial;
        this.ataqueEspecial = ataqueEspecial;
        this.velocidad = velocidad;
    }

    /**
     * Método que simula el ataque de un Pokémon.
     * Imprime un mensaje indicando que el Pokémon va a atacar.
     */
    public void atacar(){
        System.out.println("Te voy a atacar");
    }

    /**
     * Método que simula el uso de un objeto durante el combate por parte del Pokémon.
     * 
     * @param objeto El objeto que el Pokémon va a usar.
     */
    public void usarObjeto(String objeto){
        System.out.println("He usado el objeto " + objeto);
    }

    /**
     * Método que simula el momento en que el Pokémon se rinde y se va a curar.
     */
    public void rendirse(){
        System.out.println("Me voy a curar");
    }

    /**
     * Método que simula la acción de defenderse durante un combate.
     * Imprime un mensaje indicando que el Pokémon se está defendiendo.
     */
    public void defender(){
        System.out.println("Se defiende");
    }
}
