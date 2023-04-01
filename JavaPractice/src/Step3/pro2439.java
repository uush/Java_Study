package Step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pro2439 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=cnt;i++) {
			System.out.println(" ".repeat(cnt-i)+"*".repeat(i));
		}
	}

}
