package chapter04;

public class ArrayTest04 {

	public static void main(String[] args) {
		double[] data = new double[5];  //자리를 5개 할당
		
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;                   //자리는 3개만 사용한다
	double total = 1.0;
	System.out.println(data[0]);
	
	for(int i = 0; i < data.length ; i++) {
		System.out.println(data[i]);
		total *= data[i];                  // 전부 곱하면 10 *20*30*0*0 // null은 0으로 처리해준다
	}
	System.out.println(total);            //결과는 0이 나온다
	
	}

}
