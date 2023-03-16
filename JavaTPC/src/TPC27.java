import kr.poly.*;

public class TPC27 {

	public static void main(String[] args) {
		//Remocon으로 TV클래스를 구동하시오.
		
		Remocon r = new TV();
		for(int i=0;i<40;i++) {
			r.chUp();
		}
		
		for(int i=0;i<40;i++) {
			r.chDown();
		}
		r.internet();
	}

}
