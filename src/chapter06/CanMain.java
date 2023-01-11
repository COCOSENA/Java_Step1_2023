package chapter06;
import java.util.Scanner;
public class CanMain {

	public static void main(String[] args) {
		
		String select=""; //★빈 문자열로 초기화 
		int money=0;
		
		Vending ven=new Vending(); //★벤딩 클래스를 참고할거야~ 가져올거야? // 벤딩 참조값만 가지고 있음 자료형이름이 벤딩 순서를 가지고오려고 
		ven.init();//음료준비 , 초기화 함수 
		System.out.println("돈을 투입하세요 : ");
		Scanner scan=new Scanner(System.in);
		money=scan.nextInt(); //돈투입
		ven.showCans(money); //int m와 똑같은 형태라서 ★벤딩 클래스를 참고할거야~ 가져올거야?
		System.out.println("--------------------");  
		System.out.print("음료를 선택하세요 : ");
		select=scan.next(); // 음료종류 선택
		ven.outCan(select); //	

	}

}
