package com.sist.exception1;

import java.sql.*; // connect to Oracle -> CheckException!
public class MainClass {

	public static void main(String[] args) {
		
		Connection conn = null; // 오라클 연결(Socket을 가지고 있다)
		PreparedStatement ps = null; // SQL문장 전송 -> 수신
		
		try {
			// 1. 오라클 드라이버 설정 : 2개 - thin, oci
			//thin : 오라클과 연결하기 위해 middleware를 거쳐서 통신. - 속도는 oci가 빠르다. thin : 무료, oci : 유료!!
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이브 깔기! - class형으로 되어있기 때문에 불러오면 된다
			// 2. 연결
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			conn=DriverManager.getConnection(url, "hr", "happy");// 데이터 감출 때 xml을 이용
			// 3. SQL문장을 전송한다
			String sql = "SELECT ename, job, sal FROM emp";
			ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				//rs.previous(); -> 요녀석은 가져온 데이터의 끝에서부터 처음으로 부르는 메서드
				System.out.print(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3) + "\n");
			}
			rs.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				conn.close();
			}catch(Exception e) {
				
			}
		}
	}

}
