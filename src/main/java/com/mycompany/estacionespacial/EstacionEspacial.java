
package com.mycompany.estacionespacial;

import Vista.Vista;  //Se importa el la calse vista que se encuentra en el paquete Vista


public class EstacionEspacial {

    public static void main(String[] args) {
        Vista vista=new Vista(); //Se crea un un objeto de la clase Vista llamado vista para poder hacer llamado al metodo inicial()
        
        //Se muestra en consola un menssaje para de bienvenida al usuario
        System.out.println("              Bienvenido a LA ESTACION ESPACIAL");
        System.out.println("----------------------------------------------------------------"); 
        
        // con el objeto vista se hace el llamado al metodo inicial
        vista.inicial();
    }
}
