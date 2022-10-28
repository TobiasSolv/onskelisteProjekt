package com.example.onskelisteprojekt.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private static String hostname;
    private static String username;
    private static String password;
    private static Connection conn;

    public static Connection getConnection(){

        hostname="";
        username="";
        password="";

        try{
            conn= DriverManager.getConnection(hostname,username,password);
        }  catch (SQLException e){
            System.out.println("Kan ikke forbinde til database");
            throw new RuntimeException(e);
        }

        System.out.println("forbindelse til database ok");



        return conn;

    }

}
