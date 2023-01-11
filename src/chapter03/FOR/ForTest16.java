package chapter03.FOR;

public class ForTest16 {

	public static void main(String[] args) {
		// 

		for (int i=2; i<=9; i++) {
			System.out.print("[" + i + "단] "+ "\t");
		}
		System.out.println();
		for (int j=1; j<=9; j++) {
			for (int i=2; i<=9; i++) {
			System.out.print(i + "*" +j + "\t");
			}
		System.out.println();
		}
	}

}
