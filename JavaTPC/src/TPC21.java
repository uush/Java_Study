import kr.tpc.*;
public class TPC21 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		//Dog.class, Cat.class밖에 없을 때
		//상속관계일 때
		Animal ani = new Dog(); //upcasting
		ani.eat(); //부모 eat이지만 재정의 되어 있으면 재정의된 메소드 호출
		
		//eat가 메소드는 하나인데 다른 동작 - 다형성 원리
		//다형성 : 상위 클래스가 하위 클래스에 동일한 메세지를 보내면 하위 클래스가 서로 다르게 동작되는 원리
		Animal ani2 = new Cat();
		ani2.eat();
		//ani2.night(); 부모에게 없는 메소드
		Cat cc = (Cat)ani2;
		cc.night();
		((Cat)ani2).night(); //downcasting
		
	}

}
