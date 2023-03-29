package Step2;
import java.util.Scanner;
public class pro2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int time = sc.nextInt();
		
		if(time <= 60) {
			if((min+time)<60) {
				min = min + time;
				System.out.printf("%d %d", hour, min);
			}
			else {
				min = (time + min) - 60;
				hour = hour + 1;
				if(hour>=24) {
					hour = hour-24;
				}
				System.out.printf("%d %d", hour, min);
			}
		}
		else {
			hour = hour + (int)(time / 60); 
			if((min + (time % 60))>=60){
				min = ((time%60) + min) - 60;
				hour = hour + 1;
				if(hour>=24) {
					hour = hour-24;
				}
				System.out.printf("%d %d", hour, min);
			}
			else {
				if(hour>=24) {
					hour = hour-24;
				}
				min = min + (time % 60);
				System.out.printf("%d %d", hour, min);
			}
			
		}
		
		

	}

}
