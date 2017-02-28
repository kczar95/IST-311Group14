package module4activity3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import module4activity3.Group;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rober_000
 */
public class GroupTest {
    
    public GroupTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getGroupInfo method, of class Group.
     */
    @Test
    public void testGetGroupInfo() {
        System.out.println("getGroupInfo");
        Group instance = new Group("The Office", "Work", "Steve, John, Scott, Larry, Laura, Austin, Sam");
        String expResult = "Group Name: The Office Group Type: Work";
        String result = instance.getGroupInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGroupMembers method, of class Group.
     */
    @Test
    public void testGetGroupMembers() {
        System.out.println("getGroupMembers");
        Group instance = new Group("The Office", "Work", "Steve, John, Scott, Larry, Laura, Austin, Sam");
        String expResult = "Group Members: Steve, John, Scott, Larry, Laura, Austin, Sam";
        String result = instance.getGroupMembers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
