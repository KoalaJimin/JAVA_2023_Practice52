
public class Shape implements Movable {
	private int x;
	private int y;
	
	public void move(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	public double calcArea() {
		return -1;
	}
	
	public String toString() {
		String result  = "";
		result += "중심좌표: (" + x + ", " + y + ")";
		
		return result;
	}
	
	public Shape() {
		this(0,0);
	}
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
