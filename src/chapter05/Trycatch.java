package chapter05;

import javax.swing.JOptionPane;

public class Trycatch { //예외처리

	public static void main(String[] args) {
	
		int num1, num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
//		
//		int res=num1/num2;
//		System.out.println(res);
		
		
		try {
			System.out.println(num1/num2); //해당 작업 코드 입력 
		} catch (ArithmeticException e) { //수학적인(산술연산) 에러 
			System.out.println("숫자 0을 입력하시면 안 됩니다. ");//에러 발생시 수행되어야 할 코드
		}//try
		
		System.out.println("Error 후 컴파일 = > 프로그램 종료");

	}//m

}//c
