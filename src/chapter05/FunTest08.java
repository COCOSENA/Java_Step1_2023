package chapter05;

import java.util.Scanner;

public class FunTest08 {

	public FunTest08() {
		
	
	}
	
	public static void eduStep(int edu) {
		if(0 < edu && edu <4) {
			System.out.printf("현재 스터디 단계는 step%d 입니다.\n", edu);
					return;
	
		}
		
		System.out.println("단계 없음");
		
	
		
	}//메소드
	
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("스터디 단계를 입력하세요:");
		int number=scan.nextInt(); 
		eduStep(number);
		
		// return 값이 있는 경우
		//String step=Edustep(number);
		//System.out.println("현재 수업 단계는 : "+ step + " 입니다.");
		
		//return 값이 없는경우 - 보이드로 하고 뿌려주기
		
		
		
		
	}

}
