package chapter03.FOR;

import java.util.Scanner;

public class ForTest08 {

	public static void main(String[] args) {
		// 10개의 정수를 입력받아 3의 배수와 5의 배수를 각각 출력하시요
		
		Scanner scan = new Scanner(System.in);
		int a,b=9, cnt3=0, cnt5=0;
		System.out.println("정수를 10회 입력하세요: ");
		
		for(int i=9 ; b>=0; i--) {  //원하는 조건만 카운팅 하기 위해서 변수 b를 추가한다 (i는 사실상 무한대로 내려가고 조건은 b로 잡아줌)
			i=b;
			a= scan.nextInt();
			if (a==0) {
				System.out.println("0은 표시 불가능 입니다.");
				System.out.println("다시 입력해 주세요");
			}
			else if (a%3 ==0 && a%5==0) {
				System.out.println("3의 배수" + a);
				cnt3++;
				System.out.println("5의 배수" + a);
				cnt5++;
				System.out.println(b + "번 남았습니다");
				int c=a;
			}
			else if (a % 3 ==0) {
				
				System.out.println("3의 배수" + a);
				cnt3++;
				System.out.println(b + "번 남았습니다");
				int c=a;
			}
			else if (a%5==0) {
				
				System.out.println("5의 배수" + a);
				cnt5++;
				System.out.println(b + "번 남았습니다");
				int c=a;

			}
			else {
				System.out.println(b + "번 남았습니다");
				b--;
				continue;
			}

		}
		
		System.out.println("3의 배수는" + cnt3 + "개, 5의 배수는" + cnt5 + "개 입니다.");
					
				
		
		
	}

}
