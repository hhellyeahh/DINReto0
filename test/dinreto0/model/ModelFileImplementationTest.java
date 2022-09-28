/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.model;

import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 *
 * @author unaiz
 */
public class ModelFileImplementationTest extends TestCase {
    
    public ModelFileImplementationTest(String testName) {
        super(testName);
    }


    /**
     * Test of getGreeting method, of class ModelFileImplementation.
     */
    @Test
    public void testGetGreeting() throws Exception {
        String greeting = "HELLO WORLD uwu";
        ModelFileImplementation m = new ModelFileImplementation();
        assertEquals(greeting, m.getGreeting());
    } 
    
}
