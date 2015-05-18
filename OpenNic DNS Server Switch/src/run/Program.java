package run;
import org.apache.commons.cli.Option;


public class Program {

	Option help = new Option("help", "print this message");
	Option s1 = Option.builder("s1")
			.required(true)
			.longOpt("Primary Domain Server")
			.build();
	Option s2 = new Option("s2", true, "Second Domain Server");
	
	public static void main(String[] args) {
		
	}
}
