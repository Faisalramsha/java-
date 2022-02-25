package com.faisal.JDBCexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "JDBC" );
        try {
    		// load driver class for mysql db
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		// connection url for mysql db(jdbc:mysql://localhost:3306/dbname,"username","password")
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/core", "root", "faisal");
    		// execute queries with DB
    		Statement st = con.createStatement();
    		
    		//inserting a record into db table
    		st.executeUpdate("insert into student1 values(3,'Johnn',40)");
    	System.out.println("inserted succesfully into table");

	// updating record in db table
    	//	st.executeUpdate("update student set sname='Jay' where sid=3 ");
    	//	System.out.println("Updated successfully ");
    		

//deleting a record into db table
    //	st.executeUpdate("delete from student where sid=4 ");
    //	System.out.println("  delete succesfully into table");
    		
    		
    		
    		//executeQuery - used to execute SELECT query
    		ResultSet rs = st.executeQuery("select * from student1");
    		while(rs.next()) {
    			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +rs.getInt(3));
    			//getInt - return column index of current row as int
    			//getString - return column index of current row as String
    		}
    		con.close();
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
    }
}
