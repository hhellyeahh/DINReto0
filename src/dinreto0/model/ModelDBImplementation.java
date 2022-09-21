/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.model;

import exceptions.ExceptionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author 2dam
 */
public class ModelDBImplementation implements Model {
     private Connection con;
	private PreparedStatement stmt;
	private ConnectionOpenClose conection = new ConnectionOpenClose();
   

    @Override
    public String getGreeting() throws ExceptionManager {
         return null;
     
    }
}
