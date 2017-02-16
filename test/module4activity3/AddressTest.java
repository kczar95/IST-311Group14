/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module4activity3;

import module4activity3.Address;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luke
 */
public class AddressTest {
    
    public AddressTest() {
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
     * Test of checkIfState method, of class Address.
     */
    @Test
    public void testCheckIfState() {
        System.out.println("checkIfState");
        Address instance = new Address("760 Foss Avenue", "Drexel Hill", "PA", "United States", 19026);
        boolean expResult = true;
        boolean result = instance.checkIfState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFullAddress method, of class Address.
     */
    @Test
    public void testGetFullAddress() {
        System.out.println("getFullAddress");
        Address instance = new Address("760 Foss Avenue", "Drexel Hill", "PA", "United States", 19026);
        String expResult = "760 Foss Avenue,\nDrexel Hill, PA 19026";
        String result = instance.getFullAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
