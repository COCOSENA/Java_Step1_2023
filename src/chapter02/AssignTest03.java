package chapter02;

public class AssignTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(+num1);
		System.out.println(-num2); //실질적으로  음수가 된것은 아니다, 표시상에서만 "-"가 붙은 것
		System.out.println(num2); // assignment 를 하지 않았기 때문
		
		num2 = -num2;
		System.out.println(num2); //이제는 음수임
	}

}
