/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Project;

import javafx.beans.property.SimpleBooleanProperty;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author arjun
 */
public class BookTest {
    
    public BookTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getBookName method, of class Book.
     */
    @Test
    public void testGetBookName() {
        System.out.println("getBookName");
        Book instance = new Book("Test Book",100.0);
        String expResult = "Test Book";
        String result = instance.getBookName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getBookPrice method, of class Book.
     */
    @Test
    public void testGetBookPrice() {
        System.out.println("getBookPrice");
       Book instance = new Book("Test Book",100.0);
        double expResult = 100.0;
        double result = instance.getBookPrice();
        assertEquals(expResult, result, 0);
        
    }

    /**
     * Test of isSelected method, of class Book.
     */
    @Test
    public void testIsSelected() {
        System.out.println("isSelected");
        Book instance = new Book("Test Book",100.0) ;
        boolean expResult = false;
        boolean result = instance.isSelected();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setSelected method, of class Book.
     */
    @Test
    public void testSetSelected() {
        System.out.println("setSelected");
        boolean selected = true;
        Book instance = new Book("Test Book",100.0);
        instance.setSelected(selected);
        boolean expResult = true;
        boolean result = instance.isSelected();
        assertEquals(expResult, result);
    }


    /**
     * Test of toString method, of class Book.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Book instance = new Book("Test Book",100.0);
        String expResult = "Book Name: Test Book, Price: $" + 100.0;
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
