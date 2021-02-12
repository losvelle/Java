package javaHomework;
// Declaring the instance variables
public class Rectangle {
	double width;
	double length;
	
//	Parameters 
	public Rectangle(double width, double length){
		this.width = width;
		this.length = length;
		
		if(this.width <= 0) {
			this.width = 0;
		}
		
		if(this.length <= 0) {
			this.length = 0;
		}
	}
//	Methods 
	public double getWidth() {
		return (this.width);
	}
	
	public double getLength() {
		return (this.length);
	}
	
	public double getArea() {
		return ((this.width) * (this.length));
	}

//	Start of my main function
	public static void main(String[] args) {
		
//		Rectangle rectangle1 = new Rectangle(7,9);
//		
//		double c = rectangle1.getArea();
//		rectangle1.getLength();
//		rectangle1.getWidth();
//		
//		System.out.println(c);
		
		Rectangle rectangle = new Rectangle(5,10);
		System.out.println("rectangle.width= " + rectangle.getWidth());
		System.out.println("rectangle.length= " + rectangle.getLength());
		System.out.println("rectangle.area= " + rectangle.getArea());
		

		
	}

}
