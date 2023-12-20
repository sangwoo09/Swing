package korea.kia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.Connector;

public class KiaRepo {

	public String[][] list() {
		Connection conn = Connector.makeConn();
		
		ArrayList<String[]> al = new ArrayList<>();
		
		String sql = "SELECT * FROM kia";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String no = String.valueOf(rs.getInt(1));
				String syamei = rs.getString(2);
				String nenryo = rs.getString(4);
				String nenpi = rs.getString(5);
				String haiki = rs.getString(8);
				String kudou = rs.getString(9);
				
				String[] kialist = {no, syamei, nenryo, nenpi, haiki, kudou};
				al.add(kialist);
			}
			return al.toArray(new String[0][0]);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
