import kr.poly.*;
public class TPC25 {
	public static void main(String[] args) {
		Animal ani = new Dog(); //부모가 인터페이스 역할
		// eat() -----재정의(override)----->eat()
		//Animal a = new Animal(); X
		//a.eat();
		//upcasting(부모의 역할로 사용-> 명령을 내리는 쪽)
		ani.eat(); // eat{?} ==> eat{개처럼 먹다} 	동적바인딩, 다형성 보장!
		ani.move();
		
		ani  =  new Cat(); 
		ani.eat(); // eat{?} ==> eat{개처럼 먹다} 
		ani.move();
		
		((Cat)ani).night(); //downcasting
	}

}
