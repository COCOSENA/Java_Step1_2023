package chapter04;

public class TwoDimention {

	public static void main(String[] args) {
		
		int arr[][] = new int[2][3]; //2 디멘션 
		int n=0;
		
		for (int i =0 ; i < arr.length; i++) { //열 == 2 (열을 우선 인식한다) // [0,1] 
			for (int j=0; j<arr[i].length ; j++) { //행 ==3  [ 0,1,2 ] 3번 반복 // arr[0].length == 3 // 
				
				n++;
				System.out.print((arr[i][j] = n) + " "); //리터럴 넣고 출력 // 데이터는 순차적으로 들어감
			}
			System.out.println();
			
		}
		
		System.out.println( "------------------");
		System.out.println(arr.length); // 열의 길이를 의미
		System.out.println(arr[0].length); // []해당 열의 행을 의미
		System.out.println("--------------------");
		
		
		int arr1[][]= {{1,2,3}, {4,5,6}};
		
		
		for (int i=0; i < arr.length;i++) {
			for (int j=0; j<arr1[i].length; j++) {
				System.out.print(arr[i][j] + " ");
		}
		}	
		
		
	}

}
