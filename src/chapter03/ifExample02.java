package chapter03;

import javax.swing.JOptionPane;

//위에 생긴다 // 처럼 이미 작동되고 있는건 아니지만, "import"를 통해 불러올수 있음


public class ifExample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String 문자열"" (클래스 = 문자열에 필요한 모든 Method가 포함됨)
		//String ->  : Integer.parseInt --> JDK에 내장된 가장 최상의 class는 랭
		
		int dat;
		
		dat =Integer.parseInt(JOptionPane.showInputDialog("값을 입력하세요")); //GOI (graphic user interface) 아래의 "Console"로 출력 하는게 아니라 다른 
		//JOptionPane.showInputDialog 클래스 단위로 변경 // Integer.parseInt(클래스) -> 문자열을 로 변경 // 클래스는 클래스로 대응
		
		
		if(dat%10==0) //if는 ; 쓰지 않음
			System.out.println(dat+ "(은)는 10의 배수 입니다.");
		else
			System.out.println(dat + "(은)는 10의 배수가 아닙니다.");
		
	}

}
