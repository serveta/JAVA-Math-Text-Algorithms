package question;

public class Q2 extends qNa.Question {
	
	private String userName;
	private String welcome = "Hi! Welcome, ";
	private String question = ""
			+ "\n 0-Previous Question "
			+ "\n 1-Math "
			+ "\n 2-Text "
			+ "\nQ2: Enter your choice: ";
	
	public Q2() {
		
	}
	
	public Q2(String user) {
		this.userName = user;
	}
	
	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		 this.userName = userName;
	}
	
	public String getWelcome() {
		return welcome;
	}
	
	public void getQuestion() {
		 System.out.print(getWelcome()+getUserName()+question);
	}
	
}
