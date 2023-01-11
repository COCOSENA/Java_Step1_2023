package chapter07;

public class ConstructTest {

	private int aa;
	private int bb;
	
	//기본 생성자(클래스랑 이름 똑같이. 반환형 void 처럼 사용x)
	public ConstructTest() {} 
	
	//생성자 오버로딩
	public ConstructTest(int aa, int bb) {
		
		this.aa = aa;
		this.bb = bb;
	}


	public static void main(String[] args) {
		
		ConstructTest obj1=new ConstructTest(); 
		obj1.aa=10; //멤버변수가 private이여도 같은 클래스에 메인이 존재하면 사용가능 
		obj1.bb=20;
		System.out.println(obj1.aa);
		System.out.println(obj1.bb);
		System.out.println("--------------------");
		ConstructTest obj2=new ConstructTest(30,40);
		System.out.println(obj2.aa);
		System.out.println(obj2.bb);

		
		

	}//m

}//c
