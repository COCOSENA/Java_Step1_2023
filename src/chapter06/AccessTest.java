package chapter06;

public class AccessTest {
	
	//필드
	private int aa;
	public int bb;
	int cc;
	
	//디폴드 생성자(구현x void나 int 넣지 말것. )
	
	//메소드
	public void setAa(int aa) {
		this.aa = aa;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public void Disp() { //Display
		System.out.println("aa값 : " +aa+"\nbb값 : " + bb+"\ncc값 : "+ cc);
	}

	public static void main(String[] args) {
		// 객체(obj)
		
		AccessTest obj=new AccessTest();
		obj.setAa(5);
		obj.setBb(3);
		obj.setCc(2);
		obj.Disp(); //이걸 해줘야 출력이 됨 
		
		
		
		

	}//main

}//class
