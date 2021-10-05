/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Libro;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FacundoCordoba
 */
public class LibroTest {
    
    public LibroTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPaginas method, of class Libro.
     */
    @Test
    public void testGetPaginas() {
        System.out.println("getPaginas");
        Libro instance = null;
        int expResult = 0;
        int result = instance.getPaginas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrdenamientoo method, of class Libro.
     */
    @Test
    public void testSetOrdenamiento() {
        System.out.println("setOrdenamiento");
        int ordenamiento = 0;
        Libro.setOrdenamiento(ordenamiento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIsbn method, of class Libro.
     */
    @Test
    public void testGetIsbn() {
        System.out.println("getIsbn");
        Libro instance = null;
        String expResult = "";
        String result = instance.getIsbn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitulo method, of class Libro.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Libro instance = null;
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsbn method, of class Libro.
     */
    @Test
    public void testSetIsbn() {
        System.out.println("setIsbn");
        String isbn = "";
        Libro instance = null;
        instance.setIsbn(isbn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class Libro.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Libro instance = null;
        instance.setTitulo(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAutor method, of class Libro.
     */
    @Test
    public void testSetAutor() {
        System.out.println("setAutor");
        String autor = "";
        Libro instance = null;
        instance.setAutor(autor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaginas method, of class Libro.
     */
    @Test
    public void testSetPaginas() {
        System.out.println("setPaginas");
        int paginas = 0;
        Libro instance = null;
        instance.setPaginas(paginas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutor method, of class Libro.
     */
    @Test
    public void testGetAutor() {
        System.out.println("getAutor");
        Libro instance = null;
        String expResult = "";
        String result = instance.getAutor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateIsbnV2 method, of class Libro.
     */
    @Test
    public void testGenerateIsbnV2() {
        System.out.println("generateIsbnV2");
        int cantidadDigitos = 0;
        String expResult = "";
        String result = Libro.generateIsbnV2(cantidadDigitos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateIsbnV3 method, of class Libro.
     */
    @Test
    public void testGenerateIsbnV3() {
        System.out.println("generateIsbnV3");
        int cantidadDigitos = 0;
        String expResult = "";
        String result = Libro.generateIsbnV3(cantidadDigitos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateIsbnV4 method, of class Libro.
     */
    @Test
    public void testGenerateIsbnV4() {
        System.out.println("generateIsbnV4");
        int cantidadDigitos = 0;
        String expResult = "";
        String result = Libro.generateIsbnV4(cantidadDigitos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateIsbnV5 method, of class Libro.
     */
    @Test
    public void testGenerateIsbnV5() {
        System.out.println("generateIsbnV5");
        int cantidadDigitos = 0;
        String expResult = "";
        String result = Libro.generateIsbnV5(cantidadDigitos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of show method, of class Libro.
     */
    @Test
    public void testShow() {
        System.out.println("show");
        Libro instance = null;
        instance.show();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Libro.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Libro o = null;
        Libro instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
