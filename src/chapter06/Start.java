package chapter06;

import java.util.Random;

public class Start {
	
	private int random=new Random().nextInt(50)+1; //1~50
	private int count=0;
	private String result="FAIL";
	
	public String check(int mynumber) { 
		//체크라는 메소드, 마이넘버라는 매개변수를 직접 반복문 넣어 실행 
		
		count++; //몇번만에 맞췄는지를 위해서
		
		//random 값보다 작으면 up 크면 down 일치하면 -> result = "SUCCESS"
		
		if(mynumber < random) {
			System.out.println("UP!");	
		}else if(mynumber > random) {
			System.out.println("DOWN!");
		}else {
			System.out.println(count + "회 만에 정답!");
			result="SUCCESS";
		}
		
		return result;
	}
	
}
