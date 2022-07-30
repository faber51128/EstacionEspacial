
package Modelo;

//se crea una clase hija que hereda o extiende la clase padre Nave, la cual implementa los metodos abstractos y heredas los atributos de la clase padre

import Controlador.ControladorRegisConsult;


public class Lanzadora extends Nave {
    ControladorRegisConsult controlador=  new ControladorRegisConsult();  //creamos un objeto de la clase ocntrolador para poder pasar los datos a registrar en la lista
    
    //se declara un atributo propio de la clase hija como lo es Cantidad_Combustible
    private double Cantidad_Combustibe;

    
    //se declara el contructor donde se reciben las variables las cuales inicializaran las varaibles de la clase padre y la actual
    public Lanzadora(double Cantidad_Combustibe, double peso, String modelo ) {
        
        super(peso, modelo);  //por medio de esta mensiosn se envian los atributos a la clase padre para que sean inicializadas por medio del constructor de la clase padre
        this.Cantidad_Combustibe = Cantidad_Combustibe; //se inicializa la variable de la clase con la variable que se recibe por el constructor
    }
    

    // se crea el metodo get el cual retornara un valor de tipo  double
    public double getCantidad_Combustibe() {
        return Cantidad_Combustibe;
    }
    

    //este metodo no retorna ningun valor, solo es para mostrar informacion al usaurio
    public void LanzarCohete(){
        System.out.println("\nINOFRMACION IMPORTANTE: \n- Este tipo de nave sirve para lanzar satelites al espacio.");
    }
    
    
    //este metodo es una sobrecarga del metodo anterior, muetra informacion adiconal al usuario, el cual muestra informacion adiocnal, recibe como parametros una variable tipo String, la cual ers eviada desde donde se invoca
    public void LanzarCohete(String info){
        System.out.println(info);
    }
    
    
    //se implementa el metodo abstracto heredado de la clase padre
   public String Registrar(){
       
       //con el objeto global creado le pasamos los datos que se registraran en la lista
        controlador.Registrar("Modelo: "+this.getModelo().toUpperCase()+"  |  Peso (kg) : "+this.getPeso()+"  |  Cantidad de Combustible: "+this.getCantidad_Combustibe());
        
        
       //retorna un valor de tipo String, el cual contendra un mensaje indicando que el proceso se realizo con exito y mostrara los datos capturados por consola
        return "La Nave se ha Registrado con los siguientes datos: \n\nModelo: "+this.getModelo().toUpperCase()+"\nPeso (kg) : "+this.getPeso()+"\nCantidad de Combustible: "+this.getCantidad_Combustibe()+"\n\n";
    }

    
    
    
}
