package chapter02;

public class AssignTest01 {
	public static void main(String[] args) {
		//선언하고 변화 가능
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1);
		
		//num1 = num1 + num2; // 같은 숫자를 중복시키는 경우 촌스러운 코딩
		
		num1 +=num2; // 누적값으로 표기하면 깔끔함 (num1 = num1 + num2;와 같은 의미)
		
		System.out.println(num1);
		
	}

}
