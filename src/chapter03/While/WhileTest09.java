package chapter03.While;

import java.util.Scanner;

public class WhileTest09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
				
				int num;
		String menu = "";
		while (true) {
			System.out.println(" 1.입력하기 \n 2.출력하기 \n 3.삭제하기 \n 4.끝내기\n 작업할 번호를 선택해주세요");
			num=scan.nextInt();
			System.out.println();
			
			switch (num) {
			case 1:
				System.out.println("입력하기를 선택하셨습니다.");
				break;
			case 2:
				System.out.println("입력하기를 선택하셨습니다.");
				break;
			case 3:
				System.out.println("입력하기를 선택하셨습니다.");
				break;
			case 4:
				System.out.println("입력하기를 선택하셨습니다.");
				break;
			default:
				System.out.println("잘 못 입력하셔쓰니다");
				
			}//switch
		if (num ==4) //if문으로 제어를 걸어준다
			break;
		}// While 문의 끝

	}

}
