/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package debolicionproxi;

/**
 *
 * @author Acer
 */
public class DebolicionProxi {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
   
        ProxyLibro Libro = new ProxyLibro("Matematicas 1");

        //  usuarios pide el prestamo de un libro 
        Libro.prestarLibro("Mario");
        Libro.prestarLibro("luna");
        //como aun no esta el libro en la biblioteca luna no puede pedirlo 
        
        
        //  devuelve el libro 
        Libro.devolverLibro("Mario");
        //debuelve el libro para que ahora luna pida el libro de nuevo
        Libro.prestarLibro("luna");
          Libro.devolverLibro("luna");
    }
}
