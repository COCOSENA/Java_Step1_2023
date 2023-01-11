package chapter04;

public class EnhancedForLoop01 {

	public static void main(String[] args) {
		String strArray[] = {"Java", "Oracle", "Html5, CSS, JS, JQ", "JSP", "Spring", "PythonCamp"}; //1차원 배열

		for (int i = 0 ; i < strArray.length ; i++) {
			System.out.println(strArray[i]);
	}
	
		System.out.println("=============================");
		//확장 For
		for (String lang :strArray) {// ":"를 사용한다 for (a  :   b) = b의 데이터를 배열 구분 없이 전부 lang으로 넘겨준다  
			System.out.print(lang + " "); 
		
		//실행하면서 변수 lang에 자동으로 대입해준다
		}
	}

}
