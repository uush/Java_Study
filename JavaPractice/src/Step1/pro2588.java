package Step1;

import java.util.Scanner;
public class pro2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int B100 = B/100;		//100의 자리수
		int B10 = (B-B100*100)/10; 	//10의 자리수
		int B0 = B-((B100*100)+(B10*10));	//1의 자리수
		System.out.println(A*B0);
		System.out.println(A*B10);
		System.out.println(A*B100);
		System.out.println(A*B);
	}

}
