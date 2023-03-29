package Step2;
import java.util.Scanner;
public class pro2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		if(minute>=45) {
			minute = minute-45;
			System.out.printf("%d %d", hour, minute);
		}
		else{
			if( hour == 0) {
				hour = 24;
			}
			hour = hour - 1;
			minute = 60 + minute - 45;
			System.out.printf("%d %d", hour, minute);
		}
		
	}

}
