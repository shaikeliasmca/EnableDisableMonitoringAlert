import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

/**
 * 
 */

/**
 * @author Noorjahan
 *
 */
public class FetchRecord {
	public static void main(String args[])throws Exception{  
		Class.forName("jdbc.com.mysql.Driver");  
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");  
		Statement stmt=con.createStatement();  
		  
		//stmt.executeUpdate("insert into emp765 values(33,'Irfan',50000)");  
		//int result=stmt.executeUpdate("update emp765 set name='Vimal',salary=10000 where id=33");  
		int result=stmt.executeUpdate("delete from emp765 where id=33");  
		System.out.println(result+" records affected");  
		con.close();  
		}}  
	

