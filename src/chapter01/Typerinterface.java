package chapter01;

public class Typerinterface {
		public static void main(String[] args) {
	
			
			//var(참조형 번수선언) : 데이터의 형태를 보고 알아서 판단하여 타입을 지정함
			// python 은 자동으로 선언됨
			
			int i = 10;
			var j = 10.0;   // double로 판단함,  데이터를 알아서 보고 판단하라는 명령어 
			var str = "test good"; //String으로 판단함
			
			var uni = "\uD55C"; //유니코드 또한 ""내부의 문자로 인식한다
			var ask = '한'; //char 또한 인식한다
			

			System.out.println(i);
			System.out.println(j);
			System.out.println(str);
			
			System.out.println(uni);
			System.out.println(ask);
			
}
}
