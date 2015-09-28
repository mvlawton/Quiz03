package MainPackage;

public class Triangle extends GeometricObject {
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle() {
		
	}
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSide1() {
		return this.side1;
	}
	
	public double getSide2() {
		return this.side2;
	}
	
	public double getSide3() {
		return this.side3;
	}
	
	/**
	 *  getArea returns the area of a given equilateral triangle
	 */
	public double getArea() {
		return ((Math.sqrt(3))/4)*this.getSide1();
	}
	
	/**
	 *  getPerimeter returns the perimeter of a given triangle
	 */
	public double getPerimeter() {
		return this.getSide1() + this.getSide2() + this.getSide3();
	}
	
	public String toString() {
		return "A triangle with side lengths: " + side1 + ", " + side2 + ", and " + side3; 
	}

}
