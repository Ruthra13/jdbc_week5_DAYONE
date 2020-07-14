package controller;

import java.sql.Connection;
import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws Exception {
		
		ConnectionManager con = new ConnectionManager();
		Connection obj = null;
		obj = con.getConnection();
		if(obj!=null)
		{
			System.out.println("Connection Established");
		}
		else
		{
			System.out.println("Check your connection");
		}
		
		
	}
}
