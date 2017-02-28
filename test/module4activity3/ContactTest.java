/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module4activity3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kyle
 */
public class ContactTest {
    
    public ContactTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getFullContact method, of class Contact.
     */
    @Test
    public void testGetFullContact() {
        System.out.println("getFullContact");
        Contact instance = new Contact("John doe", "Work", "jDoe@gmail.com", "Co-worker", "12/14/1969", "Java Expert");
        String expResult = "John doe, Work, Co-worker, jDoe@gmail.com, 12/14/1969, Java Expert";
        String result = instance.getFullContact();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isRelated method, of class Contact.
     */
    @Test
    public void testIsRelated() {
        System.out.println("isRelated");
        Contact instance = new Contact("John doe", "Work", "jDoe@gmail.com", "Co-worker", "12/14/1969", "Java Expert");;
        boolean expResult = false;
        boolean result = instance.isRelated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
