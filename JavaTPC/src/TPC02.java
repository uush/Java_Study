
public class TPC02 {

	public static void main(String[] args) {
		// 프로그래밍의 3대 요소 : 변수, 자료형(datatype), 할당(=)
		// 1+1=2 메모리에서 계산되어야 한다.
		
		int a, b, c = 0;
		a=1;
		b=1;
		c = a+b;
		System.out.println(c);
		
		float f; //float, double
		f= 34.5f;//자동으로 double형으로 인식하기 때문에 f를 붙여준다.
		System.out.println(f);
		
		char d;
		d='A';  //""은 string타입, 문자열이다.
		System.out.println(d);
		
		boolean g;
		g=true; //false(거짓), true(참)
		System.out.println(g);
		
		//새로운 자료형은 클래스에서 설계한다.
		//구조체처럼 설계하고 그 구조체의 이름을 Book이라는 자료형으로 만들 수 있다.
		//변수선언을 해야 기억공간이 만들어진다.
		//변수선언을 하면 Symbol Table(변수목록표)가 만들어 진다.
	}

}
