package chapter05;

public class FunTest07 {

	public String channel;
	public int channelInt;
	public int volume;
	
	//생성자 생략
	
	//void 외에 모든 타입의 메소드는 반드시 꼭 return값을 갖는다.
	
	public int channelUp(int volume) {
		this.volume=volume;
		System.out.println("소리를 높이겠습니다.");
		return volume+2;
		
	}
	
	public void channelDown(int volume) {
		this.volume=volume;
		System.out.println("소리를" +volume + "만큼 내립니다");
		//return volume+2; // void는 절대 리턴값이 존재할 수 없다. 

		
	}
	
	
	
//=======================================================
	
	public static void main(String[] args) {
		
		FunTest07 func=new FunTest07();
		
		//방법1
		//System.out.println("소리를" + func.channelUp(10)+"만큼 올립니다.");
		
		
		//방법2
		int volume=func.channelUp(10); //12
		System.out.println("소리를" + func.channelUp(10)+"만큼 올립니다.");
		func.channelDown(5);
		
				

	}

}
