package run;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;


public class Program {

	static Option help = new Option("help", "print this message");
	static Option s1 = Option.builder("s1")
			.longOpt("Primary Domain Server")
			.build();
	static Option s2 = new Option("s2", true, "Second Domain Server");
	static Options options = new Options();
	
	public static void main(String[] args) {
		options.addOption(s1);
		options.addOption(s2);
		String testing = "S1 not set";
		CommandLineParser parser = new DefaultParser();
		try {
			CommandLine line = parser.parse(options,  args);
			if (line.hasOption("s1")) {
				testing = "S1 has been set";
			}
			System.out.print(testing);
			System.out.print("Banana");
			
		}
		catch (ParseException exp) {
			System.err.println("Parsing failed. Reason: " + exp.getMessage());
		}
		
	}
}
