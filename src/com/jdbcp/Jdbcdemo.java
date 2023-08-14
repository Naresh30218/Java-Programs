package com.jdbcp;
import java.sql.*;
public class Jdbcdemo {

	public static void main(String[] args) {
		String userName = "AmanRane";
        String password = "Aman@12";

        if(userName=="sumitsg") {
        	try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rhythmdb","root","admin");
                String query = "select * from rhythmdb.admintb where adname=? and password=?";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, userName);
                pst.setString(2, password);

                ResultSet rs=pst.executeQuery();

                if (rs.next()){
                    System.out.println("admin");
                    System.out.println(rs.getString(2));
                    
                }
                else {
                    System.out.println("Falsea");
                }

            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e);

            }
        }
        else {
        	try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rhythmdb","root","admin");
                String query = "select * from rhythmdb.usertb where uname=? and upassword=?";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, userName);
                pst.setString(2, password);

                ResultSet rs=pst.executeQuery();

                if (rs.next()){
                	System.out.println("User");
                }
                else {
                	System.out.println("falseu");
                }

            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);

            }
        }

	}

}
