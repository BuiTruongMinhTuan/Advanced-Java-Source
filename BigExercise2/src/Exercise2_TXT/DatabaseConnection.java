
package Exercise2_TXT;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * @author Bui Truong Minh Tuan
 * Date : 19/9/2016
 * Version : 1.0
 * 
 */
public class DatabaseConnection {
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/cdstore?useUnicode=true&characterEncoding=utf8";
	private static final String JDBC_DRIVER_CLASS = "com.mysql.jdbc.Driver";
	private static final String JDBC_USERNAME = "root";
	private static final String JDBC_PASSWORD = "";
	
	// connect to database -> return Connection
	public Connection connect() throws  SQLException,ClassNotFoundException{
		Class.forName(JDBC_DRIVER_CLASS);
		Connection conn = (Connection) DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
		return conn;
	}
}
