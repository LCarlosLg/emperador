/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.emperador.ui;

import java.util.Scanner;
import mx.itson.emperador.lista.Lista;



/**
 *
 * @author Carlos
 */
public class Main {
    
    public static void main(String[] args) {
      /*
        *Scanner se encarga de leer y mostrar el texto en pantalla
        *String se encargara de leer la clase Lista.
        */
      System.out.println("Escriba el id y nombre del alumno:");
      
        Scanner scanner = new Scanner (System.in);
        String idnombre = scanner.nextLine();
        
        String[]resultado = new Lista().ordenar(idnombre);
        for(String s: resultado){
            //System.out.println(s);
            
            String[] alumnos = s.split (" ");
            String id = alumnos [0];
            String PrimerNombre = alumnos [3];
            String PrimerApellido = alumnos [1];
            
            System.out.println ("ID: " + id + "  " + PrimerNombre + "  " + PrimerApellido);
            
        }
       
         }       
}
