package question;

import qNa.Question;

public class Q3q1AreaCalculation extends Question {
	private String question = "\n 0-Previous Question"
			+ " \n 1-Circle"
			+ " \n 2-Triangle "
			+ " \n 3-Rectangle"
			+ " \n 4-Square"
			+ " \n Q3q1: Enter your choice: ";
	
	public Q3q1AreaCalculation() {
		// TODO Auto-generated constructor stub
	}

	public void getQuestion() {
		System.out.print(this.question);
	}
}
