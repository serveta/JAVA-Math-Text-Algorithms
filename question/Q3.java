package question;

public class Q3 extends qNa.Question {
	private String question = "\n 0-Previous Question"
			+ " \n 1-Area calculation"
			+ " \n 2-Perimeter calculation "
			+ " \n 3-Calculator"
			+ " \n 4-Other"
			+ " \n Q3: Enter your choice: ";
	
	public Q3() {
		// TODO Auto-generated constructor stub
	}

	public void getQuestion() {
		System.out.print(this.question);
	}
}
