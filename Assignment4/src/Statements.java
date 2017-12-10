/*
The PreparedStatement interface:
It is a sub-interface of Statement. It is used to execute parameterized query.
The performance of the application will be faster if you use PreparedStatement interface
because query is compiled only once.
The prepareStatement() method of Connection interface is used to return the object of PreparedStatement. 
  Syntax:
     public PreparedStatement prepareStatement(String query)throws SQLException{}  
The ResultSetMetaData interface:    
The metadata means data about data i.e. we can get further information from the data.
If you have to get metadata of a table like total number of column, column name, column type etc. ,
ResultSetMetaData interface is useful because it provides methods to get metadata from the ResultSet object. 
The getMetaData() method of ResultSet interface returns the object of ResultSetMetaData.
   Syntax:
        public ResultSetMetaData getMetaData()throws SQLException      
 */
import java.sql.*;
public class Statements
{

	public static void main(String[] args)
	{
		
		String url="jdbc:h2:tcp://localhost/~/test";
	String username="sa";
	String pass="";
	try(Connection con= DriverManager.getConnection(url, username, pass))
	{
		Statement stmt= con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from customer");
		ResultSetMetaData rsmd=rs.getMetaData();  
		while(rs.next())
		{
			String col1=rs.getString(1);
			String col2=rs.getString(2);
			String col3=rs.getString(3);
			
			System.out.println(col1+" "+"has name"+" "+col2+" "+"from"+" "+col3);
			
			
		}
		System.out.println();
		
		System.out.println(rs.getFetchSize());
		int i=0;
		System.out.println();
		System.out.println("Total columns: "+rsmd.getColumnCount());  
		while(i<rs.getFetchSize())
		{
			
			i++;
		System.out.println(i +"column: "+rsmd.getColumnName(i));  
		System.out.println("Type of"+ i+" column: "+rsmd.getColumnTypeName(i)); 
		
		} 
		
	}
	catch(SQLException e)
	{
		
		System.out.println(e.getMessage());
	}
	
		
		
	
	}

}
