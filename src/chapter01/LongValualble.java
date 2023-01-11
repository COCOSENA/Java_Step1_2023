package chapter01;

public class LongValualble {
	public static void main(String[] args) {
		
		//int num1 = 12345678900 //int 32비트라 큰숫자 표시 불가
		long num2 = 12345678900L; //  long은 64비트  //초기화가 되어있는 상태
		long num3 = 1000; //크기가 "int"로도 표현 가능하기 때문에 내부적으로 자동으로 int로 변경되어서 들어간다
		
		int level; //선언만 하고 초기화 되지 않음
	
		level = 10; //returner 값  (초기화가 되어있는 상태)
		
		System.out.println(num2 + num3); //결과값은 long으로 인식함 (큰수로 인식)
		System.out.println(level);
	}

}
