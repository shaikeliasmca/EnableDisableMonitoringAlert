import java.sql.DriverManager;

import com.mysql.jdbc.DatabaseMetaData;

public class Dbmd {
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		  
		java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");  

		DatabaseMetaData dbmd=(DatabaseMetaData) con.getMetaData();  
		  
		System.out.println("Driver Name: "+dbmd.getDriverName());  
		System.out.println("Driver Version: "+dbmd.getDriverVersion());  
		System.out.println("UserName: "+dbmd.getUserName());  
		System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
		System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
		  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  


}
