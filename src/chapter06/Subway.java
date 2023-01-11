package chapter06;

public class Subway {

	public String lineNumber;
	public int passengerCount;
	public int money;
	
	//디폴트 생성자 생략 
	public Subway(String lineNumber) {
		this.lineNumber=lineNumber; //생성자로 초기화 
	}
	
	public void take(int money) { //승객이 낸 돈
		this.money += money; //지하철 수입 증가
		passengerCount++; //승객의 수
	}
	
	public void showInfo() { //버스의 정보 출력
		System.out.println("지하철"+ lineNumber +"번 승객은 " + passengerCount+ "명이고, 수입은 "+ money + "원 입니다.");	
	
	
}

}
