package chapter04;

public class ArrayCopy03 {

	public static void main(String[] args) {
		// book 클래스의 배열 복제
		//book 클래스의 배열 만들기 3개
		book bookarray01[] = new book[3]; //선언만
		book[] bookarray02 = new book[3];
		
		//초기화
		bookarray01[0] = new book("데미안", "헤르만 해세"); 
		bookarray01[1] = new book("신", "베르나르 베르베르");
		bookarray01[2] = new book("노인과 바다", "노인");
		
		//bookarray02 객체생성
		bookarray02[0] = new book();

		bookarray02[1] = new book();

		bookarray02[2] = new book();
		
		System.out.println("-----------원본(bookArray1)-----------");
		for (int i =0 ; i< bookarray01.length ; i++) {
			bookarray01[i].showBookinfo();                                       
		}
		
		
		//깊은 복사 (명령어가 없음) //
		
		for(int i = 0 ; i < bookarray01.length ; i++) {
			bookarray02[i].setBookname(bookarray01[i].getBookname()); //array1에서 저장된 
			bookarray02[i].setAuthor(bookarray01[i].getAuthor());
		}
		System.out.println("-----------복사본-----------");
		for (int i =0 ; i< bookarray02.length ; i++) {
			bookarray02[i].showBookinfo();
		}
		System.out.println(); 
		
		//증명
		bookarray01[0].setBookname("나목");
		bookarray01[0].setAuthor("박완서");
		//===================================================
		
		System.out.println("----------원본변경-----------");
		
		for (int i =0 ; i< bookarray01.length ; i++) { //원본은 변경된다
			bookarray01[i].showBookinfo();
		}
System.out.println("----------복사본 변경-----------");
		
		for (int i =0 ; i< bookarray02.length ; i++) { //Copy를 하지 않아도 원본을 변경된 상태이다 
			bookarray02[i].showBookinfo();
		}
		

	}

}
