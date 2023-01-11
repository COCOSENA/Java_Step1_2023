package chapter03.FOR;

import java.util.Scanner;

public class ForTest18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int i,j,k ;
		int n = scan.nextInt();
		
		for(i=1; i<=n ; i++) {
			for (k=n-1; k<=0; k--) {
				System.out.print(" ");
		}
			for(j=1;j<=i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
	}

}
