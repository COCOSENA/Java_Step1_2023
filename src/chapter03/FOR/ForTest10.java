package chapter03.FOR;

import java.util.Scanner;

public class ForTest10 {

	public static void main(String[] args) {
		// 

		Scanner scan = new Scanner(System.in);

		int i, sum = 0;
		System.out.println("정수를 입력하세요");

		int num = scan.nextInt(); //

		for (i = 1;; i++) //for에는 ;가 없다!!! + 조건을 공백으로 놔두고 if 문을 사용하여 제어가능
			
		{
			if (sum > num) {
				break;
			}
				sum += i;		
		}
		System.out.println((i-1) + "번째 숫자의 합은" + sum +"입니다.");		
	}

}
