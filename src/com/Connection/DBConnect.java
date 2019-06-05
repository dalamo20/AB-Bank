package com.Connection;
import java.sql.*;

public class DBConnect {
    public static void main(String[] args) {
        try {
            try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_db", "root", "root");
            System.out.println("Connected to " + con.getSchema());
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from employees where empl_id = " +1);
            while(rs.next()){
                String empl_first = rs.getString("empl_first");
                String empl_id = rs.getString("empl_id");
            }
            PreparedStatement ps = con.prepareStatement("Select * from employees where empl_id = ? and empl_salary = ?");
            ps.setString(0,"1");
            ps.setString(1, "1000");
            ps.executeQuery();
            ps.executeUpdate();
            ps.executeUpdate("insert into employees(empl_id, empl_first, empl_last) values(empseq.nextval, ?)"); //creates primary key w/ sequence
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
