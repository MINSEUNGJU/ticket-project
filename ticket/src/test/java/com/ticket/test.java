package com.ticket;

import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;

public class test {

	   static {
		      try {
		         Class.forName("com.mysql.cj.jdbc.Driver");
		      } catch(Exception e) {
		         e.printStackTrace();
		      }
		   }
		   
		   @Test
		   public void testConnection() {
		      
		      try(Connection con = 
		            DriverManager.getConnection(
		            	  "jdbc:mysql://localhost:3306/ticket?serverTimezone=UTC&allowPublicKeyRetrieval=true",
		                  "ticket",
		                  "12345678")){
		         System.out.println(con);
		      } catch (Exception e) {
		         fail(e.getMessage());
		      }
		      
		   }
}
