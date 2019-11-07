package movies.Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
    public static Connection getConnection(){

        Connection connection = null;

        String url = "jdbc:mysql://localhost:3306/movies?serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false";
        String user = "root";
        String kodeord = "root123";

        try {
            connection = DriverManager.getConnection(url,user,kodeord);
        } catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}