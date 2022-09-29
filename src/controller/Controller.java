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
 * @author ZuliLeire
 */
public class Controller {
   
    /**
     * Receive from the model the method getGreeting 
     * and saves it in showGreeting
     * @param view
     * @param model
     * @throws ExceptionManager 
     */
    public  void run(View view, Model model) throws ExceptionManager{
       
            view.showGreeting(model.getGreeting());
    }
}
