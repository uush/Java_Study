package kr.tpc;

public class Dog extends Animal{ //eat() {?}
	// 이름, 나이, 종 : 상태정보 
	// Dog와 cat은 수평적 구조로 작성된 클래스이다.
	
	//재정의(override)
	public void eat() {
		System.out.println("개처럼 먹다.");
	}

}
