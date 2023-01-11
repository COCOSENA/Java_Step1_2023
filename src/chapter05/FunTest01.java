package chapter05;

import javax.swing.JOptionPane;

public class FunTest01 {

	//합계 메소드(함수)
	//접근한정자 : public (공용:패키지 제한없음) / protected(패키지내에서 공용으로 사용.상속에서 사용)  / private(클래스내에서만 사용)
	//void : 리턴 없음
	public static void sum(int num1, int num2) { //매개변수를 줄수도 있고 안 줄수도 있다 
		//int num1;
		//int num2;
		int total=num1+num2;
				System.out.println(total);
	
	}//메소드 수행문
	
	//main 실행을 담당하는 메소드
	public static void main(String[] args) { //main : 실행시키는 메소드
		int a, b;
		a=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		sum(a,b);
		
			

	}//MAIN
	//메인을 기준으로 하여 메인선언 전 또는 후에 정의해도 됨

//	public static void sum(int num1, int num2) { //매개변수를 줄수도 있고 안 줄수도 있다 
//		//int num1;
//		//int num2;
//		int total=num1+num2;
//				System.out.println(total);
//	
//	}//메소드 수행문
	
	
}//CLASS
