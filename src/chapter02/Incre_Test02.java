package chapter02;

public class Incre_Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x, y;
		x=10;
		y=10;
		int z;
		
		
		x++;  //10 -> 10 + 1
		++x;  //11 + 1
		
		System.out.println(x); //
		
		
		y--;  //10 -> 10-1
		--y;  //9-1 => 8
		
		System.out.println(y); //
		
		
	    z=x++;
	    System.out.println(z);
	    System.out.println(x);
		
		
	    z=++x; 
	    System.out.println(z); //14
	    System.out.println(x);//14
	    
	    z=++x + y++;
	    
	    System.out.println(z); //23
	    System.out.println(x); //15
	    System.out.println(y); //9
	    
	    
	    //relation의 연산
	    //!= 같지 않다
	    
	    
		
	}

}
