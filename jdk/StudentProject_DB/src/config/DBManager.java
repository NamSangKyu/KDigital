package config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	private static DBManager instance = new DBManager();
	private Connection conn;
	
	private DBManager() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe",
					"scott", "tiger");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static DBManager getInstance() {
		if(instance == null)
			instance = new DBManager();
		return instance;
	}

	public Connection getConn() {
		return conn;
	}
	
}
