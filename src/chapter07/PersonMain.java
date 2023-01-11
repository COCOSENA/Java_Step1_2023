package chapter07;

public class PersonMain {
	
	
	public static void main(String[] args) {
		//내가 한 방식
		Person who = new Person();	
		who.name="강감찬";
		who.height=160f;
		who.weight=50f;
		System.out.println(who.name);
		System.out.println(who.height);
		System.out.println(who.weight);
		
		//수업(값 넣으면서 출력하기) 
		Person someOne=new Person();
		System.out.println(someOne.name = "강감찬" );
		System.out.println(someOne.height = 160f );
		System.out.println(someOne.weight = 50f);
			
		

	
	}//main

}//class
