import kr.tpc.Dbconnect;
import kr.tpc.JavaMySQL;
import kr.tpc.JavaOracle;

public class TPC32 {

	public static void main(String[] args) {
		
		//Oracle, MySQL -> Driver class
		Dbconnect conn = new JavaOracle();
		conn.getConnection("url", "bit", "1234");
		
		conn = new JavaMySQL();
		conn.getConnection("url", "root", "ABCD");
		
	}

}
