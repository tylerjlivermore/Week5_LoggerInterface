package loggerInterface;

public class SpacedLogger implements Logger {
	@Override 
	public void log(String log) {
		StringBuilder messageLine = new StringBuilder(log);
		int length = messageLine.length();
		int i = (length - 1);	//-1 prevents creation of trailing space
		
		//iterate down to 0 from the end of the string b/c
		//iterating up causes an infinite loop since the string length increases with each space inserted
		while (i > 0) {
			messageLine.insert(i, ' ');
			i--;
		}
		System.out.println(messageLine);
	}
	@Override 
	public void error(String error) {
		StringBuilder messageLine = new StringBuilder(error);
		StringBuilder header = new StringBuilder("ERROR: ");
		
		int length = messageLine.length();
		int i = (length - 1);
		
		while (i > 0) {
			messageLine.insert(i, ' ');
			i--;
		}
		System.out.println(header.toString() + messageLine);
	}
}