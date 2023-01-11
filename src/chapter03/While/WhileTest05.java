package chapter03.While;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		int num, cnt=0, sum =0;
		double avg;
		
		while(true) {
			System.out.println("숫자를 입력하세요");
			num= scan.nextInt();
			if (num ==0) {
				break; //아래까지 계산하지 않고 빠져나온다
			}
			
				sum += num;
				cnt++;
		
		}
		avg = sum/cnt;
		System.out.println(sum + "나누기" +cnt);
		System.out.println("평균값은" + avg + "입니다.");	
		
		
	}

}
