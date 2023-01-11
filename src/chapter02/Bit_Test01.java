package chapter02;

public class Bit_Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//비트 연산
		int num1 = 2;  //0010
		int num2 = 10;   //1010
		
		// or(|)
		int result = num1 | num2;
		System.out.println(result); // 1010 = 10이 된다
		
		// and(&)
		int result1 = num1 & num2;
		System.out.println(result1); // 0010 = 2
		
		
		// XOR(^)
		int result2 = num1 ^ num2;
		System.out.println(result2); // 1000 = 3
		
		
		
		
	}

}
