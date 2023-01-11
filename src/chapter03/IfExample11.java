package chapter03;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfExample11 {

	public static void main(String[] args) {
		// Scanner scan이라는 인스턴스 변수 선언
		Scanner scan = new Scanner(System.in);

		// 서버에 저장된 정보
		String ID = "chanhee";
		int Pass = 13131;

		// ID라는 변수로 아이디 받기 (안내문구 띄어주기)
		String MI = JOptionPane.showInputDialog("아이디가 무엇인가?");
		System.out.println("ID:" + MI);
		// String MI1 = scan.nextLine();
		if (MI.equals(ID)) {
			int Pass1 = Integer.parseInt(JOptionPane.showInputDialog("비밀번호가 무엇인가?"));
			if (Pass1 == Pass) {
				System.out.println("비밀번호:" + Pass1);
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호 다름");
			}
		} else {
			System.out.println("아이디 없음");
		}
	}

}
