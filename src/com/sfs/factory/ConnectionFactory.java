package com.sfs.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private static Connection connection;
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Yogesh@123");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }

    public void cleanup(){
        try {
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
