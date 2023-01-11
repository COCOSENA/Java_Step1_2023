package chapter03;

//내부 클래스
class clsA{
	void fun() {
	
	System.out.println("2023년 1월 첫주 월요일 입니다.");
	} //fun
}//clsA


class clsB extends clsA{ //clsA가 clsB를 상속한다는 계념"extends" ==> clsA < clsB
	
}//clsB


public class InsTest {

	public static void main(String[] args) {
		
		//clsB의 인스턴스 변수
		clsB objB=new clsB();
		
		if(objB instanceof clsA) { //만약 clsB에 clsA가 포함되어 있는가?) //class안에 class가 들어가 있는지 확인하는 방법 
			System.out.println("yes");
			objB.fun();
		}
		if(objB instanceof clsB) {
			System.out.println("yes");
		}//if
		
	}//main

}//InsTest Cls
