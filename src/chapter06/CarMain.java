package chapter06;

public class CarMain {

	public static void main(String[] args) {
	
		Car num=new Car();
		
		System.out.println("제작회사 : " + num.company);
		System.out.println("모델명 : " + num.model);
		System.out.println("색깔 : " + num.color);
		System.out.println("최고속도 : " + num.maxSpeed);
		System.out.println("현재속도 : " + num.speed);
		System.out.println("---------------------");
		
		//필드값 바꾸기
		
		num.speed=60;
		System.out.println("변경된 현재 속도: "+ num.speed );
	
		
	}//main

}//c
