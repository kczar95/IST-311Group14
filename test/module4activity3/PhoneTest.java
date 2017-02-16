package module4activity3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import module4activity3.Phone;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rfd5085
 */
public class PhoneTest {
    
    public PhoneTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getPhoneInfo method, of class Phone.
     */
    @Test
    public void testGetPhoneInfo() {
        System.out.println("getPhoneInfo");
        Phone instance = new Phone("610-213-8218", "Mobile", "610-523-4865");
        String expResult = "Mobile: 610-213-8218";
        String result = instance.getPhoneInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFaxNumber method, of class Phone.
     */
    @Test
    public void testGetFaxNumber() {
        System.out.println("getFaxNumber");
        Phone instance = new Phone("610-213-8218", "Mobile", "610-523-4865");
        String expResult = "Fax Number: 610-523-4865";
        String result = instance.getFaxNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
