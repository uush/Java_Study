import kr.tpc.MemberVO;

public class TPC14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberVO  m = new MemberVO();
		
		m.setName("홍길동");
		m.setAge(50);
		m.setTel("010-1111-1111");
		m.setAddr("seoul");
		
		System.out.print(m.getName()+"\t");
		System.out.print(m.getAge()+"\t");
		System.out.print(m.getTel()+"\t");
		System.out.println(m.getAddr()+"\t");
		
		
		/*
		m.name = "홍길";
		m.age = 10000;
		m.tel = "010-1111-1111";
		m.addr="seoul";
		
		System.out.print(m.name+"\t");
		System.out.print(m.age+"\t");
		System.out.print(m.tel+"\t");
		System.out.println(m.addr+"\t");
		*/
	}

}
