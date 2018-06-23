package Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson_07_Challenge_01 {

	
	public static void main(String[] args) {
		
		//Challenge 01 
		String c1 = "I want a bike.";
		System.out.println(c1.matches("I want a bike."));
		
		//Challenge 02
		System.out.println("I want a bike.".matches("I want a b[i|a][k|l][e|l]."));
		System.out.println("I want a ball.".matches("I want a b[i|a][l|b][l|e]."));
		
		System.out.println("I want a bike.".matches("I want a \\w++."));
		System.out.println("I want a ball.".matches("I want a \\w++."));
		
		System.out.println("I want a bike.".matches("I want a \\D+."));
		System.out.println("I want a ball.".matches("I want a \\D*."));
		
		System.out.println("I want a bike.".matches("I want a (bike|ball)."));
		System.out.println("I want a ball.".matches("I want a (bike|ball)."));
		
		
		//Challenge 03 - We've use pattern twice, now we'll only do it one by one
		Pattern p3 = Pattern.compile("I want a \\D*.");
		Matcher m3 = p3.matcher("I want a ball");
		System.out.println(m3.matches());
		m3.reset();
		m3 = p3.matcher("I want a bike");
		System.out.println(m3.matches());
		
		
		//Challenge 04
		String s4 = "Oleg_Katy_Regex";
		System.out.println(s4.replaceAll("_", "(Replace all Underscores)"));
		
	}
}
