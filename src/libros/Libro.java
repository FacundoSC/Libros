/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libros;

import static java.lang.reflect.Array.getInt;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author FacundoCordoba
 */
public class Libro {
   private String isbn ;
   private String titulo;
   private  String autor;
   private int numeroPaginas;

  
  
   //constructor
   public Libro(String isbn, String titulo, String autor, int numeroPaginas){
         setIsbn(isbn);
         setTitulo(titulo);
         setAutor(autor);
         setNumeroPaginas(numeroPaginas);
   }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }


   
   
   public Libro (String titulo,String autor,int numeroPaginas){
   this(generar(10),titulo,autor,numeroPaginas);  
   }
  
   private static String  generar(int cantidadDigitos){
      String cadena ="";
       List<String>numeros = new ArrayList<>();
       for (int i = 1; i <= cantidadDigitos; i++) {
        numeros.add(Integer.toString((int)(Math.random()*9)));
       }
       cadena += String.join("", numeros);
     return cadena;
   }
   
   // recursivamente
   public String generarV2(int cantidadDigitos){       
      return (cantidadDigitos == 0) ? "" :Integer.toString((int)(Math.random()*9))+""+generarV2(cantidadDigitos -1);   
   }
   
   // funcional
   public String generarV3 (int cantidadDigitos){   
       return IntStream.rangeClosed(1, cantidadDigitos).mapToObj(i -> Integer.toString(getInt(0, 9)))
                .collect(Collectors.joining(""));
    }
   
      public String generarV4() {
        String randomNumbers = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> Integer.toString(getInt(0, 9)))
                .collect(Collectors.joining(""));
        System.out.printf("ISBN: %s%n", randomNumbers);
        return randomNumbers;
    }
      
      public String generarV5 (int cantidadDigitos){
          Random random = new Random();        
           return random.ints(cantidadDigitos, 0, 10).boxed().map(value -> value.toString()).collect(Collectors.joining());
      }  
    private static int getInt(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

 
   
   

   
   

   

    public void setIsbn(String isbn) {      
         if(this.esIsbmValido(isbn)){
           this.isbn =isbn;
         }
         else{
            this.isbn ="9999999999";
         }   
    }

      public void setTitulo(String titulo) {
        if(titulo != null){
         this.titulo = titulo;
        }
        else{
          this.titulo="Sin Titulo";
        }
        
    }

    public void setAutor(String autor) {
        if(autor != null){
          this.autor = autor;
        }
        else{
         this.autor ="Sin Autor";
        }
    }

    public void setNumeroPaginas(int numeroPaginas) {
         if( numeroPaginas>0)
             this.numeroPaginas = numeroPaginas;
      
    }
    
    private boolean esIsbmValido(String isbn){
       String dniRegexp = "\\d{10}";
       return Pattern.matches(dniRegexp,isbn);
    }
    
    
    public void mostrarLibro(){
     String mensaje =String.format("El libro %s  con ISBN  %s creado por el autor %s tiene %d páginas ",this.titulo,this.isbn,this.autor,this.numeroPaginas);
     System.out.println(mensaje);
    }
   
    


}