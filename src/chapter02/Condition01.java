package chapter02;

public class Condition01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a, b;
		a= 10;
		b=15;
		boolean result;
		
		result = ++a >=b ? true : false; //제어문
		System.out.println(result);
		
		int n1 = 10;
		int n2 = 20;
		char result2 ;
		
		result2 = (++n1 == n2) ? 'Y' : 'N'; // '?'로 boolean을 시행하여  true , false를 연산하고 문자(Char)로 준다
		System.out.println(result2); 
		
		
		
		
	}

}
