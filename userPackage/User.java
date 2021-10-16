package userPackage;

import java.util.Scanner;

import mathPackage.Math;
import textPackage.Text; 

public class User {

	public static void main(String[] args) {
		Math math = new Math();
		Text text = new Text();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String userName = input.nextLine();
		
		System.out.print("Radius (r): ");
		double radius = input.nextDouble();
		
		System.out.println("Circle Area: "+math.circleArea(radius));
		System.out.println("Circle Circumference: "+math.circleCircumference(radius));
		System.out.println("Circle Diameter: "+math.circleDiameter(radius));
		
		System.out.println("Take care "+text.reverseText(userName));
		System.out.print("The program has been terminated.");
	}

}
