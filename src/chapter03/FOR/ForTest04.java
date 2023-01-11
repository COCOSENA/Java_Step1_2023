package chapter03.FOR;

public class ForTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0 ~ 100 까지의 수중 홀수값만 합하기
		
		int num;
		int total = 0;
		
		for(num=0; num <=100; num++) {
			//무시되는 수행문
			if (num%2 == 0) //짝수 
				continue; //무시하고 진행
		
		total +=num;
		}
		System.out.println("홀수값만의 합:" +total);
		
		/////////////////////////////////////////////////////////
		
		System.out.println("1~20까지의 수중 홀수값만 출력하시요");
		
		for(num=0; num <=20; num++) {
			if (num%2 == 1) 
				System.out.print(num + " ");
		}
	}

}
