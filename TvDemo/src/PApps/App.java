package PApps;
/*
MONTSERRAT ROJAS SANTILLAN
paquete de la aplicacion de transmision y musica
*/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/*
MONTSERRAT ROJAS SANTILLAN
para poder realizar los metodos de la interfaz en las clases abstractas, se utilizaran los metodos swing y awt 
que nos ayudan a crear los botones que se vayan a utilizar ya sean de texto, imagen, iconos
etc; estos nos ayudaran a crear nuevas pestañas para mostrar las operaciones de la television.
para que el kit de herramientas awt tenga mas opciones, se pueden utilizar los eventos para facilitar los cambios 
que se hagan dentro de las clases abstractas, estos seran accionados por medio de los botones
*/

/**
 * Class App
 * Paez Moedano Alan Eduardo
 */
public class App implements ActionListener, Acciones{

    static boolean delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    AppStreaming stream;
    AppMusica music;
    Acciones hacer;
    JFrame up;
  //
  // Fields
  //

/*
MONTSERRAT ROJAS SANTILLAN
la clase App llama a la interfaz actionlistener para detectar el movimiento de los eventos ya sea por uso de botones
cuadros de texto, imagenes, pestañas/ventanas
las aplicaciones de transmision y de sonido se encargaran mostrar la accion de la imagen o video, el reproductor 
de audio o musica, las imagenes/iconos para el menu, el volumen, los canales y la configuracion.
*/
  
  //
  // Constructors
  //
  // Paez Moedano Alan Eduardo
    public App(){
    }
    
    public App(AppStreaming a, Acciones b){
        this.stream = a;
        this.hacer = b;
    }

/*
MONTSERRAT ROJAS SANTILLAN
se hace el llamado de la clase app en la cual se ejecutan las acciones de la transmision y las acciones por medio
de metodos denominados como a y b, haciendo referencia a los objetos
*/ 
	
    public App(AppMusica c, Acciones b){
        this.music = c;
        this.hacer = b;
    }
	
/*
MONTSERRAT ROJAS SANTILLAN
se hace el llamado de la clase app en la cual se ejecutan las acciones de la musica y las que por medio de metodos 
denominados como c y d se hace referencia a los objetos agreando de el uso de la app de musica y que va a reproducir.
*/
//Paez Moedano Alan Eduardo 
    public App(JFrame panel) {
        this.up = panel;
        
    }
	
/*
MONTSERRAT ROJAS SANTILLAN
generamos un nuevo panel para llamar a una nueva ventana que muestre las aplicaciones
*/
  
  //
  // Methods
  //
    

  //
  // Accessor methods
  //


  //
  // Other methods
  //Paez Moedano Alan Eduardo
    @Override
    public void actionPerformed(ActionEvent e) {
	stream = new AppStreaming();
        music = new AppMusica();
        System.out.println("Esta en la activacion de APPs");
       
        if ("Stream".equals(e.getActionCommand())) {
            
            System.out.println("Activo la App Stream");
	    up.dispose();
            stream.abrir("Stream");
            
        }else if ("Musica".equals(e.getActionCommand())) {
            up.dispose();
	    music.abrir("Musica");
            System.out.println("Activo la App Musica");
	
        }
    }
/*
MONTSERRAT ROJAS SANTILLAN
invocamos primero las aplicaciones mediante objetos con el fin de invocarlos, el metodo actionEvent para que el evento de generacion realice 
las acciones de los botones de transmision y sonidoesto con el fin de darle a la pestaña la accion de los botones, si dado el caso se 
selecciona "stream" se realizara la transmision de imagen, pero si no, se realizara la accion de la aplicacion de la musica
*/

    @Override
    public void abrir(String app) {
        System.out.println("Iniciando la intefaz de la APP "+app);
        JFrame sot = new JFrame();
        JButton cambio = new JButton("Fin");
        
        sot.setSize(1920,1080);
        sot.setVisible(true);
        sot.setDefaultCloseOperation(EXIT_ON_CLOSE);
        sot.setLayout(null);
        sot.setTitle(app);
       
    }
    @Override
    public void cerrar() {
        System.out.println("Cerrado de Aplicacion");
        
    }
  //Jose Luis Osnaya Rosas
    public void borrar(){
         if (App.delete())
   System.out.println("La app ha sido borrado satisfactoriamente");
else
   System.out.println("La app no puede ser borrado");  
    
    }
}
