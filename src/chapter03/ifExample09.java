package chapter03;

import javax.swing.JOptionPane;

public class ifExample09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("값2"));
		//num1 이 크면 num1이 큽니다
		//num2가 크면 num2가 큽니다
		//그 밖에는 두 수는 같습니다.
		
	if (num1 > num2) {
		System.out.println("num1이 큽니다");
	}
	else if(num1 < num2) {
		System.out.println("num2가 큽니다.");
	}
	else {
		System.out.println("같습니다.");
	}
	}

}
