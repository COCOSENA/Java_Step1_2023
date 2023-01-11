package chapter03;

import javax.swing.JOptionPane;

public class ifExample10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//서버에 저장된 상태
		String ID = "soldesk"; //인스턴스 변수 (내장변수 - Java안에 저장되어 있는 변수)
		int PW=221227; //정수형 변수 
		
		//고객 // 숫자 문자 동시에 쓰는 경우에는 String으로 표기한다
		String id=JOptionPane.showInputDialog("아이디");
		int pass =Integer.parseInt(JOptionPane.showInputDialog("아이디"));
		
		//id를 입력한 것이랑 같은가??
		if(ID.equals(id)) {
			//비밀번호 확인
			if(PW==pass) {
				System.out.println(ID +"님 환영합니다");
			}
			else {
				System.out.println("비밀번호가 틀렸습니다");
			}
		}
		else {
			System.out.println("아이디가 일치하지 않습니다");
		}			
		}	
	}//main
//class
