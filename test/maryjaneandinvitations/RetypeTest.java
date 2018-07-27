/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maryjaneandinvitations;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zhuan
 */
public class RetypeTest {
    
    public RetypeTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testOrderType() {
        String newOrder=MaryJaneandInvitations.OrderType(0, "ARORXXXOARRXXOARO");
        assertEquals(newOrder,"AOORAORARO");
        
        newOrder=MaryJaneandInvitations.OrderType(0, "AOXXRXRXXOXA");
        assertEquals(newOrder,"OA");
        
        newOrder=MaryJaneandInvitations.OrderType(0, "AXOXR");
        assertEquals(newOrder,"R");
    }
    
}
