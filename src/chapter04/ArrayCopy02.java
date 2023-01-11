package chapter04;

public class ArrayCopy02 {

	public static void main(String[] args) {
		
		//얕은 복사 //메모리를 하나만 사용하여 원본과 복사본이 같은 자리를 공유
		//book bookArray1 3개첨자를 갖는 배열 선언
		
		book bookArray1[] = new book[3];
		book bookArray2[] = new book[3];
		
		
		//초기화
		bookArray1[0] = new book("데미안", "헤르만 해세"); 
		bookArray1[1] = new book("신", "베르나르 베르베르");
		bookArray1[2] = new book("노인과 바다", "노인");

		
		System.out.println("-----------원본(bookArray1)-----------");
		for (int i =0 ; i< bookArray1.length ; i++) {
			bookArray1[i].showBookinfo();                                       
		}
		
		
		System.out.println("----------복사본-----------");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for (int i =0 ; i< bookArray2.length ; i++) {
			bookArray2[i].showBookinfo();
		}
		//======================================================
		System.out.println(); //새롭게 정보를 수정함
		bookArray1[0].setBookname("나목"); //set은 데이터를 book이라는 클라스에 넣어주는 명령어
		bookArray1[0].setAuthor("박완서");
		//===================================================
		System.out.println("----------원본변경-----------");
		
		for (int i =0 ; i< bookArray1.length ; i++) { //원본은 변경된다
			bookArray1[i].showBookinfo();
		}
System.out.println("----------복사본 변경-----------");
		
		for (int i =0 ; i< bookArray2.length ; i++) { //Copy를 하지 않아도 원본을 변경된 상태이다 
			bookArray2[i].showBookinfo();
		}
	}

}
