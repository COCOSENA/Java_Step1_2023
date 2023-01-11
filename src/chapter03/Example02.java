package chapter03;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// gender가 면 남성입니다. or 여성

		Scanner scan = new Scanner(System.in);
		char gen;
		System.out.println("성별은 무엇십니까(F/M)?");
		gen = scan.nextLine().charAt(0); // 0을 붙이는 이유는 첫번쨰 줄이여서
		
		
		if (gen == 'M')
		System.out.println("남자입니다.");
		else
			System.out.println("여자입니다.");
			
		System.out.println("-----------------------------------");
		System.out.println();
		
		char ch;
		String food;
		System.out.println("주문하시겠습니까? (Y,N)");
		ch = scan.nextLine().charAt(0);
		
		if (ch =='Y' || ch == 'y') {
			System.out.println();
			System.out.println("무엇을 주문하겠습니꽈?");
			food = scan.nextLine();
			System.out.println(food +"를 주문하겠습니다.");
		}
		else {
			System.out.println("이용해 주셔서 감사합니다");
	
		}
	}

}
