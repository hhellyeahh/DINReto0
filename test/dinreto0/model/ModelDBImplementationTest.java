/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.model;

import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author unaiz
 */
public class ModelDBImplementationTest extends TestCase {
    
    public ModelDBImplementationTest(String testName) {
        super(testName);
    }

    /**
     * Test of getGreeting method, of class ModelDBImplementation.
     */
    @Test
    public void testGetGreeting() throws Exception {
        String greeting = "Hello World uwu BD";
        ModelDBImplementation m = new ModelDBImplementation();
        assertEquals(greeting, m.getGreeting());
    } 

}
