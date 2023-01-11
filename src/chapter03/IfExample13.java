package chapter03;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfExample13 {
	public static void main(String[] args) {

		//데이터베이스
		String ID="soldesk";
		int PW=221227;
		
		//Scanner scan(스켄뜨고)
		Scanner scan = new Scanner(System.in);
		
		
		//ID 받기 
		
		JOptionPane.showMessageDialog(null, "ID를 입력해주세요.");
		System.out.println("ID:");
		String inputID = scan.nextLine();
				
		//맞으면 비밀번호 받기
		if (ID.equals(inputID)){
			JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요.");
			System.out.println("비밀번호:");
			//String Pass1 = scan.nextLine()
			//int Pass1 = Integer.parseInt(Pass1)
			int Pass1 = Integer.parseInt(scan.nextLine());
				
			if (Pass1 == PW) {
				JOptionPane.showMessageDialog(null, "로그인 성공");
				}
			else	{
				JOptionPane.showMessageDialog(null, "비밀번호 틀림");
				}
		} //블럭은 확실하게 나눠야 함
		else {
			JOptionPane.showMessageDialog(null, "아이디 틀림");			
			}
		
		
	}// main
}// class
