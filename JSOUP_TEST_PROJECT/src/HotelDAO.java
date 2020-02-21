import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HotelDAO {
	private Connection conn;
	private PreparedStatement ps;
	private final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	public HotelDAO() {
		try {
			//new, Class.forName => memory allocation -> Class.forName : used in Spring
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(URL, "hr", "happy");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void getDisconnection() {
		try {
			if(ps != null) {
				ps.close();
			}
			if(conn != null) {
				conn.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//hotel insert
	public void insertToDB(HotelVO vo) {
		//System.out.println("insertToDB");
		try {
			getConnection();
			//System.out.println("connection ok");
			String sql = "INSERT INTO hotels VALUES(" +
			"(SELECT NVL(MAX(id)+1,1) FROM hotels),?,?,?,?,?,?,?,?,?,?,?,?,?)"; // 전송
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, vo.getTitleV());
			ps.setInt(2, vo.getCategoryV());
			ps.setDouble(3, vo.getStarV());
			ps.setString(4, vo.getLocal_nameV());
			ps.setString(5, vo.imageDisplay());
			ps.setString(6, vo.getAreaV());
			ps.setString(7, vo.getAddressV());
			ps.setString(8, vo.getCallV());
			ps.setString(9, vo.getWebsiteV());
			ps.setString(10, vo.getHowtoV());
			ps.setString(11, vo.getDescriptionV());
			ps.setString(12, vo.replyDisplay());
			ps.setString(13, vo.getLocationV());
			
			ps.executeUpdate(); // commit()
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			getDisconnection();
		}
	}
}
