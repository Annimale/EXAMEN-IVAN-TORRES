/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bilbioteca;

/**
 *
 * @author ivamar
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int ejemplaresL;
    private int ejemplaresP;

    public Libro(String titulo, String autor, int ejemplaresL, int ejemplaresP) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplaresL = ejemplaresL;
        this.ejemplaresP = ejemplaresP;
    }
    
    
    public Libro(){
        this.titulo="sin nombre";
        this.autor="anonimo";
        this.ejemplaresL=0;
        this.ejemplaresP=0;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getEjemplaresL() {
        return ejemplaresL;
    }

    public int getEjemplaresP() {
        return ejemplaresP;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEjemplaresL(int ejemplaresL) {
        this.ejemplaresL = ejemplaresL;
    }

    public void setEjemplaresP(int ejemplaresP) {
        this.ejemplaresP = ejemplaresP;
    }
    
    
    public boolean Prestamo(boolean prestamo){
        
    if(prestamo==true && this.ejemplaresP>1){
        ejemplaresP--;   
        return true;
        }else{
        return false;
        }
    }
    
    public boolean Devolucion(boolean devolucion){
        
    if(devolucion==true && this.ejemplaresP>=1){
        ejemplaresP++;   
        return true;
        }else{
        return false;
        }
    }
    
    public String toString(){
        
        return "El autor del libro es:  "+autor+" , el titulo del libro es:  "+titulo+" ,el libro tiene estos ejemplares:  "+ejemplaresL+"  ,y ha prestado estos ejemplares:  "+ejemplaresP;
    }
    
}
