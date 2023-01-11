package chapter03;

import javax.swing.JOptionPane;

public class ifExample05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age, charge;
		String kk;
		age = Integer.parseInt(JOptionPane.showInputDialog("나이 입력"));

		if (0<age && age<8) {  //관계연산 -> 논리연산
			kk = "미취학 아동입니다";
			charge = 1000;
		} else if (8 <= age && age <14) {
			kk = "초등학생입니다";
			charge = 2000;
		} else if (14 <= age && age <20) {
			kk = "중고딩입니다";
			charge = 3500;
		} else {
			kk = "성인입니다.";
			charge = 5000;
		}

		System.out.println("가격은" + charge + "원 입니다.");
		System.out.println(kk);
	}

}
