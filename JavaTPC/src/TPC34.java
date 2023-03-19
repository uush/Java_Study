//import java.lang.*;
public class TPC34 {

	public static void main(String[] args) {
		// String
		// java.lang.String str = new java.lang.String("APPLE");
		// 문자열도 index가 있다.
		String str = new String("APPLE");
		String v = str.toLowerCase();
		System.out.println(v); //apple
		System.out.println(str.charAt(3));
		System.out.println(str.length());
		System.out.println(str.indexOf("PL")); //start index
		System.out.println(str.indexOf("PX")); //-1은 실패나 끝을 의미.
		System.out.println(str.replaceAll("P", "X")); //AXXLE
		
	}

}
