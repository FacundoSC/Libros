/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import GestorLibros.GestorLibros;
import java.util.Random;
import java.util.stream.Collectors;
 


/**
 *
 * @author FacundoCordoba
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        GestorLibros gLibros = GestorLibros.crear();   
        gLibros.agregarLibro("hamlet", "yo", 34);
        gLibros.agregarLibro("hamlet", "yo", 34);
        gLibros.mostrar();

    }
    
}
