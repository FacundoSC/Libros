/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestorLibro;

import Comparator.AutorComp;
import Enum.OrderLibros;
import Comparator.TituloComp;
import Enum.Genero;
import Enum.SubGenero;
import java.util.ArrayList;
import Libro.Libro;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author FacundoCordoba
 */
public class GestorLibro {

    private static GestorLibro gestorLibro;
    private List<Libro> libros = new ArrayList<>();

    public static GestorLibro crearte() {
        if (gestorLibro == null)
        {
            gestorLibro = new GestorLibro();
        }
        return gestorLibro;
    }
    public void addBook(String titulo, String autor, int paginas, Genero tipoGenero, SubGenero tipoSubGenero) {

        boolean esta = false;
        Libro libro = new Libro(titulo.toUpperCase(), autor.toUpperCase(), paginas, tipoGenero, tipoSubGenero);
        if (libros.size() == 0)
        {
            libros.add(libro);
        } else
        {
            for (Libro unLibro : libros)
            {
                if (unLibro.equals(libro))
                {
                    esta = true;
                    System.out.println("el libro con ISBN:" + unLibro.getIsbn() + "Ya se encuentra agregado");
                }
            }
            if (!esta)
            {
                libros.add(libro);
            }
        }
    }
    public void showBooks() {
        for (Libro unLibro : libros)
        {
            unLibro.show();
        }
    }
    public void orderByIsbn(OrderLibros orderLibros) {
        Libro.setOrdenamiento(((orderLibros == OrderLibros.ASCENDENTE) ? 1 : -1));
        Collections.sort(libros);
    }
    public void orderByAutor(OrderLibros order) {

        Collections.sort(libros, new AutorComp(order));

    }
    public void orderByTitulo(OrderLibros order) {

        Collections.sort(libros, new TituloComp(order));

    }
    public void orderByPaginas(OrderLibros orderLibros){
        Comparator paginas = comparePaginas();
       if(orderLibros == OrderLibros.ASCENDENTE){
           
           mostrarListaAscendente(paginas);
       }
       else{
           mostrarListaDescendente(paginas);
       }
    } 
    private Comparator comparePaginas(){
        return Comparator.comparing(Libro::getPaginas);
    }
   private void mostrarListaAscendente(Comparator comparate) {
        libros.stream().sorted(comparate);
        this.showBooks();
    } 
   private void mostrarListaDescendente(Comparator comparate) {
        libros.stream().sorted(comparate.reversed());
        this.showBooks();
    }  
   
   
   public void searchBookForTitle(String title){
        Libro unLibro = null;
          for(Libro libro: libros){
              if(libro.getTitulo().equals(title)){
                   unLibro = libro;
                   break;
              }       
          }      
          if(unLibro != null){

              System.out.println("el libro buscado es :");
             unLibro.show();
          }else{
             System.out.println("no se encuentra el libro buscado");
          }  
    }
    


}
