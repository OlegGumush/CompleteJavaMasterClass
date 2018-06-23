package Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson_05 {

	public static void main(String[] args) {
		
		//find multiply occuarense
		
		StringBuilder htmlTest = new StringBuilder("<h1>My Heading</h1>");
		htmlTest.append("<h2>Sub-heading</h2>");
		htmlTest.append("<p>this is a paragraph about something</p>");
		htmlTest.append("<p>this is a paragraph about something else</p>");
		htmlTest.append("<h2>Summary</h2>");
		htmlTest.append("<p>here is a summary</p>");
		
		int count = 0;
		
		//this work
		System.out.println(htmlTest);
		String h2Pattern1 = ".*<h2>.*";
		Pattern pattern = Pattern.compile(h2Pattern1 , Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
		Matcher matcher = pattern.matcher(htmlTest);
		
		//true or false
		System.out.println(matcher.matches());
		
		//need to reset matcher , before use again
		matcher.reset();
		
		while(matcher.find()){
			count++;
			System.out.println("Occurrence " + count + " ; "+ matcher.start() + " to " + matcher.end() );
		}
		System.out.println();
		
		
		System.out.println(htmlTest);
		String h2Pattern = "<h2>";
		Pattern pattern1 = Pattern.compile(h2Pattern);
		Matcher matcher1 = pattern1.matcher(htmlTest);
		
		while(matcher1.find()){
			count++;
			System.out.println("Occurrence " + count + " ; "+ matcher1.start() + " to " + matcher1.end() );
		}
		System.out.println();
		
		
		
		
		//groups 
		System.out.println(htmlTest);
		
		//.* means one or more , because . is one , * zero or more
		//not work good , gave me from <h2> to the end of the file
		//String h2Pattern3 = "(<h2>.*</h2>)";//groups
		String h2Pattern3 = "(<h2>.*?</h2>)";//lazy work If found we will wait
		Pattern groupPattern = Pattern.compile(h2Pattern3);
		
		Matcher groupMatcher = groupPattern.matcher(htmlTest);
		
		System.out.println(groupMatcher.matches());
		
		groupMatcher.reset();
		
		while(groupMatcher.find()){
			System.out.println("Occurrence " + groupMatcher.group(1) );
		}
		System.out.println();
		
		
		//Group 2 gives me the content and not the tags themselves
		String h2TextGroups = "(<h2>)(.+?)(</h2>)";
		Pattern h2TextGroupsPattern = Pattern.compile(h2TextGroups);
		Matcher h2TextGroupsMatcher = h2TextGroupsPattern.matcher(htmlTest);

		while(h2TextGroupsMatcher.find()){
			System.out.println("Occurrence " + h2TextGroupsMatcher.group(2));
		}
		
		
		
		
		
	}
}
