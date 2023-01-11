package chapter03.FOR;

public class ForTest14 {

	public static void main(String[] args) {
		// 
		int a,b;
		for (a=1; a<=5;a++) { //a=0; a<5 ==> 5번 회전 확인 가능
			for(b=1; b<=5; b++) {
				System.out.print(b + " ");
			}
		System.out.println(); //라인을 띄어주기
		}
	}

}
