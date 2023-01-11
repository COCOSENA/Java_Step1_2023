package chapter03.While;

import java.util.Scanner;

public class WhileTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Java 교과목 점수를 입력하세요 :");
			
			int scr = scan.nextInt();
			
			
			//점수가 0미만 또는 100초과이면 while문 중지
			if (0> scr || scr >100) {
				break;
			}
			else if (scr >= 60) {
				System.out.println("합격하셨습니다.");
			}
			else {
				System.out.println("불합격하겠습니다.");
			}
		}	
		}

	}
