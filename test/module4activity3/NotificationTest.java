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
public class NotificationTest {
    
    public NotificationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of isPopUp method, of class Notification.
     */
    @Test
    public void testIsPopUp() {
        System.out.println("isPopUp");
        Notification instance = new Notification("11/24/2017", true, true);
        boolean expResult = true;
        boolean result = instance.isPopUp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of itsSoundAlert method, of class Notification.
     */
    @Test
    public void testItsSoundAlert() {
        System.out.println("itsSoundAlert");
        Notification instance = new Notification("9/5/2017", true, true);
        boolean expResult = true;
        boolean result = instance.isSoundAlert();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
