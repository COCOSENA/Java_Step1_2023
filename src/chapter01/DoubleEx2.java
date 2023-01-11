package chapter01;

public class DoubleEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 정수(int)와 실수 (Float)
		// 더 정밀한 수로 자동 형변환이됨 "즉, float로 표기가 된다"
		int aVal = 10;
		float bVal = 10.5f;
		
		System.out.println("aVal+bVal :"  +(aVal + bVal)); //묵시적 형변화 , 알아서 용량을 조절하여 변화해줌
	}

}
