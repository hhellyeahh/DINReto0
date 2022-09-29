/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.model;

import exceptions.ExceptionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Zuli&Leire
 */
public class ModelDBImplementation implements Model {

    private Connection con;
    private PreparedStatement stmt;
    private ConnectionOpenClose conection = new ConnectionOpenClose();

    /**
     * Open a MySQL conection and returns the greeting
     * @return greeting
     * @throws ExceptionManager 
     */
    @Override
    public String getGreeting() throws ExceptionManager {
        ResultSet rs = null;
        String greeting = null;

        con = conection.openConnection();
        String getGreeting = "SELECT * FROM greeting";

        try {
            stmt = con.prepareStatement(getGreeting);
            rs = stmt.executeQuery();

            while (rs.next()) {
                greeting = rs.getString("greeting");
            }

            if (rs != null) {
                rs.close();
                conection.closeConnection(stmt, con);
            } else {
                System.out.println("efe");
            }

        } catch (SQLException e) {

            String msg = "Error";
            ExceptionManager x = new ExceptionManager(msg);
            throw x;
        }

        return greeting;
    }
}
