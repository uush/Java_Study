package Step3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class pro25314 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		
		int cnt = (int)N/4;
		while(cnt>0) {
			System.out.print("long ");
			cnt --;
		}
		System.out.println("int");
	}

}
