package chapter03.FOR;

import java.util.Scanner;

public class ForTest07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("숫자를 입력하세요:");
		Scanner scan = new Scanner(System.in); //ctrl + shift + o = import 하기
				
		int i;
		int a = scan.nextInt();
		
		//if문의 조건에 0보다 크면서 11보다 작은수 (논리함수)
		if(a>0 && a<11) {//1에서 10까지의 숫자를 만들어 준다
			for (i = 1 ; i <=a; i++) {
				System.out.println("Java 프로그래밍");
			}//for문
		}
		else {
			System.out.println("입력값이 잘못되었습니다");
		}
		
	System.out.println("프로그램이 종료되었습니다. ");
			
		
			
	} //main

} //class
