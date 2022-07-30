
package Modelo;

//se crea una clase abstracta padre, la cual tendra un metodo abstracto que sera  implementado por las clases hijas
public abstract class Nave {
    
    // se declaran dos atributos que tienen en comun sus clases hijas, los cuales heredaran
    private double peso;
    private String modelo;

    
    //se crea el constructor de la clase la cual recibe dos parametros para inicializar los atributos declarados anteriormente
    public Nave(double peso, String modelo) {
        
        //se inicializan los atributos con las variables que se reciben por medio del constructor
        this.peso = peso;
        this.modelo = modelo;
        
    }   
    
    //se crean metodos get que serna los que retonaran los valores de cada atributo
    public double getPeso() {
        return peso;
    }

    public String getModelo() {
        return modelo;
    } 
    
    
    //se declara un metodo abstracto, el cual sera implementado por las clases hijas
    public abstract String Registrar();
    
}
