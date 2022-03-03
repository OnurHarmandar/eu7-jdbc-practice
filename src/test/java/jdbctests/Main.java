package jdbctests;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String dbUrl="jdbc:oracle:thin:@50.17.164.79:1521";
        String dbUsername="hr";
        String dbPassword="hr";

        //create connection
        Connection connection= DriverManager.getConnection(dbUrl,dbUsername,dbPassword);

        //create statement object
        Statement statement=connection.createStatement();

        //run query and get the result in resultset object
        ResultSet resultSet=statement.executeQuery("Select * from departments");
/*
       // "1 - Europe"
        //move pointer to first row
        resultSet.next();
        //getting information with column name
        System.out.println(resultSet.getString("region_name"));
        //getting information with column index(starts with 1)
        System.out.println(resultSet.getString(2));
        System.out.println(resultSet.getInt(1)+" - "+resultSet.getString(2));

        //"2- Americas"
        //move pointer to first row
        resultSet.next();
        //getting information with column name
        System.out.println(resultSet.getString("region_name"));
        //getting information with column index(starts with 1)
        System.out.println(resultSet.getString(2));
        System.out.println(resultSet.getInt(1)+" - "+resultSet.getString(2));

 */

        while(resultSet.next()){
            System.out.println(resultSet.getString(1)+" - "+resultSet.getString(2)+" - "+resultSet.getInt(3)+" - "+resultSet.getString(4));
        }





        //close all connections
        resultSet.close();
        statement.close();
        connection.close();




    }
}
