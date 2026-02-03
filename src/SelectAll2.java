import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SelectAll2 {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@172.16.15.67:1521:xe", "system", "1234");
			System.out.println("ㅈㄴㅇㄹㄴㄹ박");
			System.out.println(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}



