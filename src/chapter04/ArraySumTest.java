package chapter04;

public class ArraySumTest {

	public static void main(String[] args) {
		
		int score[] = {98,90,87};
		
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " + ");
			sum +=score[i];
		}
		
		System.out.println("총합 :" + sum);
		System.out.println("총합 :" + sum / score.length);
		System.out.println("평균 :" + Math.round((double)sum/score.length));  //Math.round = 부동 소수점을 반올림 해주는 기능 
		
		//반올림
		
		
	}

}
