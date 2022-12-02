/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bilbioteca;

/**
 *
 * @author ivamar
 */
public class bibliotecaAPP {
    public static void main(String[] args) {
        
        Libro libro1=new Libro("La ley","Manolo",3,3);
        Libro libro2=new Libro("El yayo","Loles",3,4);
        Libro libro3=new Libro("Selva","Maria",2,2);
        Libro libro4=new Libro("Gorila","Juan",5,5);
        
        Lector lector1=new Lector("Pepe","Torres","La ley");
        Lector lector2=new Lector("Mario","Sabina","La ley");
        
        
        lector1.libroPedido(libro1);
        lector2.libroPedido(libro2);
        
        System.out.println(lector1);
        System.out.println(lector2);
        
        System.out.println("***********************");
        
        libro2.Prestamo(true);
        libro1.Prestamo(true);
        
        System.out.println("El libro  "+libro1.getTitulo()+" ha prestado un titular, y ahora tiene "+libro1.getEjemplaresP()+" ejemplares para prestar");
        System.out.println("El libro  "+libro2.getTitulo()+" ha prestado un titular, y ahora tiene "+libro2.getEjemplaresP()+" ejemplares para prestar");
        
        System.out.println("***********************");
        
        System.out.println("El lector "+lector2.getNombre()+" ha devuelto el libro "+lector2.getLibropedido());
        System.out.println("El lector "+lector1.getNombre()+" ha devuelto el libro "+lector1.getLibropedido());
        
        libro1.Devolucion(true);
        libro2.Devolucion(true);
        
        System.out.println("***********************");
        System.out.println("El libro  "+libro1.getTitulo()+" ha sido devuelto, y ahora tiene "+libro1.getEjemplaresP()+" ejemplares para prestar");
        System.out.println("El libro  "+libro2.getTitulo()+" ha sido devuelto, y ahora tiene "+libro2.getEjemplaresP()+" ejemplares para prestar");
        
        System.out.println("***********************");
        
        lector1.libroPedido(libro4);
        libro4.Prestamo(true);
        System.out.println(lector1);
        System.out.println("***********************");
        System.out.println("El libro  "+libro4.getTitulo()+" ha prestado un titular, y ahora tiene "+libro4.getEjemplaresP()+" ejemplares para prestar");
        libro4.Devolucion(true);
        System.out.println("El libro  "+libro4.getTitulo()+" ha sido devuelto, y ahora tiene "+libro4.getEjemplaresP()+" ejemplares para prestar");
        
        
    }
    
}
