package chapter04;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//선언방법
		int num1[] = new int[10]; //배열방만 10개 존재하는 것이고 아직 초기화를 해주지는 않았다
		int[] num2 = new int[10];
		
		//일단 정의를 하고 
		int num3[];
		num3 = new int[10]; // 나중에 선언해 준다
		
		//초기화 최초로 값을 할당해 주는 것인다
		int num4[] = new int[] {1,2,3,4,5,6,7,8,9,10}; // Fixed-length
		int num5[] = {1,2,3,4,5,6,7,8,9,10}; //미리 초기화
		
		//for문
		for(int i=0;i < num3.length;i++) { //num3.length == 길이가 4
			System.out.println(num4[i]); // num = 1,2,3 ....
			
		//for(int i=0;i < num3.length;i++) { //num3.length == 10 자리가 있음
			//System.out.println(num1[i] = (i+1)); // num4 = 1,2,3 .... //출력과 초기화를 같이 해주는 것도 가능하다
		}//for
		
	}

}
