/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Project;

import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
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
public class BookListTest {
    
    public BookListTest() {
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
     * Test of getBookComponents method, of class BookList.
     */
    @Test
    public void testGetBookComponents() {
        System.out.println("getBookComponents");
        BookList instance = new BookList();
        Book book1 = new Book("Text BookA",100);
        Book book2 = new Book("Text BookB",100);
        instance.addBook(book1);instance.addBook(book2);
        ArrayList<Book> expResult = new ArrayList<>();
        expResult.add(book1);expResult.add(book2);
        ArrayList<Book> result = instance.getBookComponents();
        assertEquals(expResult, result);
    }

    /**
     * Test of addBook method, of class BookList.
     */
    @Test
    public void testAddBook_Book() {
        System.out.println("addBook");
        Book newBookComponent = new Book("Test Book", 100);
        BookList instance = new BookList();
        instance.addBook(newBookComponent);

        assertEquals(1, instance.getCollectionSize());
        assertEquals("Test Book", instance.getBookName(0));
        assertEquals(100, instance.getBookPrice(0), 0.01);
    }

    /**
     * Test of addBook method, of class BookList.
     */
    @Test
    public void testAddBook_String_int() {
        System.out.println("addBook");
        String newBookName = "Test Book";
        int newBookPrice = 100;
        BookList instance = new BookList();
        instance.addBook(newBookName, newBookPrice);
        assertEquals(1, instance.getCollectionSize());
        assertEquals("Test Book", instance.getBookName(0));
        assertEquals(100, instance.getBookPrice(0), 0.01);
        
    }

    /**
     * Test of removeBook method, of class BookList.
     */
    @Test
    public void testRemoveBook_int() {
       System.out.println("removeBook");
        int j =0;
         BookList instance = new BookList();
        instance.addBook(new Book("Test Book", 100.0));
        instance.removeBook(j);
        int expResult = 0;
        assertEquals(expResult, instance.getCollectionSize());
    }

    /**
     * Test of removeBook method, of class BookList.
     */
    @Test
    public void testRemoveBook_Book() {
        System.out.println("removeBook");
         BookList instance = new BookList();
         Book book = new Book("Test Book", 100.0);
        instance.addBook(book);
        instance.removeBook(book);
        int expResult = 0;
        assertEquals(expResult, instance.getCollectionSize());
    }

    /**
     * Test of removeBook method, of class BookList.
     */
    @Test
    public void testRemoveBook_String() {
        System.out.println("removeBook");
        String bookName = "Test Book";
         BookList instance = new BookList();
        instance.addBook(new Book(bookName, 100.0));
        instance.removeBook(bookName);
        int expResult = 0;
        assertEquals(expResult, instance.getCollectionSize());
        
 
    }

    /**
     * Test of getBookInfo method, of class BookList.
     */
    @Test
    public void testGetBookInfo() {
        System.out.println("getBookInfo");
        int j = 0;
        BookList instance = new BookList();
        instance.addBook(new Book("Test Book", 100.0));
        String expResult = "Book Name: Test Book, Price: $" + 100.0;
        String result = instance.getBookInfo(j);
        assertEquals(expResult, result);
    
    }

    /**
     * Test of getBookName method, of class BookList.
     */
    @Test
    public void testGetBookName() {
        System.out.println("getBookName");
        int j = 0;
        BookList instance = new BookList();
        instance.addBook(new Book("Test Book", 100.0));
        String expResult = "Test Book";
        String result = instance.getBookName(j);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getBookPrice method, of class BookList.
     */
    @Test
    public void testGetBookPrice_int() {
        System.out.println("getBookPrice");
        int j = 0;
        BookList instance = new BookList();
        instance.addBook(new Book("Test Book", 100.0));
        double expResult = 100.0;
        double result = instance.getBookPrice(j);
        assertEquals(expResult, result);
    
    }

    /**
     * Test of getBookPrice method, of class BookList.
     */
    @Test
    public void testGetBookPrice_String() {
        System.out.println("getBookPrice");
        String bookName = "Test Book";
        BookList instance = new BookList();
        instance.addBook(new Book("Test Book", 100.0));
        double expResult = 100.0;
        double result = instance.getBookPrice(bookName);
        assertEquals(expResult, result, 0);
       
    }

    /**
     * Test of getCollectionSize method, of class BookList.
     */
    @Test
    public void testGetCollectionSize() {
        System.out.println("getCollectionSize");
        BookList instance = new BookList();
         instance.addBook(new Book("Test Book", 100.0));
        int expResult = 1;
        int result = instance.getCollectionSize();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of toString method, of class BookList.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BookList instance = new BookList();
        instance.addBook(new Book("Test BookA", 100.0));
        instance.addBook(new Book("Test BookB", 100.0));
          String expResult = "Book Name: Test BookA, Price: $" + 100.0 + "\n" 
                            + "Book Name: Test BookB, Price: $" + 100.0 + "\n";        
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of LoadBooksFromFile method, of class BookList.
     */
    @Test
    public void testLoadBooksFromFile() throws Exception {
        String fileName = "Test.txt";
        BookList instance = new BookList();
        instance.LoadBooksFromFile(fileName);
        instance.toString();
        String expResult = "Book Name: Test BookA, Price: $" + 100.0 + "\n" 
                            + "Book Name: Test BookB, Price: $" + 100.0 + "\n" ; 
        String result = instance.toString();
        assertEquals(expResult, result);
    }

  

 
    
}
