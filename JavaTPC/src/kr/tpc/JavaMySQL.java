package kr.tpc;

public class JavaMySQL implements Dbconnect{
	// MySQL 드라이버 클래스로 가정
	@Override
	public void getConnection(String url, String user, String password) {
		System.out.println("MySQL DB가 접속됩니다.");
	}

}
