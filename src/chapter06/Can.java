package chapter06;

public class Can {
	
	//필드
	private String canName;
	private int price;
	
	//생성자 오버로딩(초기화하기 위해서. 빈걸로 하면 안 되고
	//그래야 컴파일러가 새로운 디폴트도 안 만들고
	//만들어진건 무조건 이름이 있고 가격이 있는것. 클래스랑 이름 동일하게~~
	public Can(String canName,int price ) {
		this.canName=canName;
		this.price=price;
	}

	//이클립스 기능을 통해 가져오는 get
	//내가 값을 가져오기 위해서 !! 
	
	public String getCanName() {
		return canName;
	}

	public int getPrice() {
		return price;
	


	}
}
