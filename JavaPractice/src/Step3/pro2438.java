package Step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pro2438 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		for(int i=1; i<=T; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
