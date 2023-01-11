package chapter03.FOR;

import java.util.Scanner;

public class ForTest17 {

	public static void main(String[] args) {
		// 3중 for 문을 만들어 보자! // 별이 중간에 오도록 해보자
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시요");
		int Star= scan.nextInt();
		
		for (int i=1 ; i <= Star ; i++) {
			for (int j=Star-1; j>=i; j--) {//공백을 카운트 //Star = 4 (out for문을 4번 반복 => in for문을 4번 반복), 
				// i=1 으로 받았을때 j=3번 반복
				System.out.print(" ");
			}
			for (int a=1; a<=i; a++) { //별자리
			System.out.print("★");
			}// in for 문
		System.out.println();
		}//out for문  //for 문은 아래쪽 까지 포함해주어야 같이 읽어준다 
		
	}

}
