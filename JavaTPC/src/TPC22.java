import kr.tpc.*;
public class TPC22 {

	public static void main(String[] args) {
		// upcasting
		// Cat ani = new Cat();
		//Object ani = new Cat();
		Animal ani = new Cat(); //upcasting
		ani.eat(); //컴파일 시점 -> Animal, 실행 시점 -> Cat
		
		//ani.night();
		Cat c = (Cat)ani;
		c.night();
		
		((Cat)ani).night();
		
		ani = new Dog();
		ani.eat();
		// 다형성
		// 상위 클래스가 하위 클래스에게 동일한 메세지로 서로 다르게 동작시키는 원리
		Object o = new Dog();
		//o.eat(); 안 된다.
		((Dog)o).eat();
		
		
	}

}
