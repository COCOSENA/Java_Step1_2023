package chapter04;

public class ArrayTest03 {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50}; //한번 선언하면 끝 (늘리거나 줄이는건 불가능 하다)
		int i;
		
		System.out.println("배열의 원소 출역");
		for (i=0 ; i < arr.length; i++) { //길이 == 5, 
			System.out.print(arr[i] + " "); // 
		} //for
		
	}//main

}//class
