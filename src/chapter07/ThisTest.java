package chapter07;

public class ThisTest {
	
	//매개변수
	private int Speed;
	private int Age;
	private String RobotName;
	private String RobotNum;
	
	//기본 생성자
	public ThisTest() {}
	
	//오버로딩 
	public ThisTest(int speed, int age, String robotName, String robotNum) {
		Speed = speed;
		Age = age;
		RobotName = robotName;
		RobotNum = robotNum;
	}
	
	//메소드
	public void Move() {
		Speed +=20;
		System.out.println("RobotSpeed : "+Speed);
	}
	
	public void Stop() {
		Speed =0;
		System.out.println("RobotSpeed : "+Speed);
	}
	
	public void RAge() {
		Age +=1;
		System.out.println("RobotAge : "+Age);
	}
	
	public void RName() {
		System.out.println("RobotName : "+RobotName);
	}
	
	public int getSpeed() {
		return Speed;
	}
	

	public int getAge() {
		return Age;
	}

	public String getRobotName() {
		return RobotName;
	}


	public String getRobotNum() {
		return RobotNum;
	}


	
	

	}


