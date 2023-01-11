package chapter06;

public class Student {
	
	//필드
	int studenID;
	public String studentName;
	int grade;
	String address;
	
	
	//프리컴파일(free compile)
	
	
	//디폴트 생성자(free compile)
	//오버로딩 된 생성자(get set?)
	//가 있을시 디폴트를 사용하게 위해서는 반드시 명시. 
	//생략이 불가!!
	//하나도 생성자가 없으면 자동으로 이클에서 만들어줌 

	//디폴트 생성자(메모리생성만)
	public Student() {	
	}
	
	
	//생성자 오버로딩(이름은 같게하고 매개변수 다르게 하는 등 
	//초기화가 필요할때 이런식으로 만들어줘야함)
	public Student(String studentName, String address) {
		this.studentName=studentName;
		this.address=address;
		
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public void showStudentInfo() {
		System.out.println(studentName+ "," + address);
	}
	
	
	
}
