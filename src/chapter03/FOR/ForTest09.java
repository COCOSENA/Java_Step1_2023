/**
 * 
 */
package chapter03.FOR;

import java.util.Scanner;

public class ForTest09 {

	public static void main(String[] args) {
		// 몇명의 성적을 입력받을 것인지 정수로 인원수를 입력받다 총점과 평균을 이구하시오(단, 편균은 실수로 출력할것)
		
		Scanner scan = new Scanner(System.in);
		
		int i,score, sum = 0, cnt=0; //cnt는 쓰지 않아도 ㄱㅊ음
		double avg;
		
		
		System.out.println("몇명의 성적을 입력받을 것인지?");
		int std = scan.nextInt();
		
		for (i=1 ; i <=std; i++ ) { //반복하면서 학생의 수만큼의 점수를 받아야 한다
			System.out.println(i + "번째 학생의 점수를 입력하세여:");
			score = scan.nextInt();
			sum +=score;
		}
		
		avg = sum/(double)std;
		
		System.out.println("총점은" + sum +"이고, 평균은" + avg + "입니다.");
		

	}

}
