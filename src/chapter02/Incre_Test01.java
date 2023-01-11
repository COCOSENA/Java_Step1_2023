package chapter02;

public class Incre_Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a, b, c, d; //선언만 하는것 returner이 없는 상태 (변수를 설정할때 번거롭게 하나씩 int를 넣어줄 필요가 없어서 편리!)
		a= 10; //return 값을 넣어줌
		b=20;
		c=3;
		d=1;
		
		
		System.out.println(++a); //a= a+1 -> a+=1 =>11
		System.out.println(a++); //a=a -> a=a +1
		System.out.println(a); //12
		
		
		System.out.println(c++);  //3
		System.out.println(c);  //4
		
		//전위연산 + 후위연산
		System.out.println(++a + b++); // 13+20
		System.out.println(b); //21
		
		System.out.println( ++a); //14
		System.out.println(b++); // 21
		System.out.println(b);//22
		System.out.println(++a + b++); //37
		System.out.println(b); //23
		
		
		
		
		System.out.println(d+1); //printIn은 단순히 인새해 주는것만이 아니라 '명령어'를 입력하면 값을 돌려 받기도 한다
		//단순 정보를 입력하는것은 값을 돌려받지 못한다.
		System.out.println(d);  //1
		
		
		
	}

}
