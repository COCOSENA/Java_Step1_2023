package chapter07;

import java.nio.file.spi.FileSystemProvider;

public class CarMain {

	public static void main(String[] args) {
	
		//객체를 생성하면서 초기화
		Car mycar=new Car("검정",3000);
		
		
		//멤버변수에 직접 접근해서 출력
		System.out.println("-------------------------");
		
		System.out.println("color :" + mycar.color);
		System.out.println("color :" + mycar.cc);
	
		
		//메소드를 이용한 출력 
		System.out.println("color :" + mycar.getColor());
		System.out.println("color :" + mycar.getCc());
		

	}

}
