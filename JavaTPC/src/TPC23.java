import kr.tpc.*;
public class TPC23 {

	public static void main(String[] args) {
		// 1. 다형성인수
		Dog d = new Dog();
		display(d);
		
		Cat c = new Cat();
		display(c);
	}
	
	private static void display(Animal r) { // 다형성인수
		r.eat();
		//r.night();
		if(r instanceof Cat) { //Cat타입으로 만들어진 r이면 True
			((Cat)r).night(); //Downcasting
		}
		
	}


}
