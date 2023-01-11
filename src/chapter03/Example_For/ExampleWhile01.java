package chapter03.Example_For;

import java.util.Scanner;

public class ExampleWhile01 {

	public static void main(String[] args) {
		boolean run = true; //switch 역할을 해준다
		
		int m, balance =0;
		//if문 , switch 문
		Scanner scan = new Scanner(System.in);
		
		while (run) { //true 인 상태에서는 계속 진행 
		System.out.println("이용하실 서비스와 금액을 입력해 주세요");	
		System.out.println("-------------------------------");
		System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4.종료");
		System.out.println("-------------------------------");
		int a = scan.nextInt();
		if (a==4) {
			System.out.println("감사합니다.");
			run = false; //false 를 사용하여 탈출 (boolean이 Switch 역할을 함)
		}
		switch (a) {
		case 1:
			System.out.println("금액?");
			m = scan.nextInt(); // balance += scan.nextline();
			System.out.println("선택" +a);
			System.out.println("예금액" + m);
			balance += m;
			break;
		
		case 2:
			System.out.println("금액?");
			m = scan.nextInt();
			if (m > balance) { //잔액이 부족한 경우도 포함
				System.out.println("잔액이 부족합니다.");
				break;
			}
			else {
			System.out.println("선택" +a);
			System.out.println("출금액" + m);
			balance -= m;
			break;
			}
		
		case 3:
			System.out.println("선택" +a);
			System.out.println("잔고" + balance);
			break;
		case 4:
			continue;
		
		default:
			System.out.println("선택" +a);
			System.out.println("잘못입력하셨습니다");
			break;
		
		}
		
	}
	}
}
