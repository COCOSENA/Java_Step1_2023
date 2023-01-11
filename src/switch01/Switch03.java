package switch01;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scan = new Scanner(System.in);
		
		int month;
		int day;
		
		
		System.out.println("월을 입력하세요 (1~12)");
		
		month = scan.nextInt();
				
		switch (month) {
		case 1: case 3: case 5: case 8: case 10: case 7:
			day = 31;
			break;
		
			
		case 4: case 6:case 9:case 11:
			day = 30;
			break;
		
		case 2:
			day = 28;
			break;
			
		
		default:
			day=0;
			System.out.println("존재하지 않는 달입니다.");
			break;
		}
		
		System.out.println(month + "은" + day+"까지 있습니다.");
		
	}

}
