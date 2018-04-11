package base;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PaisConnectionFactory {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	// Obtém conexão com o banco de dados
	public static Connection conectar() throws SQLException {
		String servidor = "localhost";
		String porta = "3306";
		String database = "mundo";
		String usuario = "root";
		String senha = "12345678";
		return DriverManager.getConnection("jdbc:mysql://" + servidor + ":"
				+ porta + "/" + database + "?user=" + usuario + "&password="
				+ senha);
	}

}