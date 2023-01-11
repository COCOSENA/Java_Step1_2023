package chapter02;

public class Rela_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char a,b;
		
		a='A';
		b='B';
		
		boolean AL = a>b;  //문자의 크기를 비교하면 아스키 코드를 비교하게 됨(65>66 == False) 
		System.out.println(AL);
		
		
	   char c='가';
	   char d='나';
	   
	   boolean H = c>d; //유니코드는 아스키 코드로 변환후 값을 비교해준다.
	   
	   System.out.println(H); //boolean으로 값을 지정해주고 판단 가능하지만 
	   
	   
	   System.out.println(a>b); //단순히 printIn 으로도 판별 가능하다
	   System.out.println(a<b);
	   System.out.println(a==b);
	   System.out.println(a!=b);
	   
	   int num1 = 5;
	   int num2 = 3;
	   
	   System.out.println(num1>num2);
	   System.out.println(num1>=num2);
	   System.out.println(num1<num2);
	   System.out.println(num1<=num2);
	   System.out.println(num1==num2);
	   System.out.println(num1!=num2);
	   
	   
	   
	   
	   
	   
	   
	}

}
