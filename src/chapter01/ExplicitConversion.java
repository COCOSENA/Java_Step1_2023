package chapter01;

public class ExplicitConversion {
		public static void main(String[] args) {
			
			//캐스팅 문법 (명시적 형변환 - 명시하는 명령어를 주는 것 , ex. (char) 3
			
			int iNum = 1000;
			byte bNum = (byte)iNum; //byte는 -128 ~ 127까지만 표현 가능함
			
			System.out.println(iNum);  //표현 가능함
			System.out.println(bNum); //표현 가능한 숫자를 초과하여 나머지 값들은 소실된다. (강제로 형변환)
			
			double dNum1 = 1.2; // 8byte => 4byte
			float fNum1 = 0.9f; // 4byte
			
			int iNum2 = (int)(dNum1+fNum1);  //int로 명시해서 변환하면 소수점은 짤려서 나온다
			int iNum3 = (int)(dNum1) + (int)(fNum1); //둘다 int로 지정해주면 1 + 0으로 변경됨
			
			
			System.out.println(iNum2);  //결과값 2.1 = 2로 변경된다 (int로 변경되었기 때문에 소수점은 손실)
			System.out.println(iNum3); // 각 변수를 int로 변환하고 출력하면 1.0 + 0.0 = 1 로 결과가 나온다
		}
}
