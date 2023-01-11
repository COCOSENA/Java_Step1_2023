package chapter01;

public class CharacterEx3 {
	public static void main(String[] args) {
	
		//대문자 : 65부터 표시가 됨 , 소문자는 97부터 시작을 한다
		
			int a=65;
			
			System.out.println(a);
			System.out.println((char)a); //형변환(ASCII 코드)
			System.out.println("=================================");
			
			
			int b=66;
			System.out.println(b);
			System.out.println((char)b); //형변환(ASCII 코드) 
			System.out.println("=================================");
			
			int a2=97;
			System.out.println(a2);
			System.out.println((char)a2); //명시적 형변환(ASCII 코드 = 유니코드라고도 함)
			System.out.println("=================================");
			
			
	
	}
}
