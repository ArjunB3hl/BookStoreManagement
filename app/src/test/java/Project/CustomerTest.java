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
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of addPoints method, of class Customer.
     */
    @Test
    public void testAddPoints() {
        System.out.println("addPoints");
        double transactionCost = 10.5;
        Customer instance = new Customer("Jack","Black");
        instance.addPoints(transactionCost);
        int expResult = 10;
        assertEquals(expResult,instance.getPoints());
    }

    /**
     * Test of removePoints method, of class Customer.
     */
    @Test
    public void testRemovePoints() {
        System.out.println("removePoints");
        double transactionCost = 10.5;
        Customer instance = new Customer("Jack","Black");
        instance.addPoints(transactionCost);
        instance.removePoints(transactionCost);
        int expResult = 0;
        assertEquals(expResult,instance.getPoints());
    }

    /**
     * Test of UpdateStatus method, of class Customer.
     */
    @Test
    public void testUpdateStatus() {
        System.out.println("UpdateStatus");
         double transactionCost = 1001.5;
        Customer instance = new Customer("Jack","Black");
        instance.addPoints(transactionCost);
        instance.UpdateStatus();
        String expResult = "Gold";
        assertEquals(expResult,instance.getStatus());
    }

    /**
     * Test of getUserName method, of class Customer.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        Customer instance = new Customer("Jack","Black");
        String expResult = "Jack";
        String result = instance.getUserName();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setUserName method, of class Customer.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        Customer instance = new Customer("Jack","Black");
        instance.setUserName("Conrad");
        String result = instance.getUserName();
        String expResult = "Conrad";
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPassword method, of class Customer.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Customer instance = new Customer("Jack","Black");
        String result = instance.getPassword();
        String expResult = "Black";
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setPassword method, of class Customer.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        Customer instance = new Customer("Jack","Black");
        instance.setPassword("White");
        String result = instance.getPassword();
        String expResult = "White";
        assertEquals(expResult, result);
    }

    /**
     * Test of setPoints method, of class Customer.
     */
    @Test
    public void testSetPoints() {
        System.out.println("setPoints");
        int points = 100;
        Customer instance = new Customer("Jack","Black");
        instance.setPoints(points);
        int result = instance.getPoints();
        int expResult = 100;
        assertEquals(expResult, result);
                      
    }

    /**
     * Test of getStatus method, of class Customer.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        int points = 1001;
        Customer instance = new Customer("Jack","Black");
        instance.setPoints(points);
        String result = instance.getStatus();
        assertEquals("Gold", result);

    }

    /**
     * Test of isSelected method, of class Customer.
     */
    @Test
    public void testIsSelected() {
        System.out.println("isSelected");
        
        Customer instance = new Customer("Jack","Black");
         boolean expResult = false;
        boolean result = instance.isSelected();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setSelected method, of class Customer.
     */
    @Test
    public void testSetSelected() {
        System.out.println("setSelected");
        boolean selected = true;
        Customer instance = new Customer("Jack","Black");
        instance.setSelected(selected);
        boolean expResult = true;
        boolean result = instance.isSelected();
        assertEquals(expResult, result);
    }

    

    /**
     * Test of toString method, of class Customer.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        int points = 1001;
        Customer instance = new Customer("Jack","Black");
        instance.setPoints(points);
        String expResult = "Customer={UserName: Jack, points: " + points + ", Status: Gold}";
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }
    
}
