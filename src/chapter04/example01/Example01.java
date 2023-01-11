package chapter04.example01;

public class Example01 {

	public static void main(String[] args) {
		
		// for문을 이용하여 다음 배열의 점수를 줄 단위로 평균을 구하시오
		int [][] array = {{95,86}, {83,92,96}, {78,83,93,87,88}};
		
		int sum = 0;
		double avg =0;
		int total = 0;
		int count = 0;
		int alltotal =0;
		/*
		//방법1
		for (int i = 0 ;i < array.length ; i++) {
			for (int j = 0 ; j < array[i].length ; j++) {
				sum += array[i][j]; // 꼭 +=를 해주도록 하자 !!!!!!!!! " =+ 은 단순 양수 표시
				count ++;
			}
			avg = sum /array[i].length; //각 행의 길이만큼 나눠줌
			System.out.println(avg);
			alltotal += sum; //전체총합에 누적시킴 
			//쓰레기 값 초기화
			sum = 0;
			avg = 0;
		}
		
		
			//전체평균
		double allavg = alltotal/(double)count;
		System.out.println(allavg); // String.format("%.2f", value) 반올림은 2번쨰 자리까지 올린다.
		*/
		/*//방법2
		
		int sum[] = new int[3]; //변수방을 지정  sum[]에 자리 3개의 방을 만들어준다
		for (int i = 0; i < array.length; i++) {
			for (int j=0 ; j < array[i].length; i++) {
				sum[i] += array [i][j];
				count++;
			
			}
			System.out.println(sum[i]);
			avg = sum[i]/ (double)count;
			System.out.println(avg);
			//쓰레기 값
			 count =0;
			 avg =0;
		}
			*/	
		
		
		//방법 3
		
		/*
		for(int[] num : array) {  // array방에 있는 열을 한줄씩 int[] num에 넣어준다 + array의 열만큼 실행
			for (int score : num) { // 95, 85 // 다음열 // 다음열
				total += score;				
			}
			count++;
			System.out.println(count +"번째 학생의 합계:" + total);
			
			//쓰레기값
			total = 0; //초기화
			}
			*/
		}
	
	
	}


