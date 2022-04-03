package answer;
import question.*;

public class A2 extends qNa.Answer {
	
	//int answer;
	
	public void nextQuestion(String uName, int answer) {
		if(answer==1) {
			Q3 q3 = new Q3();
			q3.getQuestion();
		}
		if(answer==2) {
			Q4 q4 = new Q4();
			q4.getQuestion();
		}
	}

	@Override
	public void getAnswer() {
		// TODO Auto-generated method stub
		
	}
}
