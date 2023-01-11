package chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		//학생 2명 생성
		StdInfo studentJames=new StdInfo("James", 12000);
		StdInfo studentTom=new StdInfo("Tom", 10000);
		// 버스타기
		Bus bus100=new Bus(100);
		studentJames.takeBus(bus100);
		
		//정보확인
		studentJames.showInfo(); //지출
		bus100.showInfo(); //수입증가
		
		Bus bus987=new Bus(987);
		studentTom.takeBus(bus987);
		studentTom.showInfo();
		System.out.println("============================");
		
		//지하철타기
		Subway subwayGreen=new Subway("2호선");
		studentJames.takeSubway(subwayGreen);
		studentJames.showInfo();
		System.out.println();
		
		Subway subwayblue=new Subway("1호선");
		studentTom.takeSubway(subwayblue);
		studentTom.showInfo();
		System.out.println();
		
		

	}//main

}//class
