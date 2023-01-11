package chapter03;

import java.util.Scanner; // scanner 라는 외부 클래스가 있는데 이것을 불러온 것이다

public class IfExample07 {

	public static void main(String[] args) {
		//입력 Scanner(java.유틸에서 추출) 클래스 초기화 -> 인스턴스 변수방 선언
		//scanner라는 타입에 scan이라는 공간을 할당함 //아래 출력창에 갑을 표기해 준다
		Scanner scan = new Scanner(System.in);   //Scanner의 내부의 Method 중에서 System.in의 기능을 사용한다 
		System.out.println("1.첫번째 수:");
		double num1 =Double.parseDouble(scan.nextLine()); //외부에서 가져온 글래스는 같은 클래스로 변환 시켜주어야 함scan.nextLine() 
		//==> String 이지만 같은 등급의 Double.parseDouble로만 변경 가능 (
		System.out.println("첫번째 입력받은 수 출력: " +num1);
		
		
		System.out.println("2번째 수");
		double num2 = Double.parseDouble(scan.nextLine());
		//변수를 assign해줌과 동시에 실행도 해준다
		System.out.println("두번쨰:" +num2);
		System.out.println();
		if (num2 != 0.0) {
			System.out.println("나눈 값" + num1/num2);
		}
		else {
			System.out.println("0으로 나눌수 없습니다.");
		}
		
		
		
	}

}
