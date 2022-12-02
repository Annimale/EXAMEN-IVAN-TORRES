/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bilbioteca;

/**
 *
 * @author ivamar
 */
public class Lector {
    
    private String nombre;
    private String apellido;
    private String libropedido;

    public Lector(String nombre, String apellido, String libropedido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.libropedido = libropedido;
    }
    
            
        
    

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getLibropedido() {
        return libropedido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setLibropedido(String libropedido) {
        this.libropedido = libropedido;
    }
    
    public String toString(){
        return nombre+" de apellio "+apellido+" a pedido el libro:  "+libropedido;
    }
    
    public void libroPedido(Libro libro){
       
           libropedido=libro.getTitulo();
        
    }
}
        
    