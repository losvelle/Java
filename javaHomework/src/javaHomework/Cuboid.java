package javaHomework;

public class Cuboid extends Rectangle{
	double height;
	
	

	
//	constructor has 3 parameters 2 inherited from parent and one of its own
	public Cuboid(double width, double length, double height) {
		super(width, length);
		
		this.height = height;
		
		if(this.height <= 0) {
			this.height = 0;
		}	
	}
//	Method creation
	public double getHeight() {
		return (this.height);
	}
	
	public double getVolume() {
	double v = getArea();
	return v * this.height;
	}
	
	


public static void main(String[] args) {
//	Cuboid cuboid1 = new Cuboid(2, 3, 4);
//	cuboid1.getLength();
//	cuboid1.getWidth();
//	cuboid1.getArea();
//
//	double t = cuboid1.getVolume();
//	System.out.println(t);
	
	Cuboid cuboid = new Cuboid(9,10,5);
	System.out.println("cuboid.width= " + cuboid.getWidth());
	System.out.println("cuboid.length= " + cuboid.getLength());
	System.out.println("cuboid.area= " + cuboid.getArea());
	System.out.println("cuboid.height= " + cuboid.getHeight());
	System.out.println("cuboid.volume= " + cuboid.getVolume());
	
}}