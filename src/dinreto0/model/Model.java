/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.model;

import exceptions.ExceptionManager;

/**
 *
 * @author Zuli&Leire
 * Model is an interface 
 */
public interface Model {

    /**
     * This method returns a strings depending to the implementation
     * @return greeting
     * @throws ExceptionManager 
     */
    public String getGreeting() throws ExceptionManager;
}
