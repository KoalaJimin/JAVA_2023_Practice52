
public class Rectangle extends Shape implements Drawable {
	private double length;
	private double width;
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public Rectangle() {
		super(0, 0);
	}
	
	public Rectangle(int x, int y) {
		super(x, y);
	}
	
	public Rectangle(int x, int y, double length, double width) {
		super(x, y);
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double calcArea() {
		return length * width;
	}
	
	public void draw() {
		System.out.println("사각형, " + toString());
	}
	
	public String toString() {
		return super.toString() + " 가로: " + String.format("%.2f", getWidth()) + ", 세로: " + String.format("%.2f", getLength()) + ", 면적: " + String.format("%.2f", calcArea());
	}
}
