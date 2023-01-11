package chapter03.FOR;

public class ForTest12 {

	public static void main(String[] args) {
		//
		int x,y;
		
		for (x=1; x<=1; x++) {
			for(y=1; y<= 10; y++) { // x=1, y=1~10 | x=2, y=1~10
				
				if(4*x + 5*y == 60) { //60이 되는 것들만 출력해준다 // break;를 걸어주면 해당 for문만 빠져나온다
					System.out.println(x +"," + y);
				}//if
				
			}//in for
		}//out for

	}// main

}//class
