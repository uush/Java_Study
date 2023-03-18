import kr.tpc.*;
public class TPC29 {

	public static void main(String[] args) {
		A a = new A();
		display(a);
		B b = new B();
		display(b);
		
	}

	private static void display(Object o) { // 다형성 인
		if(o instanceof A) {
			// 하위 클래스의 메서드 go()를 사용하고 싶으면 다운캐스팅 해야 한다.
			((A)o).go();
		}
		else {
			((B)o).go();
		}
		
		
	}


}
