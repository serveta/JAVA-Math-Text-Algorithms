
public abstract class Question {

	public int length = 0;
	protected int questionNo = 0;
	protected String question;
	protected int selectionRange = 0;
	protected String[] questions;
	protected int[] questionSelectedRange;
	protected int questionLengthControl = 0;
	
	public Question(int length) {
		this.length = length;
		questions = new String[length];
		questionSelectedRange = new int[length];
	}

	public abstract void newQuestion(String question, int selectionRange);
	
	protected void save() {
		questions[this.questionNo] = this.question;
		questionSelectedRange[this.questionNo] = this.selectionRange;
		this.questionNo++;
	}
	
	public abstract void getQuestion(int questionNo);
	
	public abstract void getSelectionRange(int questionNo);
	
}
