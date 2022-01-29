package main.kiprono.models;

public class Circle extends Shape{
	
	
	// set radius and calculate area
	public Circle(int rad) {
		super.setRadius(rad);
		this.findArea();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle [area=" + this.getArea() + "] with [radius= " + this.getRadius() + "]";
	}

	@Override
	public double getArea() {
		
		return super.getArea();
	}

	@Override
	public void setArea(double area) {
		// TODO Auto-generated method stub
		super.setArea(area);
	}

	@Override
	public int getRadius() {
		// TODO Auto-generated method stub
		return super.getRadius();
	}

	@Override
	public void setRadius(int radius) {
		// TODO Auto-generated method stub
		super.setRadius(radius);
	}

	@Override
	public int compareTo(Shape o) {
		// TODO Auto-generated method stub
		if(super.getArea() == o.getArea()) {
			return 0;
		}
		return super.getArea() < o.getArea() ? -2:3;
	}

	@Override
	public void findArea() {
		// TODO Auto-generated method stub
		double ar = 0;
		// TODO Auto-generated method stub
		ar = Math.PI * super.getRadius() * super.getRadius();
		super.setArea(ar);
	}

}
