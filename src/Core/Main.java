/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;
import movies.Controller.MainController;
import movies.Util.DBConnector;
import java.sql.*;

/**
 *
 * @author thor
 */
public class Main {
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		//MainController.mainControllerLooop();

		connection = DBConnector.getConnection();
		String q = "Select * from movies";
		statement = connection.createStatement();
		resultSet = statement.executeQuery(q);
		// få resultater
		
	}
	
}
