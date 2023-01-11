package chapter04;

public class ArgsTest {//argument

	public static void main(String[] args) {
		/*
		//메모리방을 따로 할당해 준다 (정수형 전역변수) // 전역변수는 사실 잘 사용하지 않음(충돌 가능성 있음)
		int a =1;
		int b =2;
		int c =3;
		int d =4;
		int e =5;
		int f =6;
		
		System.out.println(a+b+c+d+e+f);
		*/
		//배열선언
		
		int a[] = new int[5]; // 라는 자리에 5개의 자리를 만들어 준다 (정수형 배열 정수, Fixed-length - 메모리가 이미 할당되어 있음)
		
		
		//배열선언2
		int b[]; //선언만 하고 나중에 사용
		b=new int[5];	
		
		int aVal;
		int bVal;
		int aTot;
		
		//배열선언3
		args = new String[2]; //String을 instance로 사용하는건가? 
		args[0] = "0"; //[0] 첨자 / "1"요소

		String[] str;
		str = new String[10];
				
		//length : 배열의 첨자 (메모리)수
		if(args.length == 2) {
			aVal = Integer.parseInt(args[0]); //class by class로 대응해주어야 한다
			bVal = Integer.parseInt(args[1]);
	}else {
		aVal=0;
		bVal = 0;
	}
		
		aTot=aVal + bVal;
		
		
		
		
	}

}
