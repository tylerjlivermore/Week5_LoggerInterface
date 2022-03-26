package loggerInterface;

public class App {

	public static void main(String[] args) {
		Logger asteriskLog = new AsteriskLogger();
		Logger spacedLog = new SpacedLogger();
		
		asteriskLog.log("Love");
		System.out.println();	//line break for appearance of output
		asteriskLog.error("Nature");
		System.out.println();
		spacedLog.log("Flower");
		System.out.println();
		spacedLog.error("Peace");
	}
}