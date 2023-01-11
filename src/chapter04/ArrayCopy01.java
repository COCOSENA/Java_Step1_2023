package chapter04;

public class ArrayCopy01 {

	public static void main(String[] args) {
		
		
		int array1[] = {10,20,30,40,50};
		int array2[] = {1,2,3,4,5};
		
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
			
			
			//배열복사 : (array1, 첨자(복사가 시작될 위치의 첨자), array2, 첨자(붙여넣기 할 시작 첨자), 붙여넣기 할 원소 갯수)
			System.arraycopy(array1, 0, array2, 1, 4);
			
			for (int i = 0; i < array2.length; i++) {
				System.out.print(array2[i] + " ");
			}	
			
			//10 20 30 40 50   array1
			//1  2  3  4  5    array2
			//1 10 20 30 40 	array1의  커피 -->  
			
		
		
	}

}
