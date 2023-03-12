
public class TPC05 {

	public static void main(String[] args) {
		// 
		int[] a = new int[3];
		int sum=0;
		int add = 10;
		
		for(int i=0;i<a.length;i++) {
			//	실수함! sum을 전역으로 둬야 출력할 수 있는데 지역변수로 두니까 외부에서 출력이 안됨!
			// add 선언을 for문 안에 넣을 경우, add가 자꾸 10으로 고정되니까 밖에서 선언. 고정된 값을 할당하는 명령은 밖에 두자!
			a[i]=add;
			sum+=a[i];
			add+=10;
		}
		System.out.println(sum);
		
		//9개의 정수형 변수를 만들어라. ->2차원 구조
		int[][] b = new int[3][3];
		for(int i=0; i<b.length;i++)
			for(int j=0; j<b[i].length;j++)
				b[i][j]=j+1;
		
		for(int i=0; i<b.length;i++) {
			for(int j=0; j<b[i].length;j++)
				System.out.print(b[i][j]+"\t");
			System.out.println();
		}
		System.out.println();
		
		int[][] star=new int[5][];
		star[0]=new int[1];
		star[1]=new int[2];
		star[2]=new int[3];
		star[3]=new int[4];
		star[4]=new int[5];
		
		for(int i=0;i<star.length;i++) {
			for(int j=0;j<star[i].length;j++) {
				star[i][j]='*';
				System.out.print((char)star[i][j]);
			}
			System.out.println();
		}
	}
}
