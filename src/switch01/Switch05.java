package switch01;

public class Switch05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("주사위 눈의 수:");
		
		int num = (int)(Math.random()*10) +1; //1~6까지의 숫자
		
		switch (num) {
		case 1: case 2: case 3: case 4: case 5: case 6:
			System.out.println(num +"점 획득");
			break;

		default:
			System.out.println("잘못된 숫자 입니다.");
		}

	}

}
