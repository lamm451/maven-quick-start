package clinic.programming.training;

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Application {
    
    public Application() {
        System.out.println ("----> Inside Application");
    }
	
	public void greet() {
		List<String> greetings = new ArrayList<>();
		greetings.add("Buenos Dias");
		greetings.add("Bonjour a tout le monde");
		greetings.add("Priviet");
		
		for (String greeting : greetings) {
			System.out.println("+++Greeting: " + greeting);
		}
	}
	
	public int countWords(String words) {
		String[] separateWords = StringUtils.split(words, ' ');
		return (separateWords == null) ? 0 : separateWords.length;
	}

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("----> Starting Application");
		Application app = new Application();
		app.greet();
		int wordCount = app.countWords("I have four words");
		System.out.println("Word count: " + wordCount);
		System.out.println ("----> Ending Application");
    }
}