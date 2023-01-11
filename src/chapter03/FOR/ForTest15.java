package chapter03.FOR;

import java.util.Scanner;

public class ForTest15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a,b;
		System.out.println("행을 입력하세요");
		int i = scan.nextInt();
		System.out.println("열을 입력하세요");
		int i2= scan.nextInt();
		for (a=1; a<=i;a++) { 
			for(b=1; b<=i2; b++) {
				System.out.print(b + " ");
			}
		System.out.println(); //라인을 띄어주기
		}

	}

}
