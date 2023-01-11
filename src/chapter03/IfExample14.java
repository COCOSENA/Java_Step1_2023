package chapter03;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class IfExample14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//과목수
		Scanner scan = new Scanner(System.in);
		int sum, soft1, soft2, DB, pro, imf;
		
		//입력
		JOptionPane.showMessageDialog(null, "소프트웨어 설계 점수입력");
		System.out.println("점수:");
		soft1 = Integer.parseInt(scan.nextLine());
		//int soft = scan.nextInt();로 "int"로 받을수 있음
		
		JOptionPane.showMessageDialog(null, "소프트웨어 개발 점수입력");
		System.out.println("점수:");
		soft2 = Integer.parseInt(scan.nextLine());
		
		JOptionPane.showMessageDialog(null, "데이터베이스 구축 점수입력");
		System.out.println("점수:");
		DB = Integer.parseInt(scan.nextLine());
		
		JOptionPane.showMessageDialog(null, "프로그램밍언어활용 점수입력");
		System.out.println("점수:");
		pro = Integer.parseInt(scan.nextLine());
		
		JOptionPane.showMessageDialog(null, "정보시스템 구축 점수입력");
		System.out.println("점수:");
		imf = Integer.parseInt(scan.nextLine());
		
		sum = soft1 + soft2 + DB + pro + imf;
		
		//실행
		if (soft1 >= 8 || soft2 >= 8 || DB >= 8 || pro >= 8 || imf >= 8 || sum <60) {
			if (sum <= 100) {
				JOptionPane.showMessageDialog(null, "합격입니다.");
			}
			else {
				JOptionPane.showMessageDialog(null, "오류 점수를 다시 입력해주세요");
			}
		}
		else {
			System.out.println("합격입니다.");
		}	
	}
}
