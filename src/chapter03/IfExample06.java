package chapter03;

public class IfExample06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = (int)(Math.random()*6) + 1; //램덤한 숫자를 출력한다 (0 ~ 6) + 1
		
		//점 1 ~ 6점까지 받을 수 있음 각 점수당 분식 쏘기
		
		if(num==1) {
			System.out.println("1점 -> 순대");
		}
		else if(num==2) {
			System.out.println("2점 -> 순대");
		}
		else if(num==3) {
			System.out.println("3점 -> 순대");
		}
		else if(num==4){
			System.out.println("4점 -> 순대");
		}
		else if(num==5){
			System.out.println("5점 -> 순대");
			}
		else {
			System.out.println("6점 -> 순대");
		}
		
		
	}//class

}//main
