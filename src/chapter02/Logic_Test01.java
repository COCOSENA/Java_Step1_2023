package chapter02;

public class Logic_Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char a, b;
		boolean c;
		
		a='A';
		b='B';
		
		c=(true || true) && false;
		
		System.out.println(c);
		
		c=a<b &&(a==b); //엔더기븐은 앞이 false면 어쩌피 값이 false이기 때문에 나머지는 연산하지 않는다
		System.out.println(c);
		
		c=a>b || (a==b); //인더기븐은 앞이 true면 뒤는 연산하지 않는다 
		System.out.println(c);
		
		
		
	}

}
