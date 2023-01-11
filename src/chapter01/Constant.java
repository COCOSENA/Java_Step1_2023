package chapter01;

public class Constant {
		public static void main(String[] args) {
			 //상수 Constant : 절대 변하지 않는 값, 다만 초기화가 안된 값은 변경 가능함 , 
			
			final int MAX_NUM= 100; // 상수로 설정하면 변경 불가능
			final int MIN_NUM; // 초기값이 없음 
			final double PI = 3.14;
			
			MIN_NUM = 0;
			
			System.out.println(MAX_NUM);
			System.out.println(MIN_NUM); //초기값이 없으면 0으로 표기
			System.out.println(PI);
			
		
		}
}
