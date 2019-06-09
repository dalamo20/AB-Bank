package com.Connection;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySqlConnect {
	
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con = DriverManager.getConnection(  
		"jdbc:mysql://localhost:8889/batchpro","root","root");   
		System.out.println("Connected to " + con.getSchema());
		Statement st=con.createStatement();  
		con.createStatement()
	    .execute("CREATE TABLE accounts(\n" +
	         " id integer primary key auto_increment,\n" +
	         " Account_id varchar(25) not null unique,\n" +
	         " AccNum int(50) not null,\n" +
	         " AccType varchar(250) not null,\n" +
	         " BankName varchar(250) not null,\n" +
	         " Customer_id  varchar(25) not null unique,\n" +
	         " firstname varchar(250) not null,\n" +
	         " lastname varchar(250) not null,\n" +
	         " address varchar(250) not null\n" +
	         ")");  

		}  catch(Exception e){ 
			System.out.println(e);
		}

}
}
