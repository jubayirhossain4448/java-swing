package com.jubayir.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection {

    private static final String DRIVERNAME = "oracle.jdbc.driver.OracleDriver";
    private static final String HOST = "jdbc:Oracle:thin:@localhost";
    private static final String PORT = "1521";
    private static Connection connection;
    private static String url = HOST + ":" + PORT + ":";

    static Connection getConnection(String dbname, String dbUserName, String dbPass) {

        try {
            connection = DriverManager.getConnection(url + dbname, dbUserName, dbPass);
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);

        }
        return connection;
    }

}
