
package Vista;


import Controlador.ControladorRegisConsult;
import java.util.Scanner; //se importa calses reservados de java para utilizar para la captura de los datos que ingresa el usuario
import Modelo.*; //se importa el del paquete modelo las clases para poder realizar el llamado a cada una por medio de la creacion de objetos

//se crea la  Vista, la cual sera ejecutara todos los mesaajes que se mostraran al usuario
public class Vista {
    ControladorRegisConsult controlador=  new ControladorRegisConsult();  //creamos un objeto de la clase ocntrolador para poder pasar los datos a registrar en la lista
    
    //se declaran 3 objetos a nivel global de las clases Lanzadora, No_tripulada y Tripulada, los cuales serviran para hacer llamados a los distintos metodos de cada una
    private Lanzadora lanzadora;
    private No_tripulada notripulada;
    private Tripulada tripulada;
   
    /*se crea un metodo llamado inicial, el cual sera el que muestre los mensajes al usuario y capture lo que el ingresa para procesarlos por las diferentes
    validaciones, metodos propiso, y llamado de metodos*/
   public void inicial(){
       
       // se declaran variables y se inicializan, las cuales seran necesarias para la captura de informacion ingresada por el usuario
       int opcion=0;
       String modelo="";
       double peso=0.0;
       double combustible=0.0;
       int capacidad_personas=0;
       int cantidad_motores=0;       
           
       //se muestra un encabezado al ejecutar el programa con el fin de que hay una comunicacion con el usuario y se pueda recolectar la informacion necesaria para los distintos procesos
        System.out.println("Por favor digite una opcion segun su eleccion para la creacion de una nueva nave:");
        System.out.println("       ----------------------------------------------------------------");
        System.out.println("1. Nave Lanzadera \n2. Nave Tripulada \n3. Nave no Tripulada");
        System.out.println(" ");
         
        //la variable opcion de tipo entero guardara lo que el usuario digite de acuerdo a las opciones que se le muestran en consola (1, 2 o 3)
        opcion=new Scanner(System.in).nextInt();
         
        //con el valor que digita el usuario se crea la condicion utilizando la sentencia if else para poder direccionarlo a la opcion de su preferencia
       if (opcion==1) {//en caso que el usuario digite la opcion 1 se ejecuta esta sentencia if
           
           //por medio de las distintas preguntas y se recolecta la informacion, la cual servira para crear la nave que el desea
               System.out.println("Ha seleccionado una NAVE LANZADERA, ingrese los siguientes datos: \nModelo: ");
               modelo=new Scanner(System.in).nextLine(); //se captura el modelo de la nave 
               
               System.out.println("Peso: ");
               peso=new Scanner(System.in).nextDouble(); //se captura el peso de la nave
               
               System.out.println("Cantidad de combustible: ");
               combustible=new Scanner(System.in).nextDouble(); //se captura la cantidad de combustible
               
               lanzadora=new Lanzadora(combustible, peso, modelo); //el objeto global lanzadora declarado al inicio de la clase, se termina de crear invocando al constructor y enviando los parametros requeridos               
               lanzadora.LanzarCohete();  // se realiza el llamado al metodo de la clase Lanzadora el cual ejecutara un proceso
               lanzadora.LanzarCohete("- Es bueno tener presente que su proposito es lograr sacar su carga fuera de la gravedad terrestre.\n\n"); //se realiza llamada al otro metodo le cual muestra mas informacion que sera informativo para el usuario, esta vez pasandole una variable como parametro
               System.out.println(lanzadora.Registrar()); //por ultimo se hace un llamado al metodo registrar y este retornara un String el cual muestra la informacion de los datos recolectados durante el proceso de registro de la nave
               
       }else if (opcion==2){  // en caso de que el usaurio digite la opcion 2, se ejecuta esta sentencia if
               
           //por medio de las distintas preguntas y se recolecta la informacion, la cual servira para crear la nave que el desea
               System.out.println("Ha seleccionado una NAVE TRIPULADA, ingrese los siguientes datos: \nModelo: ");
               modelo=new Scanner(System.in).nextLine(); //se captura el modelo de la nave 
               
               System.out.println("Peso: ");
               peso=new Scanner(System.in).nextDouble(); //se captura el peso de la nave
               
               System.out.println("Capacidad de personas: ");
               capacidad_personas=new Scanner(System.in).nextInt();//se captura la cantidad de personas
               
               tripulada=new Tripulada(capacidad_personas, peso, modelo); //el objeto global tripulada declarado al inicio de la clase, se termina de crear invocando al constructor y enviando los parametros requeridos               
               tripulada.InformacionTripulada();  // se realiza el llamado al metodo de la clase tripulada el cual ejecutara un proceso
               tripulada.InformacionTripulada("- Algunos fines de que personas vayan al espacio, es investigar vida en otros planetas, realizar mantenimiento a centros espaciales y/o entrenamientos para futuros viajes al espacio. \n\n");  //se realiza llamada al otro metodo le cual muestra mas informacion que sera informativo para el usuario, esta vez pasandole una variable como parametro
               System.out.println(tripulada.Registrar());  //por ultimo se hace un llamado al metodo registrar y este retornara un String el cual muestra la informacion de los datos recolectados durante el proceso de registro de la nave
               
       }else if (opcion==3){// en caso de que el usaurio digite la opcion 3, se ejecuta esta sentencia if         
           
               //por medio de las distintas preguntas y se recolecta la informacion, la cual servira para crear la nave que el desea
               System.out.println("Ha seleccionado una NAVE NO TRIPULADA, ingrese los siguientes datos: \nModelo: ");
               modelo=new Scanner(System.in).nextLine();//se captura el modelo de la nave 
               
               System.out.println("Peso: ");
               peso=new Scanner(System.in).nextDouble();//se captura el peso de la nave
               
               System.out.println("Cantidad motores de combustion: ");
               cantidad_motores=new Scanner(System.in).nextInt();  //se captura la cantidad de motores de combustion
               
               notripulada=new No_tripulada(cantidad_motores, peso, modelo);  //el objeto global no_tripulada declarado al inicio de la clase, se termina de crear invocando al constructor y enviando los parametros requeridos                
               notripulada.InformacionNoTripulada();  // se realiza el llamado al metodo de la clase No_tripulada el cual ejecutara un proceso
               notripulada.InformacionNoTripulada("- Los robots que trasnporta son para investigaciones que duran mucho tiempo en un planeta, en la cual esta recolectando información.\n\n");//se realiza llamada al otro metodo le cual muestra mas informacion que sera informativo para el usuario, esta vez pasandole una variable como parametro
               System.out.println(notripulada.Registrar());  //se captura el modelo de la nave 
              
       }else{ // en caso que el usuario ingrese una opcion distinta a las anteriores (1, 2 o 3) el programa le notificara que escoja una de las 3 y volvera a mostrar el menu
           System.out.println("Ha ingresado una opcion no valida, por favor indique que desea realizar.");
           System.out.println("------------------------------------------------------------------------");
           System.out.println("  ");
           this.inicial(); // ejecuta nuevamente el metodo llamado inicial()
       }
       
       
       //al terminar el proceso de restigro de la nave, el programa vuelve a preguntar si desea crear una nueva nave, indica si=1 o no=2
       System.out.println(" ");
       System.out.println("Por favor indique si desea CREAR una nueva nave, digite 1 para continuar, 2 para consultar una nave, \n3 para consultar todas las naves en el inventario, 4 para salir del tistema.");
       opcion=new Scanner(System.in).nextInt();
       
       //se crea una sentencia if para valdiar la opcion ingresa por el suario
       if(opcion==1){  //si lo que el digita es 1 se hace el llamado al metodo inicial y vuelve a empezar el proceso de registro
           this.inicial();
       }else if(opcion==2){  //al seleccionar esta opcion entrara a pedir que ingrese el codigo de la nave a consultar
           
           System.out.println("Por favor ingrese el ID de la nave a consultar");
           System.out.println(controlador.ConsultarNave(new Scanner(System.in).nextInt()));  // se invoca el metodo consultar naves con el objeto creado, para consultar la nave correspondiente al id ingresado
           
       }else if(opcion==3){
           
           System.out.println("Se muestra un listado de todas las naves existentes en el inventario\n");        
           System.out.println(controlador.ConsultarNaves());  // genera una consulta general de todas las naves que hay en el inventario
           
       }else{ //sino entonces el programa termina
           System.exit(0);
       }
   }
}
