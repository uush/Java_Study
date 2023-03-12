import kr.tpc.*;

public class TPC19 {

	public static void main(String[] args) {
		//Dog, Cat --> Animal
		//상속의 기본은 코드의 중복을 밖으로 빼는 것이다.
		Dog d = new Dog();
		d.eat();
		//자식이 부모가 가진 동작을 사용할 수 있다.
	
		Cat c = new Cat();
		c.eat();
		
		//Dog.java(x) Dog.class(o)
		//Dog dd = new Dog();
		//class파일만 있어도 객체를 생성하고, .을 찍으면 기능이 나온다.
		//소스파일(java)를 주면 기밀 사항이 넘어갈 수 있으니 class 파일을 준다.
		//자식 클래스와 자식 클래스를 구동시킬 수 있는 부모클래스 간 상속관계를 만들어서 배포해야 클래스를 받는 입장에서 완벽하게 동작시킬 수 있다.
		
		
		//Animal <-- [Dog.class, Cat.class]
		//Animal을 가지고 Dog, Cat을 동작시킬 수 있는 방법을 배우는 것이 중요
		
		
		
		/*
		Animal ani = new Dog();
		ani.eat();
		
		ani = new Cat();
		ani.eat();
		*/
		
		//override(재정의) : 상속받은 하위클래스가 상위 클래스의 동작을 수정하는 
		//메모리에 부모와 자식 메서드가 공존하지만 결국 자식 메서드가 실행된다.
		
		/*
		 * Dog Class의 모든 동작을 알고 있을 때
		 * Dog d = new Dog();
		 * d.eat();
		 *
		 * Dog Class의 동작 방식을 다 알지 못할 때
		 * 효과적이고 확장성이 더 좋음.
		 * Upcasting
		 * Animal d = new Dog();
		 * d.eat();
		 */
		
		
		/*
		 * 부모클래스에 있던 메소드가 재정의 되어 있으면 자식클래스의 같은 이름의 메소드를 실행한다.
		 * 실행할 때 재정의 되어 있는지 확인하여 호출될 메서드를 결정 - 동적 바인딩
		 * 하위클래스의 동작방식을 몰라도 부모클래스를 가지고 자식 클래스 구동시킬 수 있다는 장점
		 *  
		 * 정적바인딩(오버로딩) - 컴파일 시점에서 사용될 메서드 결정
		 */
		
		
	}

}
