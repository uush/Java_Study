import kr.poly.*;
public class TPC26 {

	public static void main(String[] args) {
		// Remocon r = new Remocon; 인터페이스 자체는 객체 생성을 할 수 없다.	
		Remocon r = new TV();
		r.chUp();
		r.chDown();
		r.internet();
		
		r = new Radio();
		r.chUp();
		r.chDown();
		r.internet();
		
		//추상클래스와 인터페이스는 다형성을 보장하기 위해서 나온 개념이다.
		
		
	}

}
