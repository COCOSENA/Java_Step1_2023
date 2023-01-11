package chapter05;

import java.util.Scanner;

public class Method {

	// 멤버변수(=필드)

	// 생성자 생략

	// 메소드

	void makeBread() {
		System.out.println("빵을 만듭니다.");
	}// method1
	
	void makeBread(int count) {
	}
	
	void makeBread(int count, String name) {
		// 1번째 빵을 만들었습니다.
		// 2번째 빵을 만들었습니다.

		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "번째" + name + "빵을 만들었습니다");

		}
		System.out.println("요청하신" + count + "개의  빵이 모두 완료 되었습니다.");
	}// method1

	void order() {
//void 반환만 하고 실행x 
		int breadnum;

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("1. 빵 갯수 선택 | 2. 빵의 갯수와 종류 | 3. 종료 :");
			System.out.print("선택>");
			int choice = scan.nextInt();

			if (choice == 1) {
				System.out.print("주문할 빵의 갯수 : ");
				breadnum = scan.nextInt();
				for (int i = 0; i < breadnum; i++) {

					System.out.println((i + 1) + "번째 빵을 만들었습니다");

				}
				System.out.println("요청하신" + breadnum + "개의 빵이 모두 완료 되었습니다.");

			} else if (choice == 2) {
				System.out.print("주문할 빵의 갯수 : ");
				breadnum = scan.nextInt();
				System.out.print("주문할 빵의 종류 : ");
				String name = scan.next();
				for (int i = 0; i < breadnum; i++) {
					System.out.println((i + 1) + "번째" + name + "빵을 만들었습니다");
				}
				System.out.println("요청하신" + breadnum + "개의" +name+"빵이 모두 완료 되었습니다.");
			} else {
				System.out.println("프로그램 종료");
				break;
			}

		}

	}

}
