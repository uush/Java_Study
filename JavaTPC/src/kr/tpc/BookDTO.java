package kr.tpc;

public class BookDTO {
	public String title;
	public int price;
	public String company;
	public int page;
	//default generator method(생략되어 있음)
	public BookDTO() {
		//super();//	객체 생성 작업을 한다.(기계어 코드)
		
	}
	public BookDTO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
	
}
