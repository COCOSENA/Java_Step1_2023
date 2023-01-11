package chapter05;

public class FunTest_OverloadingMain {

	public static void main(String[] args) {
		
		
		FunTest_Overloading fuc=new FunTest_Overloading();//흰 메모리 공간이 생김 
		fuc.getReult('A');
		fuc.getReult('3');
		fuc.getReult("스트링");
		fuc.getReult(6, " 2023");
		
		
		
	}

}
