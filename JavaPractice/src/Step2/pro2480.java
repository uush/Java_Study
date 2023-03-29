import java.util.Scanner;
public class pro2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int money = 0;
		
		if((num1==num2)|(num1==num3)|(num2==num3)) {
			if((num1==num2)&(num1==num3)&(num2==num3)){
				money = 10000+(num1)*1000;
				System.out.println(money);
			}
			else {
				if(num1==num2) {
					money = 1000+num1*100;
				}
				else if(num1==num3) {
					money = 1000+num1*100;
				}
				else {
					money = 1000+num2*100;
				}
				System.out.println(money);
			}
		}
		else {
			money = (num1>num2)?num1:num2;
			money = (num3>money)?num3:money;
			money = money*100;
			System.out.println(money);
		}
	}

}
