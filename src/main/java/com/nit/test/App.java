package com.nit.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Connection con=null;
        
        try {
        	
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
			if(con!=null) {
				System.out.println("Connection eshtablished");
			}else {
				System.out.println("Connection not eshtablished");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
}
