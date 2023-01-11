package chapter06;

public class Bus {

	//멤버변수
	int busNumber;
	int passengerCount;
	int money;
	
	//디폴트 생성자 생략 
	public Bus(int busNumber) {
		this.busNumber=busNumber; //생성자로 초기화 
	}
	
	//★위아래 void 유무 차이는 ,,, 반환할 값의 차이???
	public void take(int money) { //승객이 낸 돈
		this.money += money; //이 돈을 멤버변수에 올려놓을거다. 버스의 수입 증가
		passengerCount++; //승객의 수
	}
	
	public void showInfo() { //버스의 정보 출력
		System.out.println("버스" + busNumber + "번 승객은 " + passengerCount+ "명이고, 수입은 "+ money + "원 입니다.");
		
	}
	
}
