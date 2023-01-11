package chapter03;

import javax.swing.JOptionPane;

public class ifExample03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade;
		int jumsu;

		jumsu = Integer.parseInt(JOptionPane.showInputDialog("Java 점수"));
		/*
		 * ..잠굼표시 
		 * if(jumsu >=90) System.out.println('A'); //수행문 .. 한줄만 읽는다 (그럼으로 block로 묶는다) 
		 * else if(jumsu >= 80) 
		 * 	System.out.println('B'); 
		 * else if(jumsu >=70)
		 * 	System.out.println('C'); 
		 * else if(jumsu >=60) 
		 * 	System.out.println('D'); 
		 * else
		 * 	System.out.println('F');
		 * 
		 * System.out.println("좀 더 노력하세여");
		 */

		// 방법2

		if (jumsu >= 90) {
			grade = 'A'; // 수행문
			System.out.println("최우수"); // 두개가 같이 나온다
		} else if (jumsu >= 80) {
			grade = 'B';
		} else if (jumsu >= 70) {
			grade = 'C';
		} else if (jumsu >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("당신의 학점은:" + grade + "입니다");

	}//main

}//class
