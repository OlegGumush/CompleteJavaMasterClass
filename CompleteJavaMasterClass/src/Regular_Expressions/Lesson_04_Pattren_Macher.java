package Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson_04_Pattren_Macher {

	public static void main(String[] args) {
		
		StringBuilder htmlTest = new StringBuilder("<h1>My Heading</h1>");
		htmlTest.append("<h2>Sub-heading</h2>");
		htmlTest.append("<p>this is a paragraph about something</p>");
		htmlTest.append("<p>this is a paragraph about something else</p>");
		htmlTest.append("<h2>Summary</h2>");
		htmlTest.append("<p>here is a summary</p>");
		
		//this not work , matches return false because this is not whole text
		System.out.println(htmlTest);
		String h2Pattern = "<h2>";
		Pattern pattern = Pattern.compile(h2Pattern , Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
		Matcher macher = pattern.matcher(htmlTest);
		System.out.println(macher.matches());
		
		
		//this work
		System.out.println(htmlTest);
		String h2Pattern1 = ".*<h2>.*";
		pattern = Pattern.compile(h2Pattern1 , Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
		macher = pattern.matcher(htmlTest);
		System.out.println(macher.matches());
		
		
	}
}
