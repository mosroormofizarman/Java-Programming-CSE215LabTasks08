package cse215_lab_tasks_08;

import java.util.Scanner;

class Shape{
	private String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = "name";
	}
	
	public String toString() {
		return "Shape: " + this.name;
	}
}

class Rectangle extends Shape{
	private double side1;
	private double side2;
	
	public Rectangle(String name, double side1, double side2) {
		super(name);
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public double getSide1() {
		return this.side1;
	}
	
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	
	public double getSide2() {
		return this.side2;
	}
	
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	public double area() {
		return this.side1*this.side2;
	}
	
	public double perimeter() {
		return 2*(this.side1+this.side2);
	}
	
	public String toString() {
		return super.toString() + "\nArea: " + area() + "\nPerimeter: " + perimeter();
	}
}

class Square extends Rectangle{ 
	public Square(String name, double side) {
		super(name, side, side);
	}
	public String toString() {
		return super.toString();
	}
}

public class AreaPerimeter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Square sq = new Square(input.next(), input.nextDouble());
		System.out.println(sq.toString());
		
		input.close();
	}
}
