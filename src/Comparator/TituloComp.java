/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparator;

import Libro.Libro;
import java.util.Comparator;

/**
 *
 * @author FacundoCordoba
 */
public class TituloComp implements Comparator<Libro>{
        OrderLibros orderLibro;
    public TituloComp(OrderLibros orderLibro){
    this.orderLibro = orderLibro;
    }

    @Override
    public int compare(Libro o1, Libro o2) {
       return (this.orderLibro == OrderLibros.ASCENDENTE)?  o1.getTitulo().compareTo(o2.getTitulo()) : o2.getTitulo().compareTo(o1.getTitulo());     
    }
}
