/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.model;

import junit.framework.TestCase;

/**
 *
 * @author unaiz
 */
public class ViewFactoryTest extends TestCase {

    public ViewFactoryTest(String testName) {
        super(testName);
    }

    /**
     * Test of getView method, of class ViewFactory.
     */
    public void testGetView() throws Exception {
        View v = ViewFactory.getView();
        Model m = ModelFactory.getModel();

        assertNotNull(v);
        assertNotNull(m);
    }
}
