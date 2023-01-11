package chapter01;

public class CharacterEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//char : 2byte(java)
		//char : 1byte (c, c++, c#)
		
		char str1='A'; // 2바이트 (단순 자료형)
		String str ="hellow"; // 문자방은 싱글로 준다 ('') , 문자열은 ("")
				
		String str2 = "hellow Java"; //String은 java.lang에서 만들어진 것 (이미 만들어진 class)
		String str3 = "W"; //String은 알아서 용량을 짤라줌 (그래서 String을 주로 씀)
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("str3 : " + str);
	}

}
