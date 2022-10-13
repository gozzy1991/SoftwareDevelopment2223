package Lab02b;

//Student Name 	: 	Brendan Phelan
//Student Id Number: C00276685
//Date 			: 	 12-10-2022

import java.util.Scanner;

import Lab02b.Rectangle;

public class Lab02bq3 {

	public static void main(String[] args) {
		
		double length;
		double width;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter length:");
		length = input.nextDouble();
		
		System.out.println("Enter width:");
		width = input.nextDouble();
		
		Rectangle recOne = new Rectangle(length, width);
		
		System.out.print(recOne + "\n");
		
		System.out.print("The perimiter of this rectangle is " + recOne.getPerimeter() + "\n");
		
		System.out.print("The area of this rectangle is " + recOne.getArea() + "\n");
		
		Rectangle.printRectangle(length, width);    // Only works with integer numbers!!
	}

}