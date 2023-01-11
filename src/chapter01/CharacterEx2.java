package chapter01;

public class CharacterEx2 {
	
	public static void main(String[] args) {
	
		
		char ch1 = '한';
		String ch2 = "\uD55C"; //unicode 
		
		System.out.println((int)ch1); //한글을 
		System.out.println(ch2); // 저장된 unicode 를 한글로 출력
	}

}
