package Step3;

import java.util.Scanner;

public class pro25304 {

	public static void main(String[] args) {
		//물건 종류, 가격, 개수, 총 금액

		int mnt = 0;
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();

		while(N>0) {
			int price = sc.nextInt();
			int many = sc.nextInt();
			
			mnt += price * many;
			N--;
		}
		if(mnt == X) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
