package chapter01;

public class DoubleEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float fnum = 3.14f; //4byte  (기본으로는 double인데  4바이트로 변경하려면 데이터 손실이 나기때문에 f를 붙여준다) / (float)3.14도 가능
		float anum = (float) 3.14;
		double dnum = 3.14; //8byte
			
	// 왜 f를 쓰는가?
		// Number : bit -> byte -> short -> int -> long
		// 소수 : float -> double
		// 문자 : char('') -> String (string만 대문자인 이유는 class이기 때문에, 객체 지향으로 가기때문에 따로 표현된다. 나머지는 일반 자료)
		System.out.println(fnum);
		System.out.println(dnum);
		System.out.println(anum);
	}

}
