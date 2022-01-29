package main.kiprono.models;

public class Rectangle extends Shape {
	
	
	// set length and width and calculate area
	public Rectangle(int len, int wid) {
		super.setLength(len);
		super.setWidth(wid);
		this.findArea();
	}

	@Override
	public void findArea() {
		super.setArea(super.getLength() * super.getWidth());
		 
	}

	@Override
	public int getLength() {
		 
		return super.getLength();
	}

	@Override
	public double getArea() {
		 
		return super.getArea();
	}

	@Override
	public void setArea(double area) {
		 
		super.setArea(area);
	}

	@Override
	public void setLength(int length) {
		 
		super.setLength(length);
	}

	@Override
	public int getWidth() {
		 
		return super.getWidth();
	}

	@Override
	public void setWidth(int width) {
		 
		super.setWidth(width);
	}

	@Override
	public int compareTo(Shape o) {
		 
		if(super.getArea() == o.getArea()) {
			return 0;
		}
		return super.getArea() < o.getArea() ? -2:3;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectange [area=" + this.getArea() + "] with [Length= " + this.getLength() + " width=" + this.getWidth() + "]";
	}
	
	

}
