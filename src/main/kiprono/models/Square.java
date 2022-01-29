package main.kiprono.models;

public class Square extends Shape{
	
	
	// set length and calculate area
	public Square(int len) {
		super.setLength(len);
		this.findArea();
	}

	@Override
	public int compareTo(Shape o) {
		
		if(super.getArea() == o.getArea()) {
			return 0;
		}
		return super.getArea() < o.getArea() ? -2:3;
	}

	@Override
	public void findArea() {
		double ar = 0;
		
		ar = Math.pow(getLength(), 2);
		super.setArea(ar);
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
	public int getLength() {
		return super.getLength();
	}

	@Override
	public void setLength(int length) {
		super.setLength(length);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Square [area=" + this.getArea() + "] with [sides= " + this.getLength() + "]";
	}

}
