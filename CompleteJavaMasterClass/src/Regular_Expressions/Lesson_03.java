package Regular_Expressions;

public class Lesson_03 {

	public static void main(String[] args) {
		String s = "acbnnnnnnnnnn hedfbsdf1j23o4 Oleg";
		
		//same result
		System.out.println(s.replaceAll("^acbnnnnnnnnnn", "Oleg"));
		System.out.println(s.replaceAll("^acbn{10}", "Oleg"));
		System.out.println(s.replaceAll("^acbn+", "Oleg"));
		System.out.println(s.replaceAll("^acbn*", "Oleg"));

		
		String s1 = "OLEG ananan OLEG";
		System.out.println(s1.replaceAll("(an){3}", "Oleg"));


		String s2 = "Ole";
		//+ must be at least one character 'g', * 0 or more characters 'g'
		System.out.println(s2.replaceAll("^Oleg+", "OLEG"));
		System.out.println(s2.replaceAll("^Oleg*", "OLEG"));

		
		//2 - 5 'l'
		String s3 = "Oleg Ollle";
		//nothing
		System.out.println(s3.replaceAll("^Ol{2,5}", "OLEG"));
		//replace 3 lll
		System.out.println(s3.replaceAll("Ol{2,3}", "OLEG"));

		String s4 = "abcdeffffegk";
		System.out.println(s4.replaceAll("f+e", "X"));
		System.out.println(s4.replaceAll("f*e", "X"));

		//replacing all occuarens of O  followed by any number of 'i' and at least one j in the end
		String s5 = "abcdOiiiiiijeffffegk";
		System.out.println(s5.replaceAll("O*i+j", "X"));
		System.out.println(s5.replaceAll("O+i*j", "X"));

		
	}
}
