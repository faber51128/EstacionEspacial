
package Controlador;

import java.util.ArrayList;
import java.util.List;


public class ControladorRegisConsult implements RegistrarInterfaz{
    List<String> datos;  //se crea un objeto tipo lista en el cual simulara la base de datos, donde se almacenara las naves que se crean
    

    public ControladorRegisConsult() { //se declara el constructor vacio el cual no recibira nada
        
        datos=new ArrayList(); 
        this.Registrar();  // se hace llamado del metodo registrar el cual haras los registros genericos de 9 naves, 3 por cada tipo
        
    }   
    
    @Override//este metodo guarda todas las naves que el usuario registra, se guarda en una lista
    public void Registrar(String dato){
        //con esta sentencia agregamos un registro a la lista        
        datos.add(dato);
        
        
    }
    
    @Override//Este metodo es una sobrecarga del anterioro y se encarga de crear las naves por defecto, segun lo solicitado en el reto
    public void Registrar(){
        
        //al ejecutar el programa registra tres naves No Tripuladas por defecto, segun lo solicitado en la prueba        
        this.datos.add("Modelo: Cave  |  Peso (kg): 2850  |  Motores de combustión: 4");                
        this.datos.add("Modelo: BMMMN  |  Peso (kg): 18560  |  Motores de combustión: 6");                
        this.datos.add("Modelo: ASSDF  |  Peso (kg): 22000  |  Motores de combustión: 10");
        
        
        //al ejecutar el programa registra tres naves Tripuladas por defecto, segun lo solicitado en la prueba        
        this.datos.add("Modelo: Arara  |  Peso (kg): 3120  |  Cantidad de Personas: 3");        
        this.datos.add("Modelo: Native  |  Peso (kg): 4100  |  Cantidad de Personas: 5");       
        this.datos.add("Modelo: Ladyy  |  Peso (kg): 20010  |  Cantidad de Personas: 6");
        
        
        //al ejecutar el programa registra tres naves Lanzadera por defecto, segun lo solicitado en la prueba        
        this.datos.add("Modelo: BELLS  |  Peso (kg): 10230  |  Cantidad de Combustible: 20");
        this.datos.add("Modelo: Native  |  Peso (kg): 4100  |  Cantidad de Combustible: 80");
        this.datos.add("Modelo: Ladyy  |  Peso (kg): 20010  |  Cantidad de Combustible: 100");
        
    }
    
    
    @Override//se declara un metodo el cual retornara una cadena que contendra la consulta especifica de una nave creada, recibienod un dato de tipo int para la consulta
    public String ConsultarNave(int id){
        String cadena="";   //declaramos una variable local tipo string que guardara los datos segun la cosnulta
        
        if(id<=datos.size()){  //declaramos una sentencia if que sera con la que se evaluara si el id recibido esta dentro de la lista
           cadena="\nLa nave consultada es: "+datos.get(id-1);   //si es valida la condicion entra y captura de la lista el valor de la posision recibida con la variable ID
        }else{
            cadena="El ID ingresado no pertenece a ninguna nave";  // si la condicion no se cumple, en la variable cadena se captura un mensaje el cual indica que no se ha registrado una nave con ese id
        }      
        
        return cadena;  // al final se retorna la variable cadena la cual contendra una cadena de texto
    }
    
    
    @Override//ESte metodo me devolvera una cadena con todas as naves que hay almacenados en la lista
    public String ConsultarNaves(){
        String cadena=""; //se crea una variable local de tipo String para almacenar los datos que de la lista
        
        for(int i=0; i<datos.size(); i++){   //declaramos un ciclo for para recorrer la lista e ir extrayendo los datos de la misma
            
            cadena=cadena+datos.get(i)+"\n";  // en la variable cadena guardamos todos los datos que hay almacenados en la lista, al final de cada consulta hacemos un salto de linea para mostrar cada nave con sus propiedades          
            
        }
        
        return cadena; // al final se retorna la variable cadena la cual contendra una cadena de texto
    }
}
