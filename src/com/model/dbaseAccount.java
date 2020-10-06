/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dbaseAccount {
  
    String dbusername="root";
    String dbpassword="";
    String dburl="jdbc:mysql://localhost:3306/travel_agency";
    String dbdriver="com.mysql.jdbc.Driver";
    Connection dbcon;
    
     void dbConnect() throws ClassNotFoundException, SQLException
     {
     dbcon = DriverManager.getConnection(dburl, dbusername, dbpassword);
    }
     void dbclose() throws SQLException
    {
        dbcon.close();
    }

      public ResultSet getSourceCity() throws ClassNotFoundException, SQLException
    {
        dbConnect();
        String sql = "select distinct source from flight";
        PreparedStatement pstmt = dbcon.prepareStatement(sql); //javas built in class
        ResultSet rst = pstmt.executeQuery(); // this will execute the query and store 
         return (rst);
    }
      public ResultSet getDestinationCity() throws ClassNotFoundException, SQLException
    {
        dbConnect();
        String sql = "select distinct destination from flight";
        PreparedStatement pstmt = dbcon.prepareStatement(sql); //javas built in class
        ResultSet rst = pstmt.executeQuery(); // this will execute the query and store 
                                              //the result in the resultset rst
        return (rst);
    }

       public ResultSet getDepartureFlight(String s,String d) throws ClassNotFoundException, SQLException
    {
        dbConnect();
        String sql = "select * from flight where source =  " + "'" + s + "'" + " and destination =" + "'" + d + "'" ;
       
        PreparedStatement pstmt = dbcon.prepareStatement(sql);
        ResultSet rst = pstmt.executeQuery(); 
                                              
        return (rst);
    }
        public ResultSet getReturnFlight(String s,String d) throws ClassNotFoundException, SQLException
    {
        dbConnect();
        String sql = "select * from flight where source =  " + "'" + d + "'" + " and destination =" + "'" + s + "'" ;
       
        PreparedStatement pstmt = dbcon.prepareStatement(sql); //javas built in class
        ResultSet rst = pstmt.executeQuery(); // this will execute the query and store 
                                              //the result in the resultset rst
        return (rst);
    }
         public ResultSet finaldepart(String s) throws ClassNotFoundException, SQLException
    {
        dbConnect();
       String sql = "select departtime,fare from flight where flightid =  '" +  s + "'"  ;
       
        PreparedStatement pstmt = dbcon.prepareStatement(sql); //javas built in class
        ResultSet rst = pstmt.executeQuery(); // this will execute the query and store 
                                            //the result in the resultset rst
        return (rst);
    }
          public ResultSet finalreturn(String s) throws ClassNotFoundException, SQLException
    {
        dbConnect();
       String sql = "select departtime,fare from flight where flightid =  '" +  s + "'"  ;
      PreparedStatement pstmt = dbcon.prepareStatement(sql); //javas built in class
        ResultSet rst = pstmt.executeQuery(); // this will execute the query and store 
                                            //the result in the resultset rst
        return (rst);
    }

}