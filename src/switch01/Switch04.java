package switch01;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		//Scanner 클래스의 인스턴스 변수 scan에 값을 입력 받음
		//A,a -> 우수고객 / B,b -> 일반회원 / 나머지 -> 고객
		
		Scanner scan = new Scanner(System.in);
		System.out.println("등급을 입력하세여(A,B,C) : ");
		char grade;
		//charAt(0) : String -> char로 바꿔주는 명령어
		grade=scan.nextLine().charAt(0); //scanner로 들어온 값(String)을 char로 변경해줌
		String rsp = null;
		//String rsp = new String();
		//왜 String rsp = null로 지정해주어야 하는가?
		
		
		switch (grade) {
		case 'a': case 'A':
			rsp = "우수고객";
			break;
		
			
		case 'b': case 'B':
			rsp = "일반회원";
			break;
		
		case 'c': case 'C':
			rsp = "고객";
			break;
			
		
		default:
			System.out.println("다시 입력하세요");
		}
		
		System.out.println("당신은" + (String)rsp + "입니다.");
		
	}

}
