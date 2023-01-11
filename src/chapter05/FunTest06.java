package chapter05;
//생략가능
public class FunTest06 { //클래스이름 
	

	public String channel;
	public int channelInt;
	public int volume;
	
	public FunTest06() { //생성자
		
	}
	
	public void channelUp(int volume) {
		System.out.println("소리를 " + volume + "만큼 올립니다.");
	}
	
	
    public void channelDown(int volume) {
		System.out.println("소리를 " + volume + "만큼 내립니다.");		
	}

    //오버로딩 똑같은 이름인데 다양한 메소드 구현하기 위해서 (다형성 만족)
	public void channelChange(String channel) {
		System.out.println("tv채널을 " + channel + "로 바꿉니다.");
		
	}
	//오버로딩(다형성 만족)
	public void channelChange(int channelInt) {
		System.out.println("채널을 " + channelInt + "로 바꿉니다.");
		
	}

	//매개변수만 달리함(메소드이 통일성)
	
//===========================================================================================	
	public static void main(String[] args) {
		
		FunTest06 func = new FunTest06(); // func: 객체(인스턴스)이름, 클래스이름
		func.channelUp(10);
		func.channelDown(5);
		func.channelChange("sbs");
		func.channelChange(3);
		
		
		
		
	} //main 

}
