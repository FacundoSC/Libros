/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

import Enum.Genero;
import Enum.SubGenero;
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
public class Libro implements Comparable<Libro> {
    private String isbn;
    private String titulo;
    private String autor;
    private int paginas;

    public int getPaginas() {
        return paginas;
    }
    private Genero tipoGenero;
    private SubGenero  tipoSubGenero;
    private static int ordenamiento;

    public static void setOrdenamiento(int ordenamiento) {
    Libro.ordenamiento = (ordenamiento !=-1 && ordenamiento!=1) ?1:ordenamiento;      
     }

    //Constructor
    public Libro(String isbn, String titulo, String autor, int paginas,Genero tipoGenero , SubGenero tipoSubGenero) {
        setIsbn(isbn);
        setTitulo(titulo);
        setAutor(autor);
        setPaginas(paginas);
        this.tipoGenero = tipoGenero;
        this.tipoSubGenero = tipoSubGenero;
 
    }

    //Constructor
    public Libro(String titulo, String autor, int numeroPaginas ,Genero tipoGenero, SubGenero tipoSubGenero) {
        this(generateIsbnV2(10), titulo, autor, numeroPaginas, tipoGenero, tipoSubGenero);
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setIsbn(String isbn) {
        if (this.isIsbmValido(isbn))
        {
            this.isbn = isbn;
        } else
        {
            this.isbn = "9999999999";
        }
    }

    public void setTitulo(String titulo) {
        if (titulo != null)
        {
            this.titulo = titulo;
        } else
        {
            this.titulo = "Sin Titulo";
        }

    }

    public void setAutor(String autor) {
        if (autor != null)
        {
            this.autor = autor;
        } else
        {
            this.autor = "Sin Autor";
        }
    }

    public void setPaginas(int paginas) {
        if (paginas > 0)
        {
            this.paginas = paginas;
        }

    }
    
    public String getAutor(){
      return this.autor;
    }

    private static String generateIsbn(int cantidadDigitos) {
        String cadena = "";
        List<String> numeros = new ArrayList<>();
        for (int i = 1; i <= cantidadDigitos; i++)
        {
            numeros.add(Integer.toString((int) (Math.random() * 9)));
        }
        cadena += String.join("", numeros);
        return cadena;
    }
    // recursivamente

    public static String generateIsbnV2(int cantidadDigitos) {
        return (cantidadDigitos == 0) ? "" : Integer.toString((int) (Math.random() * 9)) + "" + generateIsbnV2(cantidadDigitos - 1);
    }
    
    
    // funcional

    public static String generateIsbnV3(int cantidadDigitos) {
        return IntStream.rangeClosed(1, cantidadDigitos).mapToObj(i -> Integer.toString(getInt(0, 9)))
                .collect(Collectors.joining(""));
    }

    public static String generateIsbnV4(int cantidadDigitos) {
        String randomNumbers = IntStream.rangeClosed(1, cantidadDigitos)
                .mapToObj(i -> Integer.toString(getInt(0, 9)))
                .collect(Collectors.joining(""));
        System.out.printf("ISBN: %s%n", randomNumbers);
        return randomNumbers;
    }

    public static String generateIsbnV5(int cantidadDigitos) {
        Random random = new Random();
        return random.ints(cantidadDigitos, 0, 10).boxed().map(value -> value.toString()).collect(Collectors.joining());
    }

    private static int getInt(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    private boolean isIsbmValido(String isbn){
       String dniRegexp = "\\d{10}";
       return Pattern.matches(dniRegexp,isbn);
    }
    
    public void show(){
     String mensaje =String.format("El libro %s  con ISBN  %s creado por el autor %s tiene %d páginas , su genero es  %s y su subgenero es  %s",this.titulo,this.isbn,this.autor,this.paginas,this.tipoGenero , this.tipoSubGenero);
     System.out.println(mensaje);
    }
    


    @Override
    public int compareTo(Libro o) {
        return (Libro.ordenamiento)*isbn.compareTo(o.isbn);
    }
    
    
   
    


}