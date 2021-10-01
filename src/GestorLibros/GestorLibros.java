/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestorLibros;

import java.util.ArrayList;
import libros.Libro;

/**
 *
 * @author FacundoCordoba
 */
public class GestorLibros {
    private  static GestorLibros gestorLibro ;
    private ArrayList<Libro> libros = new ArrayList<>();
    private GestorLibros(){
    }
    
    public static  GestorLibros crear(){
       if(gestorLibro == null)
           gestorLibro = new GestorLibros();
       return gestorLibro;
    }
    

    
   public void agregarLibro(String titulo, String autor, int paginas){
   boolean esta = false;
   Libro libro = new Libro(titulo,autor,paginas);  
   if(libros.size() == 0){
      libros.add(libro);
   }
   else{       
        for(Libro unLibro : libros){            
            if(unLibro.equals(libro)){
              esta= true;
              System.out.println("el libro con ISBN:"+unLibro.getIsbn()+"Ya se encuentra agregado");
            }     
        }
         if(!esta)
          libros.add(libro);  
   }
 }
    
  public void mostrar(){
  for(Libro unLibro : libros){
    unLibro.mostrarLibro();
    }
 }
    
    
    
    
    
}
