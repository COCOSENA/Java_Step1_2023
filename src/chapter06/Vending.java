package chapter06;

public class Vending {

	//멤버변수
	private Can can[]=new Can[5]; //선언만
	private int money;
	
	//디폴트생성자x
	
	//can[0]=new Can("환타",1000); 
	//private 변수방이므로 반드시 메소드 안에서 초기화한다
	//만약에 public 이면 메인에서 값 입력 
	
	//메소드 
	public void init() { //can 안에 초기화 해준 것. 빈 캔에 값 할당 
		can[0]=new Can("환타",1000); //메소드 안에 들어가서 구현해야함
		can[1]=new Can("칠성사이다",1500);//메소드 안에 들어가서 구현해야함
		can[2]=new Can("코카콜라",2000);//메소드 안에 들어가서 구현해야함
		can[3]=new Can("초코우유",1200);//메소드 안에 들어가서 구현해야함
		can[4]=new Can("딸기우유",1600);//메소드 안에 들어가서 구현해야함
		
	}
	
	
	//사용 가능한 음료만 보여주기
	public void showCans(int m) {
		money=m;
		//가까운 곳에 할당되기 때문에 이름을 바꾸거나 or this.money=money
		//this.money = 나의 객체 = 나의 돈 
		
		for(int i=0; i< can.length; i++) { //돈, 가격 비교판단★실수많은곳★
			if(can[i].getPrice() <= money) { //★머니던 m이던 같은거니까 뭘 넣어도 상관없? 상관없다!! 
				System.out.println(can[i].getCanName()+ ", "+ can[i].getPrice());
			
	
			}//if
		}//for
		
		
	}//method
	//선택한 음료수 제공과 잔액
	public void outCan(String name) { //can 이름으로 줄거라 string, 입력받는name
		for(int i=0; i < can.length ; i++) {
			if(can[i].getCanName().equals(name)) {
				System.out.println(can[i].getCanName()+"을 선택하셨습니다.");
				System.out.println("잔 액 : " + (money-can[i].getPrice()));
			
			}//if
		

		}//for
		
	}//outcan
	
}//class 


