package com.ems.config;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    private static Connection connection;

    private DBConnection() throws IOException {

           Properties prop = new Properties();//predefined class in java to load properties

           prop.load( DBConnection.class.getClassLoader().getResourceAsStream("db.properties"));
           final String URL = prop.getProperty("URL");
           final String USERNAME =prop.getProperty("USERNAME");
           final String PASSWORD = prop.getProperty("PASSWORD");
           try{
               connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
               System.out.println("connection Established ...");
           }
           catch (SQLException s){
               s.printStackTrace();
           }

    }

    public static Connection getDBConnection() throws IOException{
          if(connection == null){
              new DBConnection();
          }
          return  connection;

    }

  //for testing
//    public static void main(String[] args) throws Exception {
//        getConnection();
//    }



}
