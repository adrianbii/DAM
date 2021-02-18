
import java.sql.ResultSet;
import java.sql.Statement;

public class DBMychat extends DB {
	public DBMychat() throws Exception {

	}

	public boolean isUser(DBMychat usuario) {
		boolean esta = false;
		try {
			String query = "SELECT count(*) FROM users WHERE nick = '" + usuario.getNick() + "' and passw ='"
					+ usuario.getPassword() + "';";
			Statement sentencia = this.getCon().createStatement();
			ResultSet resultado = sentencia.executeQuery(query);
			int i = 0;
			if (resultado.next())
				i = resultado.getInt(1);
			if (i != 0)
				return true;

			sentencia.close();
			return false;
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	private String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getNick() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean newUser(DBMychat usuario) {
		boolean esta = false;
		try {
			String st = "insert into users values( '" + usuario.getNick() + "' ,'" + usuario.getPassword() + "');";
			Statement sentencia = this.getCon().createStatement();
			sentencia.executeUpdate(st);
			return true;

		}

		catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
}