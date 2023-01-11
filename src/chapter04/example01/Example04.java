package chapter04.example01;

import java.util.Random;

import javax.swing.JOptionPane;

public class Example04 {

	public static void main(String[] args) {
		// 로또번호 출력해주기
		// 로또번호 6개응 담을 배열
		int number;
		int cnt = 0;
		int[] lotto = new int[6];
		Random rand = new Random();

		System.out.println("===이번주 로또 예상번호 ===");
		number = Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매횟수를 입력하세여"));

		while (number > cnt) {
			System.out.print("[" + (cnt + 1) + "]");
			/*
			 * for (int i = 0; i < 6 ; i++) { lotto [i] = (int) (Math.random()*45) + 1;
			 * System.out.print(lotto[i] + " "); } cnt++; System.out.println(); }
			 */
			outer: for (int i = 0; i < lotto.length;i++) { // 증감식을 공백으로 놔둬서
				lotto[i] = rand.nextInt(45) + 1;
				// 중복값을 비교하는 반복문
				in: for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
						continue outer; // outer로 돌아가서 실행한다 //아래까지 읽지 않고 다시 위로 넘어간다 
					}
				} // in for
				System.out.print(lotto[i] + " ");
				
			} // out for
			System.out.println();
			cnt++;
		} // while
	}
}
