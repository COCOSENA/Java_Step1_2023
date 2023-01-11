package chapter03.FOR;

public class ForTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//방법 1
		System.out.println("1부터 100까지의 합을 구하되 합이 100미만인 수중 가장 큰수");
		
		int i;
		int sum =0;
		for(i=1; i<=100; i++) {//후위 연산이기 때문에 가장 마지막에 더한다
			
			sum +=i;
			if (sum<100) {
				System.out.println("A숫자" + i + "까지의 합 :" +sum + "입니다.");
			}//if
			
		}//for
		
		
		//방법2
		System.out.println("1부터 100까지의 합을 구하되 합이 100미만인 수중 가장 큰수");
		
		
		int j;
		int sum1 = 0;
		for(j=1; j<=100; j++) { //j=14
			sum1 +=j; //sum1 = 105 
			if (sum1>=100) { 
				break; //빠져나왔음으로 후위연산 j = 14 + (1)은 하지 않음 (즉 j=14인 상태이다)
				
		//for (j=0; j<=100; ++j)
	}
			
		}
			System.out.println("해당 숫자:" + (j-1)+ "입니다.");
			System.out.println("B해당 숫자:" + (j-1)+"까지의 합은 "+(sum1-j)+ "입니다.");
			

			int k;
			int sum2 = 0;
			for(k=1; sum2 <=100; k++) { //sum2 = 91 / k=14
				sum2 +=k; //k=14
				System.out.println(sum2); //1~14까지 더함 // 이떄 k=15
			}
				System.out.println("해당 숫자:" + (k-1)+ "입니다.");
				System.out.println("C해당 숫자:" + (k-1)+"까지의 합은 "+(sum2-k)+ "입니다.");
				
			
	}
}
