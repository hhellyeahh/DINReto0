/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.model;

/**
 *
 * @author ZuliLeire
 */
public class UnknownModelTypeException extends Exception {

    /**
     * Is an empty constructor
     */
    public UnknownModelTypeException() {
    }
    
    /**
     * If there is an exception it returns a message
     * @param message 
     */
    public UnknownModelTypeException(String message) {
        super(message);
    }
}
