import java.sql.*;
public class JdbcDemo {
	
	//method to connecting database with java
	public static void connecting() throws SQLException {
		
		//url of database
		String url = "jdbc:oracle:thin:@desktop-e8njm65:1521:xe";
		

		String username = "hr";
		String password = "hr";
		
		//query for execution
		String query = "select*from Students";
		
		//create connection
		//connection is a interface, so with the reference of connection
		//we create a object for DriverManager Class Invoking getconnection method
		Connection con = DriverManager.getConnection(url, username, password);
		
		//create object for statement
		Statement st = con.createStatement();
		
		//execute query 
		ResultSet rs =st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("Id is " + rs.getInt(1));		//1 is a column number
			System.out.println("Name is " + rs.getString(2));
			System.out.println("GPA is " + rs.getInt(3));
			
		}
		
		
		//close the connection
		con.close();
	}
	
	//method to insert the record
	public static void insertRecord() throws SQLException {
	
		String url = "jdbc:oracle:thin:@desktop-e8njm65:1521:xe";	
		String username = "hr";
		String password = "hr";
		
		//insert into table by directly gives the values in the query
		String query = "insert into Students values(6, 'manoj', 5)";
		
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		
		//no need to create object for result set.
		//because we don't fetch the data set
		//we just insert the data into the record
		//instead of creating object we create integer to know about number of rows are inserted
		int rs = st.executeUpdate(query);
		
		//just printing the number of rows are inserted
		System.out.println("Number of row affected is " + rs);
		
		con.close();
		
	}
	

	//insert values using variables
	public static void insertVar() throws SQLException {
		String url = "jdbc:oracle:thin:@desktop-e8njm65:1521:xe";
		String username = "hr";
		String password = "hr";
		
		//variables for values
		int id = 7;
		String Name = "ram";
		int gpa = 5;
		
		//format of query when we use variables
		String query = "insert into Students values(" + id + ",'" + Name + "'," + gpa + ")";
		
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		
		int rs = st.executeUpdate(query);
		System.out.println("Number of row affected is " + rs);
		
		con.close();
			
	}
	
	//insert values using prepared Statement
	public static void preparedStatement() throws SQLException {
		String url = "jdbc:oracle:thin:@desktop-e8njm65:1521:xe";
		String username = "hr";
		String password = "hr";
		
		//use "?" as a arguments for the prepared statement
		String query = "insert into Students values(?,?,?)";
		
		Connection con = DriverManager.getConnection(url, username, password);
		
		//instead of creating statement we create a prepared Statement
		PreparedStatement pst = con.prepareStatement(query);
		
		//declare the variables
		int id = 8;
		String Name = "Vimal";
		int gpa = 7;
			
		//set the values of variables to Prepared Statement
		pst.setInt(1, id);
		pst.setString(2, Name);
		pst.setInt(3, gpa);
		
		//execute the Prepared Statement
		int rs = pst.executeUpdate();
		System.out.println("Number of row affected is " + rs);
		
		con.close();
	}
	
	//Delete record from the table
	public static void delete() throws SQLException {
		String url = "jdbc:oracle:thin:@desktop-e8njm65:1521:xe";
		String username = "hr";
		String password = "hr";
		
		//variables for values
		int id = 7;
		
		//query for delete the record
		String query = "delete from Students where id =" + id ;
		
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		
		
		//executeUpdate() method is also used to delete the record
		int rs = st.executeUpdate(query);
		System.out.println("Number of row affected is " + rs);
		
		con.close();
			
	}
	
	//Update record from the table
		public static void update() throws SQLException {
			String url = "jdbc:oracle:thin:@desktop-e8njm65:1521:xe";
			String username = "hr";
			String password = "hr";
			
			
			//query for update the record
			String query = "update Students set gpa = 10 where id = 1";
			
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();
			
		
			int rs = st.executeUpdate(query);
			System.out.println("Number of row affected is " + rs);
			
			con.close();
				
		}
		
		//Calling Simple Stored Procedure
		public static void CallStrPro() throws SQLException {
			String url = "jdbc:oracle:thin:@desktop-e8njm65:1521:xe";
			String username = "hr";
			String password = "hr";
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			//callable Statement for Stored procedures
			CallableStatement cst = con.prepareCall("{call GetEmp()}");
			ResultSet rs = cst.executeQuery();
			
			while(rs.next()) {
				System.out.println("Id is " + rs.getInt(1));		
				System.out.println("Name is " + rs.getString(2));
				System.out.println("GPA is " + rs.getInt(3));
				
			}
			
			con.close();
				
		}
	
		//Calling Simple Stored Procedure with input parameter
		public static void CallStrProwithpara() throws SQLException {
			String url = "jdbc:oracle:thin:@desktop-e8njm65:1521:xe";
			String username = "hr";
			String password = "hr";
			
			int id =3;
			Connection con = DriverManager.getConnection(url, username, password);
			CallableStatement cst = con.prepareCall("{call GetEmpById(?)}");
			cst.setInt(1, id);
			ResultSet rs = cst.executeQuery();
			
			while(rs.next()) {
				System.out.println("Id is " + rs.getInt(1));		
				System.out.println("Name is " + rs.getString(2));
				System.out.println("GPA is " + rs.getInt(3));
				
			}
			
			con.close();
				
		}
	public static void main(String[] args) throws SQLException {
		
		connecting();		//invoking connecting method
		
		insertRecord();
		
		insertVar();
		
		preparedStatement();
		
		delete();
		
		update();
		
		CallStrPro();
		
		CallStrProwithpara();
		
		
		
	}

}
