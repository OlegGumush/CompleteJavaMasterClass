package Regular_Expressions;

public class Lesson_01 {

	public static void main(String[] args) {
		
		int mat[][] = new int[10][10];
		for (int i = 1; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(String.format("%3d", (int)(Math.random()*100))); // prints 93
			}
			System.out.println();
		}
		
		
		String s = "acbnhdfbsdf123o4 Oleg";
		System.out.println(s.replaceAll("Oleg", "Stam"));
		
		//replace all characters to stam '.' pattern  , we cant replace . to another character
		System.out.println(s.replaceAll(".", "Stam")); 
		
		//replace first character to stam
		System.out.println(s.replaceAll("^.", "Stam")); 

		//replace to stam only if acb in the beginning
		System.out.println(s.replaceAll("^acb", "Stam")); 

		//nothing
		System.out.println(s.replaceAll("^accb", "Stam")); 
		
		//false need to match whole string
		System.out.println(s.matches("^acb")); 
		//false
		System.out.println(s.matches("^accb")); 
		//true
		System.out.println(s.matches("^acbnhdfbsdf1234 Oleg")); 

		
		String s1 = "acbnhdfbsdf1234 Oleg";
		//replace if leg in the end of string
		System.out.println(s1.replaceAll("leg$" , "THE END")); 

		//replace specific characters
		System.out.println(s1.replaceAll("[aei]" , "X")); 
		System.out.println(s1.replaceAll("[h]" , " replace here ")); 

		//replace h or k if next character after h/k is d or o
		System.out.println(s1.replaceAll("[3h][do]" , " replace here ")); 
		System.out.println(s1.replaceAll("[h][k]" , " replace here ")); 

		
		
		
		
		
		
		
		
		
		
		
		
	}
}
 