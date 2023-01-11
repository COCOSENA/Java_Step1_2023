package chapter07;

public class Encapsulation {
	
	//매개변수
	private int Side;
	private int Height;


	public Encapsulation() {
		Side=0;
		Height=0;
		
	}
	//오버로딩? 
	public int Cal_Area(int S, int H) {
		Side=S;
		Height=H;
		
		return(S*H);
		
	
		
	}
	public int getSide() {
		return Side;
	}
	public void setSide(int side) {
		Side = side;
	}
	public int getHeight() {
		return Height;
	}
	public void setHeight(int height) {
		Height = height;
	}
	
}

