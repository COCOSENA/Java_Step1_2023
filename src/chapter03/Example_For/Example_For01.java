package chapter03.Example_For;

public class Example_For01 {

	public static void main(String[] args) {
		// 1~100까지의 수중 3의 배수의 합
		
		int i, sum=0;

		for (i = 1; i <= 100; i++) { //1~100까지 숫자 반복
			if (i % 3 == 0) { //3의 배수만 sum에 더해준다
				
				sum += i;
			}
		System.out.println(sum);
		}
		
		
				

	}

}
