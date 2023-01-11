package chapter04.example01;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while (run) {
			// 변수값 설정
			int b =0 , i, a, sum = 0, max = 0, total = 0;
			int[] score1 = null;  //공백을 입력해주야 한다  (하나의 레이어에서 값을 받는 경우에는 아래의 나머지에서도 같을 받기 위해서)
			

			System.out.println("-------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------");
			a = scan.nextInt();
			switch (a) {
			case 1:
				System.out.println("학생수를 입력해 주세요");
				b = scan.nextInt();
				System.out.println("학생수는 " + b + "입니다.");
				score1 = new int[b]; // 자리를 학생의 숫자만큼 만들어 주려고 하는데 액박
				

			case 2: // 아래 시행문을 그냥 넘어간다
				for (i = 0; i < score1.length; i++) {
					System.out.print((i+1) + ":점수를 입력해 주세요");
					score1[i] = scan.nextInt(); // 점수를 입력 받는다
					total += score1[i]; // 총점을 누적시킨다

				}
				System.out.println("감사합니다");

			case 3:
				for (i = 0; i < score1.length; i++)
					System.out.println("score[" + score1[i] + "]");

			case 4:
				System.out.println("선택>" + a);
				for (i = 0; i < score1.length; i++) {
					if (max < score1[i]) {
						max = score1[i];
					}
					System.out.println("최고점수:" + max);
					System.out.println("총점" + total);
					double avg = sum / (double) b;
					System.out.println(avg);
				}

			case 5:
				System.out.println("현재 페이지를 나갑니다."); // 초기페이지로 돌아감

			}

			// 초기 패이지 설정
			System.out.println("1.초기메뉴 2.종료");// 2번 누루면 종료
			// 1번 누루면 다시 시작
			int num2 = scan.nextInt();

			if (num2 == 2) {
				run = false; // 진짜 탈출
			} else if (num2 == 1) {
				continue;

			} else {
				System.out.println("잘못된 서비스를 선택하셨습니다");
				System.out.println("다시 입력해 주세요");
			}
		}
	} // main

}// class
