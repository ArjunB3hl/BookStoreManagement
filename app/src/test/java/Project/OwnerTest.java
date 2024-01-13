/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Project;

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
public class OwnerTest {
    
    public OwnerTest() {
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
     * Test of getInstance method, of class Owner.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        String userName = "";
        String newPassword = "";
        Owner result = Owner.getInstance(userName, newPassword);
        assertNotNull(result);
       
    }



    /**
     * Test of setUserName method, of class Owner.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "Jack";
        String newPassword = "Black";
        Owner instance = Owner.getInstance(userName, newPassword) ;
        instance.setUserName("Conrad");
        String expResult = "Conrad";
        assertEquals(expResult, instance.getUserName());
    
    }

    /**
     * Test of getPassword method, of class Owner.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
         String userName = "Jack";
        String newPassword = "Black";
        Owner instance = Owner.getInstance(userName, newPassword) ;
        String expResult = "Black";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        
    }

}
