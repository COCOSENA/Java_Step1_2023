package chapter03.FOR;

public class ForTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int i;
	char a ='A'; // ASCII CODE : 65
		
	for (i=a; i<='Z'; i++) { //65~ 90까지
		System.out.printf("%c", i); //char로 표현해 달라는 표시 (묵시적 형변환을 시킨다)
		System.out.print(i +" ");
		}
	System.out.println(i); // 후의연산임으로 i= 91이라는 숫자가 나온다
	}//main

}//
