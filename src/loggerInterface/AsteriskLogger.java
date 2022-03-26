package loggerInterface;

public class AsteriskLogger implements Logger {
	@Override 
	public void log(String log) {
		//started with *** and appended on
		StringBuilder messageLine = new StringBuilder("***");
		messageLine.append(log + messageLine);
	
		System.out.println(messageLine);
	}
	@Override 
	public void error(String error) {
		int boxWidth = 0;
		int i = 0;
		StringBuilder messageLine = new StringBuilder("***");
		StringBuilder asteriskBox = new StringBuilder("");
		
		messageLine.append("Error: " + error + messageLine);
		
		//Determine how long to make the top & bottom line asterisks to match the width of the user's string
		boxWidth = messageLine.length();
		while (i < boxWidth) {
			asteriskBox.append("*");
			i++;
		}
		System.out.println(asteriskBox + "\n" + messageLine + "\n" + asteriskBox);
	}
}