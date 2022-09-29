/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.model;

import exceptions.ExceptionManager;

import java.util.ResourceBundle;

/**
 *
 * @author Zuli&Leire
 */
public class ModelFileImplementation implements Model {

    /**
     * Save in the greeting the greeting that is in the 
     * properties and return it
     * @return greeting
     * @throws ExceptionManager 
     */
    @Override
    public String getGreeting() throws ExceptionManager {

        String Greeting = ResourceBundle.getBundle("dinreto0.model/config").getString("GREETING");
        return Greeting;
    }
}
