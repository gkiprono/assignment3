package main.kiprono.models;

public abstract class Shape implements Comparable<Shape>{
	private int length;
	private int width;
	private int radius;
	private double area;
	
	
	
	public Shape() {
		super();
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public abstract void findArea();
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Shape [area=" + area + "]";
	}
	
	
}
