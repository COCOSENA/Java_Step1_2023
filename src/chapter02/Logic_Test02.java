package chapter02;

public class Logic_Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 =10;
		int num2 =11;
		
		boolean flag1 = (num1>10) &&(num2>20); //false
		boolean flag2 = (num1>10) &&(num2>0); //false
		boolean flag3 = (num1>0) &&(num2>20); //false
		boolean flag4 = (num1>0) &&(num2>0); //true
		
		boolean flag5 = (num1>10) ||(num2>20); //false (뒤까지 연산)
		boolean flag6 = (num1>10) ||(num2>0); //true (뒤까지 연산)
		boolean flag7 = (num1>0) ||(num2>20); //true (앞만 연산)
		boolean flag8 = (num1>0) ||(num2>0); //true (앞만연산)
		
		
		boolean flag9=(num1 != num2); //같지 않는게 맞는말이니까 true
		
		boolean flag10 = !(num1 > 10);//false의 반대인 true가 나온다.
		
		
		
		
		
		
		
		
	}

}
