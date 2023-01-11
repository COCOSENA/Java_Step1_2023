package chapter03.FOR;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 정수를 입력받아 입력받은 정수부터 100까지의 합을 출력하세요.
		int i;
		int total = 0;
		System.out.println("정수를 입력하시오");
		for(i = Integer.parseInt(scan.nextLine()); i <=100; i++) {
			total += i;
	}
		System.out.println(total);
		

		
		
		
		
		//1서부터 10까지 반복하면서 정수를 입력받아 그 수중에 짝수의 갯수가 몇개인지 출력
		//단, 입력받은 수가 0이면 무시
		int a,b , total2=0;
		
		System.out.println("0~10까지의 정수를 입력하시오(총 10회 입력)");
		for (a = 9; a>=0 ; a--) {
			b = scan.nextInt();
			System.out.println(a +"번 남았습니다.");
			if (a==0)
				System.out.println("감사합니다.");
				
			else if (b==0)
				continue;
				if (b%2 == 0)
					total2++; // cnt=cnt+1

			else 
				continue;
		}
		System.out.println("짝수는 총" + total2 +"개 입니다");
		
	}

}
