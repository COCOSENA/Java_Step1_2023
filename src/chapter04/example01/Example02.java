package chapter04.example01;

public class Example02 {

	public static void main(String[] args) {
		//회원가입은 0번 부터 외원번호가 부여된다 현재 부여된 다음의 번호중 가장 큰 회원번호를 출력하시오
		
		int max =0; //비교대상임으로 가장 낮은 수를 지정해준다
		int array [] = {1,6,9,2,35,178,238,999,9898,4,5,1,}; 
		
		//최대값 알고리즘 //배열에 data들을 전부 비교하여 가장 큰 숫자를 걸러낸다
		for (int i=0; i < array.length ; i ++) {
			if (max < array[i]) {
				max = array[i]; //배열에 있는 숫자가 더 트면 해당 숫자를 받는다 //그것을 라인수만큼 반복한다
			}
			else 
				continue;
		}
		System.out.println(max);	
			
			
			
		}
			
		
		
		
		
		
		
	}


