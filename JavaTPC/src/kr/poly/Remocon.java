package kr.poly;

public interface Remocon {	// 객체 생성 X, Remocon r = new Remocon();
	// final static(상수) 사용 가능. 
	// final은 종단변수. 값을 수정할 수 없다. 
	// 객체 생성하지 않고 접근. 
	public static final int MAXCH = 100;	// Remocon.MAXCH
 	public final static int MINCH = 1;		// Remocon.MINCH 클래스 이름으로 접

	// 추상 메서드
	public void chUp(); //abstract 생략
	public void chDown();
	public void internet();
	
	
}
