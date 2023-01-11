package chapter06;

public class StudenInfo {
	
	//필드
	
	int studenID;
	private String studentName;
	int grade;
	String address;
	
	
	
	//생성자 생략 : free complie
	
	//아래는 이클립스 소스로 설정함 
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
