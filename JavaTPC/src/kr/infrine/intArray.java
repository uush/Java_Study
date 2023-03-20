package kr.infrine;

public class intArray {
	private int count;
	private int[] arr;
	public intArray() { //default 생성자
		this(10);
	}
	public intArray(int init) {
			arr = new int[init];
	}
	public void add(int data) {
		arr[count++] = data;
	}
	public int get(int index) {
		return arr[index];
	}
	public int size() {
		return count;
	}
}
