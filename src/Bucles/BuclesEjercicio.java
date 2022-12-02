/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

import java.util.Scanner;

/**
 *
 * @author ivamar
 */
public class BuclesEjercicio {
    public static void main(String[] args) {
        Scanner tcl=new Scanner(System.in);
        
        int A=0;
        int B=0;
        int C=0;
        int contadorsuma=0;
        int contadorfuera=0;
        int contadorigual=0;
        
        System.out.println("Introduce un numero que sea el limite inferior y otro que sea el superior");
        A=tcl.nextInt();
        B=tcl.nextInt();
        
        
        if (A>B){
            System.out.println("Vuelve a introducir los limites, recuerda que el primer numero introducido no debe de ser mayor que el segundo");
            A=tcl.nextInt();
            B=tcl.nextInt();
            
        }else{ 
            System.out.println("Entramos en el bucle");
               
            for (int i = A; i<B  ; i++) {//Aqui esta etre los limites que nosotros hemos establecido
                   
               
                C=tcl.nextInt();
                
                if(C>A && C<B) //CONDICION PARA QUE SUME SIEMPRE Y CUANDO ESTE DENTRO DEL INTERVALO
                contadorsuma=C+contadorsuma;
                
                if(C==A && C==B)//CONDICION PARA QUE AUMENTE CUANDO SEA IGUAL
                    contadorigual++;
                
                if(C<A && C>B)// CONDICION PARA QUE AUMENTE CUANDO ESTE FUERA DE LOS LIMITES
                    contadorfuera++;
                
                if(C==0)
                    break;
                
                
                //NO HE SABIDO COMO HACER PARA QUE PARE HASTA QUE SEA CERO
                
               
             }
            System.out.println("Suma de los numeros introducidos "+contadorsuma);
            System.out.println("Numeros fuera del intervalo "+contadorfuera);
            System.out.println("Numeros iguales a los limites del intervalo "+contadorigual);
        }
    }
}
        
        
    
    

