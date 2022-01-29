package main.kiprono.driver;

import java.util.*;

import main.kiprono.models.*;

public class Question16Driver {
	public static void main(String[] args) {
		
		Set<Circle> circleSet = new TreeSet<>();
		circleSet.add(new Circle(3));
		circleSet.add(new Circle(4));
		circleSet.add(new Circle(2));
		circleSet.add(new Circle(10));
		
		System.out.println(circleSet.stream().findFirst().get().toString());
		
		Set<Rectangle> rectangleSet = new TreeSet<>();
		rectangleSet.add(new Rectangle(10,15));
		rectangleSet.add(new Rectangle(10,11));
		rectangleSet.add(new Rectangle(10,1));
		rectangleSet.add(new Rectangle(10,152));
		
		System.out.println(rectangleSet.stream().findFirst().get().toString());
		
		Set<Square> squareSet = new TreeSet<>();
		squareSet.add(new Square(10));
		squareSet.add(new Square(12));
		squareSet.add(new Square(13));
		squareSet.add(new Square(120));
		
		System.out.println(squareSet.stream().findFirst().get().toString());
		
	}
}
