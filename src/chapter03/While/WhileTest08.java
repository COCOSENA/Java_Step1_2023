package chapter03.While;

import javax.swing.JOptionPane;

public class WhileTest08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		
		do {
			
			num1 = Integer.parseInt(JOptionPane.showInputDialog("OTP DB"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("OTP DB"));
			
			if (num1 == num2) {
				System.out.println("인증성공");
				break;
			}
			System.out.println("다시 입력하세요");
		}
		while (num1 != num2); //do의 조건이 충족되지 않는경우 계속 돈다
		
		
	}

}
