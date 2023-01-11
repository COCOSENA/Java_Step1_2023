package chapter06;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {
		
		int select;
		String check;
		
		//클래스 객체생성
		Start fuc=new Start();
		
		while(true) {
			System.out.println("숫자를 입력하세요");
			Scanner scan=new Scanner(System.in);
			select = scan.nextInt();
			check=fuc.check(select); //체크라는 메소드만 읽어주면 됨 
			if(check.equals("SUCCESS"))
				break;
	
		}//while
		
	}//main

}
