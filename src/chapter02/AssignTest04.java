package chapter02;

public class AssignTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//전위연산 (더하여 결과값으로 표시함) //int lastScore = gameScore +1;
		
int gameScore = 150 ;
		
int lastScore = ++gameScore; //+1은 많이 쓰는 연산이기 때문에 class로 지정해둠 
		
		System.out.println(lastScore); //151
		
int lastScore2 = --gameScore; //151에서 1을 빼준다
		
		System.out.println(lastScore2); //150
		
//후위연산 (읽고 대입하고 값을 추가함)
		
int lastScore4 = gameScore++;  // 우선 lastScore4에는 150이 저장되어 있고 return 값으로 gameScore + 1을 받은 상태
		
		System.out.println(lastScore4); //150
		//gameScore 를 우선 넘긴다음 나중에 +1을 한다
		
		System.out.println(gameScore); //151 (gameScore + 1 상태임으로 151이 나온다)
		

		
		
		
		
		
	}

}
