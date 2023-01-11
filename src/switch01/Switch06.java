package switch01;

public class Switch06 {

	public static void main(String[] args) {
		// 오전 9 ~ 오후 6
		
		int time = (int)(Math.random()*24); //(24시
		System.out.println("[현재시간:" + time + "시]");
		System.out.print("할 일:");
		
		switch (time) {
		case 9: case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18:
			System.out.println("수업시간");
			break;

		case 21: case 22: case 23: case 24: case 1: case 2: case 3: case 4: case 5: case 6:
			System.out.println("수면");
			break;
			
		default:
			System.out.println("복습하기");
			break;
		}

	}

}
