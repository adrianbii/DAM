package Bank;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {
	private Connection con;
	private String usuario;
	private String password;
	
	public DB() throws Exception{
		this("root","");
		
	}
	public DB(String usuario, String pass) throws Exception {
		
		this.usuario = usuario;
		this.password = pass;
		String sURL = "jdbc:mysql://localhost/mychat?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		con = DriverManager.getConnection(sURL,this.usuario,this.password);
	}
	
	public Connection getCon() {
		return con;
	}
	
}