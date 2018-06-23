package Regular_Expressions;

import java.util.ArrayList;

public class Lesson_02 {

	public static void main(String[] args) {
		String s = "acbnhedfbsdf1j23o4 Oleg";

		//both return Harry , check if Harry big or lower case
		System.out.println("Harry".replaceAll("[Hh]arry", "Harry"));
		System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

		//replace all letters except e and j.
		System.out.println(s.replaceAll("[^ej]", "X"));
		System.out.println(s.replaceAll("[^aleg]", "X"));
		
		//same result
		System.out.println(s.replaceAll("[abcde12345]", "x"));
		System.out.println(s.replaceAll("[a-eO-Z3-5]" ,  "X"));
		
		String s1 = "Oleg";
		//nothing
		System.out.println(s1.replaceAll("[o-z]", "x"));
		//(?i) ignore case sensitive
		System.out.println(s1.replaceAll("(?i)[o-z]", "x"));
		
		//replace all numbers same result
		System.out.println(s.replaceAll("[0-9]", "x"));
		System.out.println(s.replaceAll("\\d", "x"));

		//replace all none digits same result
		System.out.println(s.replaceAll("(?i)[a-z]", "x"));
		System.out.println(s.replaceAll("\\D", "x"));
		
		
		String s2 = "I have blanks and\t a tab , and also a new line\n";
		System.out.println(s2);
		//remove all spaces
		System.out.println(s2.replaceAll("\\s",""));
		System.out.println(s2.replaceAll("\t", "X"));
		
		//remove all none spices
		System.out.println(s2.replaceAll("\\S",""));

		//replace a-z A-Z 0-9 and '_'
		String s3 = "! ? _ a b c d 1 2 3 4 A F C V";
		System.out.println(s3.replaceAll("\\w", "X"));
		//replace all except -> (a-z A-Z 0-9 and '_')
		System.out.println(s3.replaceAll("\\W", "X"));

		//Every word that had a space before and after space gets X before and after
		System.out.println(s3.replaceAll("\\b", "X"));
		
	}
}



