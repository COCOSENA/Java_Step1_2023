package chapter06;

public class MyDateMain {

	public static void main(String[] args) {
		
		MyDate date=new MyDate(); //MyDate라는 클래스에서 끌어다 쓸것 
		
		date.year=2023;
		date.month=12;
		date.day=27;
		
		System.out.println(date.year + "년" + date.month + "월 " + date.day+"일");

	}//main

}//class
