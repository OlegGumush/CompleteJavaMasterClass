package Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson_06 {

	public static void main(String[] args) {
		
		//operator or like [Hh]arry 
		System.out.println("Harry".replaceAll("[h|H]arry", "Larry"));
		
		//not operator [^abc] all except abc
		String tvTest = "tstvtkt";
		//String NotTvTest = "t[^v]"; -> return ts tk
		String NotTvTest = "t(?!v)";

		
		Pattern pattern = Pattern.compile(NotTvTest);
		Matcher matcher = pattern.matcher(tvTest);
		int count =0 ;
		
		while(matcher.find()){
			count++;
			System.out.println("Occurrence " + count + " ; "+ matcher.start() + " to " + matcher.end() );
		}
		 
		//String PositiveLookAhead = "t(?!v)";
		//String NegativeLookAhead = "t(?=v)";

		
		
		
		//validate phone number
		String phone = "^([0-9]{4}[\\-]{1}[0-9]{3}[\\-]{1}[0-9]{3})$";
		
		count++;
		System.out.println("0507-636-173".matches(phone));
		
		String phone1 = "^([0-9]{4}[\\-]{1}[0-9]{2}[\\-]{1}[0-9]{2}[\\-]{1}[0-9]{2})$";
		System.out.println("0507-63-61-73".matches(phone1));
		System.out.println("0507-636-173".matches(phone1));
		
	}
}
