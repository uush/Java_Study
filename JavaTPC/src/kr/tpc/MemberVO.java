package kr.tpc;

public class MemberVO {
	private String name;
	private int age;
	private String tel;
	private String addr;
	public MemberVO() {
		
	}
	
	public MemberVO(String name, int age, String tel, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}


	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setName(String name) {
		this.name = name;
	}
}
