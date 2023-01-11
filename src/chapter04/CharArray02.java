package chapter04;

public class CharArray02 {

	public static void main(String[] args) {
		
		char alpa [] = new char[26];
		char ch = 'A'; //65
		
		//System.out.println(ch++); 
		//System.out.println(ch);
		
		for (int i = 0;i < alpa.length   ; i++)
			System.out.println(alpa[i] = ch++ );
		
		for (int i = 0;i < alpa.length   ; i++, ch++) { //증감식은 추가 가능함 
			System.out.println(alpa[i] = ch);
			System.out.print("(" + alpa[i] + "," + (int)alpa[i] + ")|");
		}
	}

}
