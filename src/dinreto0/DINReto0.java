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
 * @author 2dam
 */
public class DINReto0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        View view = ViewFactory.getView();
        Model model = ModelFactory.getModel();    
        try {
            Controller.run(view,model);
        } catch (ExceptionManager ex) {
            Logger.getLogger(DINReto0.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        }
    
}
