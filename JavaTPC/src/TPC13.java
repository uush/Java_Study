import kr.tpc.BookDTO;

public class TPC13 {

	public static void main(String[] args) {
		// 책->class(BookDTO) ->객체 ->인스턴스
		String title = "Spring";
		int price = 25000;
		String company ="제이펍";
		int page = 890;
		//책이 되려면 연속적인 기억 공간에 정보가 담겨 있어야 하지만,
		//각자의 기억 공간에 저장된 정보들이므로 '책'이라고 볼 수는 없다.
			
		BookDTO dto; //dto(Object:객체)
		dto = new BookDTO(title, price, company, page); //dto(Instance: 인스턴스)	
		
		bookPrint(dto);
	}
	
	public static void bookPrint(BookDTO dto) {
		System.out.print(dto.title+"\t");
		System.out.print(dto.price+"\t");
		System.out.print(dto.company+"\t");
		System.out.print(dto.page+"\t");
	}
	

}
