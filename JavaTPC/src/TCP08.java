
public class TCP08 {

	public static void main(String[] args) {
		//static이 없으면 메모리에 로딩이 안돼
		int a=30;
		int b=50;
		int v = add(a,b);
		System.out.println(v); //static method call
	}
	public static int add(int a, int b) {
		int sum=a+b;
		return sum;
	}

}
