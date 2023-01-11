package chapter02;

public class Arith_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//총점과 평균을 출력
		
		int mathScore = 93;
		int engScore = 87;
		
		//총점
		int total = mathScore+engScore;
		System.out.println("총 점 : " +total);
		
		//평균
		float average = total /2;  //소수점 가능성 있어서 float를 사용한다, double도 가능함(90.0으로 표기된다)
		System.out.println("평 균 : " + average);
		
		
		
	}

}
