package korea.hyundai.list.car.detailrepo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.Connector;

public class VenueRepo {

	public String[] detail() {
		Connection conn = Connector.makeConn();
		String[] accent = new String[9];
		
		String sql = "select * from hyundai where no = 2";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			//ps.setInt(1, Integer.parseInt(no));
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				String syamei = rs.getString(2);
				String price = String.valueOf(rs.getInt(3));
				String nenryo = rs.getString(4);
				String nenpi = rs.getString(5);
				String syutsu = rs.getString(6);
				String toruku = rs.getString(7);
				String haiki = rs.getString(8);
				String kudou = rs.getString(9);
				
				//accent[0] = no;
				accent[1] = syamei;
				accent[2] = price;
				accent[3] = nenryo;
				accent[4] = nenpi;
				accent[5] = syutsu;
				accent[6] = toruku;
				accent[7] = haiki;
				accent[8] = kudou;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return accent;
	}
}
