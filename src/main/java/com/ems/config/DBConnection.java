package com.ems.config;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection {
    private static Connection connection;

    public static Connection getConnection() throws Exception{
        Properties prop = new Properties();//predefined class in java to load properties
        prop.load(DBConnection.class.getClassLoader().getResourceAsStream("db.properties"));

        final String URI = prop.getProperty("db.URI");
        System.out.println(URI);
        final String USERNAME =prop.getProperty("db.USERNAME");
        final String PASSWORD = prop.getProperty("db.PASSWORD");
        connection = DriverManager.getConnection(URI,USERNAME,PASSWORD);
        System.out.println("connection Established ...");

        return connection;
    }

    public static void main(String[] args) throws Exception {
        getConnection();
    }



}
