/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debolicionproxi;

/**
 *
 * @author Acer
 */
public class ProxyLibro implements Libro {
    private String usuario;
    private LibroBiblioteca libro;
//construtor
    public ProxyLibro(String titulo) {
        this.libro = new LibroBiblioteca(titulo);
    }
//esta clase es la que controla el paso para interactuar con la clase de libroBiblioteca, haciendo la funcion del proxi 
    
    
    @Override
    public void prestarLibro(String usuario) {
      if(libro.isPrestado()== false ){
        this.usuario = usuario;
        }
        libro.prestarLibro(usuario);

        
        
    }

    @Override
    public void devolverLibro(String usuario) {
        if (usuario.equals(this.usuario)) {
            libro.devolverLibro(usuario);
        } else {
            System.out.println("Este libro no puede ser devuelto por " + usuario);
        }
    }
}
