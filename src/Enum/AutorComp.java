/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enum;

import Comparator.OrderLibros;
import Libro.Libro;
import java.util.Comparator;

/**
 *
 * @author FacundoCordoba
 */
public class AutorComp implements Comparator<Libro>{
    OrderLibros orderLibro;
    public AutorComp(OrderLibros orderLibro){
    this.orderLibro = orderLibro;
    }

    @Override
    public int compare(Libro o1, Libro o2) {
       return (this.orderLibro == OrderLibros.ASCENDENTE)?  o1.getAutor().compareTo(o2.getAutor()) : o2.getAutor().compareTo(o1.getAutor());     
    }
    
}
