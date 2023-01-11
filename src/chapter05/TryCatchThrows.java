package chapter05;
//안전장치
public class TryCatchThrows {
	
	//메소드
	public static void fun() throws Exception{
	
	try {//정상코드
		
		System.out.println("fun()메서드");
		throw new Exception();
		
	} catch (RuntimeException e){ //RuntimeException 실행중에 발생하는 에러
				//에러시 수행문 	
		System.out.println("예외 발생");
	}finally { //에러를 잡지 못해도, 또는 에러를 잡아도 무조건 수행.finally 문장은 무조건 읽음
		System.out.println("finally 문장 ");
	}
	
	
	}//메소드
	
	

	public static void main(String[] args) {
		//static이므로 바로 호출 가능 해야하지만 throws Exception 메소드이므로
		//try catch 안에서만 호출 가능 
		//fun();
		try {
			fun();
		}catch (Exception e) {
			System.out.println("main()의 catch문 문장");
			
		}
		
		
		
	}//main

}//class
