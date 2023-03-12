import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {

	public static void main(String[] args) {
		// 관계를 이해하라. PDT VS UDDT
		// 정수 1개를 저장하기 위한 변수를 선언하시오.
		int a;
		a=10;
		
		// 책 1권을 저장하기 위한 변수를 선언하시오.
		Book b;
		b=new Book(); //객체생성, 메모리 어딘가에 상태정보를 담는 객체 생성, 번지 할당
		
		b.title = "JAVA";
		b.price = 15000;
		b.company = "한빛미디어";
		b.page = 700;
		
		System.out.print(b.price+"\t");
		System.out.print(b.company+"\t");
		System.out.println(b.page);
		
		PersonVO p;
		p = new PersonVO();
		p.name = "chloe";
		p.age = 25;
		p.height=169.8f;
		p.weight=54.1f;
		
		System.out.print(p.name+"\t");
		System.out.print(p.age+"\t");
		System.out.print(p.weight+"\t");
		System.out.println(p.height);
	}

}
