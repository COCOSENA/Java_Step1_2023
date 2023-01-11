package chapter04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TwoDimention02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b;
		int JavaS[][] = new int [2][3];
		Scanner scan = new Scanner(System.in);
		
	
		System.out.println("숫자를 입력하세여");
		for(int i = 0 ; i <JavaS.length ; i++) {
			for(int j = 0; j <JavaS[i].length ; j++) {
				b = Integer.parseInt(JOptionPane.showInputDialog("점 수")); //점수를 받고
				JavaS[i][j] = b; //순차적으로 입력
				System.out.println("JavaS[" + i + "][" + j + "] :" + JavaS[i][j]);
		}
			System.out.println();
	}
		
	}

}
