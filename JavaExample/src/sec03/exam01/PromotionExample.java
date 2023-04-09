package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);
		// ,는 안되고 +로 해야하는 이유는 뭘까
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 : "+intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : "+floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue : "+doubleValue);

	}

}
