
public class TCP07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		float b=56.7f;
		//a+b=?
		float v = sum(a,b); // call by value(값)
		System.out.println(v);
		
		int[] arr= {1,2,3,4,5};
		int vv = arrSum(arr); // Call by Reference(번지)
		System.out.println(vv); 
	}
	public static float sum(int a, float b) {
			float v = a+b;
			return v;
		}
	
	public static int arrSum(int[] a) {
		int hap = 0;
		for(int i=0;i<a.length;i++) {
			hap+=a[i];
		}
		return hap;
	}

}
