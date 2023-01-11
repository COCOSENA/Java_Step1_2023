package chapter03.FOR;

public class ForTest02 {
	public static void main(String[] args) {
		//for 문을 활용해서 1~100까지의 합
		int j;
		int sum = 0;
		
		for(j=1; j<=100; j++) {  //{}은 필수로 넣어주어야 함
			System.out.print(j + " ");
			sum +=j;
		}
		System.out.println();
		System.out.println(sum);
	}

}
