/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0;

import controller.Controller;
import dinreto0.model.*;
import exceptions.ExceptionManager;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Zuli&Leire
 */
public class DINReto0 {

    /**
     * @param args the command line arguments
     * It try to call the run method from the Controller
     * and catch an exception if the factories are not working well
     */
    public static void main(String[] args) {
        
        try {
            new Controller().run(ViewFactory.getView(),ModelFactory.getModel());
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }  
}
