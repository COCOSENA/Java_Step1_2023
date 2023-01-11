package chapter03;


import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfExample12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//server
		String ID = "chanhee";
		int Pass = 13131;
		
		//실행
		/*JOptionPane.showMessageDialog(null, "ID를 입력해주세요.");
		System.out.println("ID:");
		String MI1 = scan.nextLine();
		*/
		//중첩질의 
		/*
		if (MI1.equals(ID)) {
			JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요.");
			System.out.println("비밀번호:");
			//String Pass1 = scan.nextLine()
			//int Pass1 = Integer.parseInt(Pass1)
			int Pass1 = Integer.parseInt(scan.nextLine());
			
			if (Pass1 == Pass) {
				JOptionPane.showMessageDialog(null, "로그인 성공");
			}
			else	{
				JOptionPane.showMessageDialog(null, "비밀번호 틀림");
			}
			
		}
		else {
			JOptionPane.showMessageDialog(null, "아이디 틀림");
		}*/
		
		
		//논리연산자
		JOptionPane.showMessageDialog(null, "ID와 비밀번호를 입력해주세요.");
		System.out.println("ID:");
		String MI1 = scan.nextLine();
		System.out.println("비밀번호:");
		int Pass1 = Integer.parseInt(scan.nextLine());
		
		if (MI1=="chanhee" && Pass1==13131)
			JOptionPane.showMessageDialog(null, "로그인 성공");
		else
			JOptionPane.showMessageDialog(null, "다시 입력해주세요");
		
		
		
	}//main

}//class
