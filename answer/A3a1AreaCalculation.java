package answer;

import java.util.Scanner;

import qNa.Answer;

public class A3a1AreaCalculation extends qNa.Answer {

	public void nextQuestion(String uName, int answer) {
		if(answer==1) {
			System.out.println("Circle Area");
			System.out.print("r: ");
			Scanner scan = new Scanner(System.in);
			double r = scan.nextDouble();
			System.out.println(" >> "+circleArea(r));
		}
		if(answer==2) {
			System.out.println("Triangle  Area");
		}
		if(answer==3) {
			System.out.println("Rectangle  Area");
		}
		if(answer==4) {
			System.out.println("Square  Area");
		}
	}
	
	@Override
	public void getAnswer() {
		// TODO Auto-generated method stub
		
	}

	public double circleArea(double r) {
		return Math.PI * r * r;
	}
}
