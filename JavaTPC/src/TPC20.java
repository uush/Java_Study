import kr.tpc.*;

public class TPC20 {

	public static void main(String[] args) {
		
		//하위클래스의 타입이 상위클래스의 타입으로 들어가는 것은 자동으로 된다.
		//=프로모션, 자동형변환, Object casting - Upcassting
		//Animal d = new Dog();
		
		Dog d = new Dog();
		d.eat(); // ? -> 개처럼 먹다.
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		//Dog나 Cat을 직접 설계한 사람이 사용할 경우에는 그 안에 어떤 동작이 있는지 알기 때문에 메서드를 사용할 수 있지만
		//다른 사람이 만들어서 준 경우에는 Dog.class밖에 없을 경우, 안에 어떤 동작이 있는지 모른다.
		//그렇기 때문에 Animal로 Dog를 구동시키는 방법을 사용해야 한다. (마치 리모컨처럼)
		Animal ani = new Dog(); //Upcasting(자동형변환)	
		ani.eat(); //
		
		ani = new Cat();
		ani.eat();
		//ani.night();
		((Cat)ani).night(); //Downcasting(걍제형변환)	
	}

}
