package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AcessoBanco {

	public static void main(String[] args) throws SQLException {
		
		String sql = "select * from pessoa";
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection con = DriverManager.getConnection(url, "murilo", "niane");
		PreparedStatement stm = con.prepareStatement(sql);
		ResultSet rs = stm.executeQuery();
		
		while(rs.next()){
			System.out.println(rs.getString(2) + " - " + rs.getString(4));
		}
		
		rs.close();
		stm.close();
		con.close();
		
	}

}
