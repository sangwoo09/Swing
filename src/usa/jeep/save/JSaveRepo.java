package usa.jeep.save;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.Connector;

public class JSaveRepo {

	public boolean save(String syamei, int price, String nenryo, String nenpi, String syutsu, String toruku, String haiki, String kudou) {
		boolean isSuccess = false;
		
		Connection conn = Connector.makeConn();
		
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO `jeep`");
		sql.append("(`syamei`, `price`, `nenryo`, `nenpi`, `syutsu`, `toruku`, `haiki`, `kudou`)");
		sql.append(" values ");
		sql.append("(?, ?, ?, ?, ?, ?, ?, ?);");
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql.toString());
			
			ps.setString(1, syamei);
			ps.setInt(2, price);
			ps.setString(3, nenryo);
			ps.setString(4, nenpi);
			ps.setString(5, syutsu);
			ps.setString(6, toruku);
			ps.setString(7, haiki);
			ps.setString(8, kudou);
			
			int result = ps.executeUpdate();
			
			if(result > 0) {
				isSuccess = true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}

}
