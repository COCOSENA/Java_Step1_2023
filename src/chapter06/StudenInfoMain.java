package chapter06;

public class StudenInfoMain {

	public static void main(String[] args) {

		
		
		StudenInfo studentKim=new StudenInfo(); //매개변수없는 기본생성자
		
		//매개변수 있는 private 가 보이지 않음(캡슐화?) 
		//직접적으로 갈 순 없지만 메소드를 통해서만 갈 수 있다 
		studentKim.studenID=103188;
		studentKim.grade=3;
		studentKim.address="서울특별시 종로구";
		System.out.println("학생 김씨의 학번은 " + studentKim.studenID);
		System.out.println("학생 김씨의 학년은 " + studentKim.grade);
		System.out.println("학생 김씨의 주소는 " + studentKim.address);
				
		studentKim.setStudentName("홍길동");
		String name=studentKim.getStudentName();
		
		System.out.println(name);
		
		
	}//main


}//class
