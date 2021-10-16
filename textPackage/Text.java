package textPackage;

public class Text {
	
	public static String reverseText(String text) {
		String reverseText="";
		
		for(int i=text.length()-1;i>=0;i--) {
			reverseText += text.charAt(i);
		}
		
		return reverseText;
	}
	
}
