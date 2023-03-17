package kr.tpc;

public class JavaOracle implements Dbconnect{
	//Oracle 벤더에서 제공하는 클래스 가정
	@Override
	public void getConnection(String url, String user, String password) {
		System.out.println("Oracle DB가 접속됩니다.");
	}

}
