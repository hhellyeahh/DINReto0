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
 * @author 2dam
 */
public class ModelFileImplementation implements Model {

    @Override
    public String getGreeting() throws ExceptionManager {

        String Greeting = ResourceBundle.getBundle("dinreto0.model/config").getString("GREETING");
        return Greeting;
    }
}
