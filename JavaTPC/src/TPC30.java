import kr.tpc.*;
public class TPC30 {

	public static void main(String[] args) {
		// A, B class를 저장할 배열
		// A, B는 타입이 다르다.
		Object[] o = new Object[2]; // 다형성 배열
		o[0] = new A();
		o[1] = new B();
		
		for(int i=0; i<o.length; i++) {
			if(o[i] instanceof A) {
				((A)o[i]).go();
			}
			else {
				((B)o[i]).go();
			}
		}
		printGO(o);
	}

	private static void printGO(Object[] o) {
		for(int i=0; i<o.length; i++) {
			if(o[i] instanceof A) {
				((A)o[i]).go();
			}
			else {
				((B)o[i]).go();
			}
		}
	}

}
