/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import exceptions.ExceptionManager;

public class ConnectionOpenClose {

	protected ResourceBundle configFile;
	protected String url;
	protected String user;
	protected String pass;
	protected Connection con;
	protected PreparedStatement stmt;

	public ConnectionOpenClose() {
		configFile = ResourceBundle.getBundle("controlador/config");
		url = configFile.getString("URL");
		user = configFile.getString("USER");
		pass = configFile.getString("PASSWORD");
	}

	public Connection openConnection() throws ExceptionManager {
		Connection con = null;
		return con;
	}

	public void closeConnection(PreparedStatement stmt, Connection con) throws SQLException {
		if (stmt != null)
			stmt.close();

		if (con != null)
			con.close();

	}

}