package answer;
import question.*;

public class A3 extends qNa.Answer {

	public void nextQuestion(String uName, int answer) {
		if(answer==0) {
			Q3 q3 = new Q3();
			q3.getQuestion();
		}
		if(answer==1) {
			Q3q1AreaCalculation q3qAreaCalculation = new Q3q1AreaCalculation();
			q3qAreaCalculation.getQuestion();
		}
		if(answer==2) {
			System.out.println("ch-2");
		}
	}

	@Override
	public void getAnswer() {
		// TODO Auto-generated method stub
		
	}
}
