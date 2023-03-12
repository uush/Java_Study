import java.lang.*; // String, System ...  Default Package(생략)	

import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.MyUtility;

public class TPC18 {

	public static void main(String[] args) {
		// 1. JAVA에서 자공해주는 class들... API
		// 문자열(String)
		String str = new String("APPLE");
		System.out.println(str.toLowerCase()); //apple
		
		// 2. 직접 만들어서 사용하는 Class들... DTO/VO, DAO, Utility.. API
		//kr.tpc.MyUtility
		MyUtility my = new MyUtility();
		int sum = my.hap();
		System.out.println(sum);
		
		// 3. 다른 회사에서 만들어 놓은 Class들 ...API
		// Gson -> json : https://mvnrepository.com
		Gson g = new Gson();
		BookVO vo = new BookVO("java", 13000, "youngjin", 800 );
		String json = g.toJson(vo);
		// {"title":"java","price":13000,"company":"youngjin","page":800} 
		// 메모리에 있는 객체를 문자열 형태로 바꿔주었다. json구조로 데이터포맷을 만들 때 사용.
		// key : value
		System.out.println(json);
	}

}
