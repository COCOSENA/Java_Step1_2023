package chapter03.FOR;

public class ForTest01 {

	public static void main(String[] args) {
		// 1부터 10까지의 합
	
		int i;
		System.out.println("1부터 10까지의 수를 출력");
		for(i=1; i <= 10; i++) //반복문 (초기값은 1이고 10까지 반복하라)
			System.out.println(i + " ");
			
	
	/////////////////////////////////////////////////////////////////
	int j; //index 변수 (순서 확인해주는 변수)
	int sum = 0; // 누적 변수이므로 초기화를 시켜주어야 함
	
	for(j=1; j<=10; j++) {
		System.out.println(j + "");
		sum+=j; //0 + 1 +2+3+4+5
	}
	
	System.out.println(sum);
	
	
	
	}

}
