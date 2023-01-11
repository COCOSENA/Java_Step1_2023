package chapter04;

import javax.swing.JOptionPane; //메모리 할당을 잡고 있음 (따로 new로 배정 X)

public class ArrayTest02 {

	public static void main(String[] args) {
		
		
		String student[] = new String[7];
		String phone[] = new String[7];
		
		for(int i = 0 ; i<student.length; i++) {
			student[i] = JOptionPane.showInputDialog("이름");
			student[i] = JOptionPane.showInputDialog("전화번호"); //010-6301-7704
			
			System.out.println("이름 : " +student [i] + "전화번호" + phone[i]);
			
		}//for
		
	}//main

}//class
