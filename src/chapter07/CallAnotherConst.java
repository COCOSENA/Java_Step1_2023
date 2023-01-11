package chapter07;

class Person2 {

	String name;
	int age;

	public Person2() {
		this("이름없음", 0); //Person2(String str, int a)힙메모리에 세팅 
	}

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;

	}

	// 주소. 힙메모리는 많이 만들수있으나 주소가 다르다?
	Person2 returnSelf() {
		return this; // this 자체가 객체의 주소.
		//new할때 생기는 메모리 자체. 
	}

}

public class CallAnotherConst {
//객체 이름이 다르면 다른 주소로 할당 
	public static void main(String[] args) {
		
		Person2 noname = new Person2();
		System.out.println(noname.name);
		System.out.println(noname.age);
		System.out.println("noname의 주소:" + noname.returnSelf());
		//noname과 p의 객체는 전혀 다른곳으로 할당
		System.out.println("---------------------------");
		Person2 p=new Person2();
		System.out.println("p의 주소 : " + p);
		//주소 복사 
		System.out.println("---------------------------");
		Person2 person=noname.returnSelf(); //자기주소 
		System.out.println(person);
		System.out.println(noname);
		

		
		
	}// m

}// c
