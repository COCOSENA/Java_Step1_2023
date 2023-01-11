package chapter02;

public class Logic_Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, i;
		
		num1 = 10;
		i = 2;
		
		boolean value = ((i=i+2) < 10) && ((num1 = num1 +2) <10); //뒤까지 연산하여 값을 리턴해주지만 
		System.out.println(i); //4
		System.out.println(num1); //12
		System.out.println(value); //false
		
		value = ((i=i+2) > 10) && ((num1 = num1 +2) <10); // 앞만 연산하는 경우에는 뒤의 num1은 값을 리턴해주지 않는다.
		System.out.println(i); //i = 4+2
		System.out.println(num1); //어쩌피 false이기 때문에 뒤는 계산 ㄴㄴ 
		
		value = ((i=i+2) > 10) || ((num1 = num1 +2) <10); //앞에서 value를 boolean이라는 명령어를 수행하기로 되어있기 때문에
		// value는 명령어 boolean이 저장되어 있다
		
		System.out.println(value); //그럼으로 프린트 하면 boolean명령어를 수행한다
		
		
		
       // value = 12; //이미 assign되어 있는면 성격을 바꾸는건 불가능 
		
		
		
	}

}
