package chapter03.FOR;

import java.util.Scanner;

public class ForTest13 {

	public static void main(String[] args) {
		//구구단
		
		for(int i=2; i<10; i++)
			for(int j=1; j<10; j++)
				System.out.println(i+ "*" + j + "=" + i*j); //i=1 , j=1~10
		
		
		////////////////////////////////////////////////////
		Scanner scan = new Scanner(System.in);
		
		System.out.println("단을 입력하세요 :");
		int b=scan.nextInt();
		for (int a=1; a<=9 ; a++)
			System.out.println(b+ "*" +a+ "=" +b*a );
		
			
		
	}

}
