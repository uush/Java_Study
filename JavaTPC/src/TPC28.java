import kr.poly.A;

public class TPC28 {

	public static void main(String[] args) {
		A a = new A();
		a.display();
		//System.out.println(a.toString());
		System.out.println(a);
		// 재정의 하지 않으면 번지값을 출력해 준다. 
		// Object-->toString() : kr.poly.A@2d6e8792
		
		Object o = new A(); // upcasting
		((A)o).display();
		System.out.println(o.toString());
	}

}
