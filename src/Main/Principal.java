/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Comparator.OrderLibros;
import GestorLibro.GestorLibro;
import Enum.Genero;
import Enum.SubGenero;
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
        GestorLibro gLibros = GestorLibro.crearte();  
        gLibros.addBook("hamlet", "Shaspeark",34,Genero.DIDACTICO, SubGenero.DRAMA);
        gLibros.addBook("Zorro", "Diego de la Vega", 34, Genero.DIDACTICO, SubGenero.DRAMA);
        gLibros.addBook("el hombre sin cabeza", "yo", 34, Genero.DIDACTICO, SubGenero.DRAMA);
       // gLibros.orderByIsbn(OrderLibros.ASCENDENTE);
        //gLibros.orderByAutor(OrderLibros.ASCENDENTE);
        gLibros.orderByTitulo(OrderLibros.ASCENDENTE);
       //gLibros.orderByTitulo(OrderLibros.DESCENDENTE);
        gLibros.showBooks();

    }
    
}
