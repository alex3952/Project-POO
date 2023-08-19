
package PApps;

/*
MONTSERRAT ROJAS SANTILLAN
paquete de la aplicacion de transmision y musica
*/

/**
 *
 * package Acciones
 */
public interface Acciones {
    
  //
  // Fields
  //
    
/*
MONTSERRAT ROJAS SANTILLAN
llamamos a la interfaz acciones que se encargara de realizar las operaciones de los campos de la aplicacion
los constructores para los objetos, los metodos para reproducir la pestaña con los botones tanto para la aplicacion de 
musica como para la de transmision y los accesos remotos para las clases abstractas

*/ 
    
  //
  // Constructors
  //
  //Herrera improvement 

    
  
  //
  // Methods
  //

    

  //
  // Accessor methods
  //

  //
  // Other methods
  //
    public void abrir(String app);
    public void cerrar();
     //Jose Luis Osnaya Rosas
    public void borrar();
     

/*
MONTSERRAT ROJAS SANTILLAN
finalmente llamamos los metodos para abrir y cerrar las aplicaciones, en dado caso que se desee eliminar la app se llama el
metodo delete, en dado caso que no se pueda se debe realizar una nueva ejecucion
*/     
    
}
