package chapter03.While;

public class WhileTest01 {

	public static void main(String[] args) {
		
	while(true) {// true를 주면 무한 반복(if문처럼 조건을 주고 break를 걸어줄수 있음) // break를 걸어줄수 있다. //;없음
		int num = (int)(Math.random()*6) +1; //1~6 까지의 램덤한 숫자 추출
		System.out.println("주사위의 눈 :" + num);
	
		if(num==6) {
			break;//계속 반복되다가 6이 나오면 멈춤
		}
	}//while 문
	}

}
