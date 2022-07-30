
package Modelo;

//se crea una clase hija que hereda o extiende la clase padre Nave, la cual implementa los metodos abstractos y heredas los atributos de la clase padre
public class Tripulada extends Nave{
    
    //se declara un atributo propio de la clase hija como lo es cantidad_personas
    private int cantidad_personas;

    //se declara el contructor donde se reciben las variables las cuales inicializaran las varaibles de la clase padre y la actual
    public Tripulada(int cantidad_personas, double peso, String modelo) {
        super(peso, modelo); //por medio de esta mensiosn se envian los atributos a la clase padre para que sean inicializadas por medio del constructor de la clase padre
        this.cantidad_personas = cantidad_personas; //se inicializa la variable de la clase con la variable que se recibe por el constructor
    }

     // se crea el metodo get el cual retornara un valor de tipo  int
    public int getCantidad_personas() {
        return cantidad_personas;
    }
    
    //este metodo no retorna ningun valor, solo es para mostrar informacion al usaurio
    public void InformacionTripulada(){
        System.out.println("\nINOFRMACION IMPORTANTE: \n- Este tipo de nave sirve para trasnportar personas al espacio con distintos fines.");
    }
    
    //este metodo es una sobrecarga del metodo anterior, muetra informacion adiconal al usuario, el cual muestra informacion adiocnal, recibe como parametros una variable tipo String, la cual ers eviada desde donde se invoca
    public void InformacionTripulada(String info){
        System.out.println(info);
    }
    
     //se implementa el metodo abstracto heredado de la clase padre
    public String Registrar(){
        
        //retorna un valor de tipo String, el cual contendra un mensaje indicando que el proceso se realizo con exito y mostrara los datos capturados por consola
        return "La Navese ha Registrado con los siguientes datos: \n\nModelo: "+this.getModelo().toUpperCase()+"\nPeso (kg) : "+this.getPeso()+"\nCantidad de personas: "+this.getCantidad_personas()+"\n\n";
    }
}
