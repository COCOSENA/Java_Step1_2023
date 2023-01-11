package chapter03;

public class IfExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if문 ==> 제어문 (순차지향형으로 위에서 아래로 일어내려감.)
		int age = 10;
		
		if(age >= 10) //관계연산 True 가 나오면 아래 블럭을 수행, false면 아래 분기를 수행
			{
			System.out.println("학교에 다닙니다.");
			}
		else {
		    System.out.println("학교에 다니지 않습니다.");
		}
		
		//string str =(age >=8)? "학교에 다닙니다." : "학교에 다니지 않습니다";
		
	}//main

}//class
