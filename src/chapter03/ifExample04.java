package chapter03;

import javax.swing.JOptionPane;

public class ifExample04 {

	public static void main(String[] args) {
		//전시관의 입장료는 미취학 아동은 1000원
		//전시관의 입장료는 초등학생은 2000원
		//전시관의 입장료는 중.고등학생 3500원
		//전시관의 입장료는 성인 5000원
		
		int age;
		int charge;
		String kk;

		age = Integer.parseInt(JOptionPane.showInputDialog("나이 입력"));

		if (age <= 12) {
			kk = "미취학 아동입니다";
			charge = 1000;
		} else if (age <= 13) {
			kk = "초등학생입니다";
			charge = 2000;
		} else if (age <= 19) {
			kk = "중고딩입니다";
			charge = 3500;
		} else {
			kk = "성인입니다.";
			charge = 5000;
		}

		System.out.println("가격은" + charge + "원 입니다.");
		System.out.println(kk);
		
		//swing(나이를 입력하세요) 사용하여 입력받기
	}//main

}//class
