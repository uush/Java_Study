package kr.poly;

public class Dog extends Animal{ //eat() {?}
	// 이름, 나이, 종 : 상태정보 
	// Dog와 cat은 수평적 구조로 작성된 클래스이다.
	
	//재정의(override)
	
	public Dog() {
		//부모에 있는 Animal에 생성자를 호출.
		super(); //new Animal();
	}

@Override
public void eat() {
	System.out.println("개 처럼 먹다.");
	
}

}
