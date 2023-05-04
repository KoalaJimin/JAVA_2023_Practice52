
public class Triangle extends Shape {
	private double base;
	private double height;
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	Triangle() {
		super(0, 0);
	}
	
	Triangle(int x, int y) {
		super(x, y);
	}
	
	Triangle(int x, int y, double base, double height) {
		super(x, y);
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double calcArea() {
		return getBase() * getHeight() / 2;
	}
	
	public void draw() {
		System.out.println("삼각형, " + toString());
	}
	
	
	public String toString() {
		return super.toString() + " 밑면: " + String.format("%.2f", getBase()) + ", 높이: " + String.format("%.2f", getHeight()) + ", 면적: " + String.format("%.2f", calcArea());
	}
}
