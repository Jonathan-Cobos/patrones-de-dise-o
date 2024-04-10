/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debolicionproxi;

/**
 *
 * @author Acer
 */
public class LibroBiblioteca implements Libro {
    private String titulo;
    private boolean prestado;
//constructor
    public LibroBiblioteca(String titulo) {
        this.titulo = titulo;
        this.prestado = false;
    }
//set y et (no me sirve la letra)
    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    
//metodos para intercatuar con el libro, estos ven si se puede prestar o no ademas de devolverlo
    @Override
    public void prestarLibro(String usuario) {
        if (prestado==false) {
            System.out.println("El libro '" + titulo + "' ha sido prestado a " + usuario);
            prestado = true;
        } else {
            System.out.println("El libro '" + titulo + "' ya está prestado.");
        }
    }

    @Override
    public void devolverLibro(String usuario) {
        if (prestado) {
            System.out.println("El libro '" + titulo + "' ha sido devuelto por " + usuario);
            prestado = false;
        } else {
            System.out.println("El libro '" + titulo + "' no estaba prestado.");
        }
    }
}

