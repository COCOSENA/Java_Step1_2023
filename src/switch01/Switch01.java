package switch01;

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ranking =1; //case별로 숫자를 지정해준다
		char medalColor;
		
		switch (ranking){ //if랑은 다르게 조건문이 성립이 안되더라도 마지막 까지 읽는다(break를 사용하여 빠져나오자)
			
		case 1:
			medalColor = 'g';
			break;
		
		case 2:
			medalColor = 'S';
			break;
		
		case 3:
			medalColor = 'B';
			break;
		
		default: //나머지 value 값 (굳이 break를 하지 않아도 무관)
			medalColor = 'A';
		}
		
		System.out.println(ranking + "등 메달은" + medalColor + "입니다.");
		
	}

}
