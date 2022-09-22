/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dinreto0.model.*;
import exceptions.ExceptionManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2dam
 */
public class Controller {
   
    
    public static void run(View view, Model model) throws ExceptionManager{
       
        
            view.showGreeting(model.getGreeting());
       
        
    }
}
