package kr.poly;
//부모의 역할은 할 수 있다. 자식에게 명령을 내려서 자식을 구동시킬 수 있는 다형성을 보장시키는 용도로 추상클래스를 사용할 수 있다.
public abstract class Animal extends Object{ //추상 클래스(불완전한 객체)->Animal ani = new Animal();이 X
	// Dog, Cat --> eat()
	public abstract void eat(); // 추상 메서드(불완전한 메서드)
	public void move() {
		//기능이 서로 비슷한 클래스를 묶어 주는 추상 클래스는 구현 메서드를 넣을 수 있다.
		System.out.println("무리를 지어서 이동한다.");
	}
}
