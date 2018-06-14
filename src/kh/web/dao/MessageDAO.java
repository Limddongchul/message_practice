package kh.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kh.web.dto.MessageDTO;

public class MessageDAO {

	private Connection getConnection() throws Exception {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbId = "kh";
		String dbPw = "kh";
		
		Connection con = DriverManager.getConnection(url, dbId, dbPw);
		
		return con;
		
	}
	
	public int insertData(String name, String message) throws Exception {
		Connection con = this.getConnection();
		String sql = "insert into messages values(message_seq.nextval,?,?)";
		
		PreparedStatement pstat = con.prepareStatement(sql);
		
		pstat.setString(1, name);
		pstat.setString(2, message);
		
		int result = pstat.executeUpdate();
		
		con.commit();
		pstat.close();
		con.close();
		
		return result;
		
	}
	
	public List<MessageDTO> getAllData() throws Exception {
		Connection con = this.getConnection();
		
		String sql = "select * from messages";
		
		PreparedStatement pstat = con.prepareStatement(sql);
		
		ResultSet rs = pstat.executeQuery();
		List<MessageDTO> result = new ArrayList<>();
		
		while(rs.next()) {
			MessageDTO dto = new MessageDTO();
			
			dto.setMessage_id(rs.getString(1));
			dto.setName(rs.getString(2));
			dto.setMessage(rs.getString(3));
			
			result.add(dto);
			
		}
		
		pstat.close();
		con.close();
		
		return result;
		
	}
	
	
}
