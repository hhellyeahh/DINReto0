/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.model;

import exceptions.ExceptionManager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2dam
 */
public class ModelFileImplementation implements Model {

    @Override
    public String getGreeting()throws ExceptionManager {
        
      Properties prop = getFile("config.properties");
    String greeting =  prop.getProperty("GREETING");
        return greeting;

}

    private Properties getFile(String configpropeerties) throws ExceptionManager {
      FileInputStream fis = null;
      Properties prop = null;
       try {
         fis = new FileInputStream(configpropeerties);
         prop = new Properties();
         prop.load(fis);  
         fis.close();
      
      } catch(IOException ioe) {
        String error = "CANT GET THE GREETING";
			ExceptionManager uwu = new ExceptionManager(error);
			throw uwu;
      } 
      
      
        return prop;
       
    }   
}