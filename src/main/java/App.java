public class App {
	
	public static void main(String[] args) {
		
		if (args.length != 2) {
			printUsage();
			return;
		}
		
		final String command = args[0];
		final String path = args[1];
		
		if (command.equals("save")) {
			SerializeService.serialize(path);
		} else if (command.equals("load")) {
			DeserializeService.desirialize(path);
		} else {
			printUsage();
		}
	}
	
	protected static void printUsage() {
		System.out.println("[save|load] [path]");
	}

}
