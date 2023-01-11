package chapter03.While;

import java.util.Scanner;

public class WhileTest07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
String menu = ""; //null은 값이 없습니다.
int num;

	do {
		System.out.println("1.입력하기");
		System.out.println("2.출력하기");
		System.out.println("3.삭제하기");
		System.out.println("4.끝내기");
		System.out.print("작업할 번호를 선택하세요.: ");
		num = scn.nextInt();
		
		if (num < 1 || num > 3) { //옵션에 없는 번호인 경우
			if (num == 4) {
				break;
			}
			menu = "잘못 입력하셨습니다";
		} else {

			if (num == 1) {

				menu = "입력하기를 ";
			} else if (num == 2) {

				menu = "출력하기를 ";
			} else if (num == 3) {

				menu = "삭제하기를 ";
			}
		}
		System.out.println(menu + "선택하셨습니다.");

		}while (num != 4); {//4가 아닌경우 계속 반복 // ;가 붙는다
	System.out.println("\n 끝내기를 선택하셨습니다");
		}
			
	}

}
