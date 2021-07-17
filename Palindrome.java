package week1.day2;

public class Palindrome {
	// Build a logic to find the given string is palindrome or not
	/*
	 * Pseudo Code
	 * a) Declare A String value as"madam"
	 * b) Declare another String rev value as "" 
	 * c) Iterate over the String in reverse order 
	 * d) Add the char into rev 
	 * e) Compare the original String with the reversed String, if it is same then print palinDrome
	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String
	 */
	public static void main(String args[]) {
		String a="madam";
		String rev="";
		int j=0;
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
			//System.out.println(rev);
		}
		if(a==rev)
			System.out.println("Given text is palindrome: "+a);
		else
			System.out.println("Given text is not a palindrome: "+a);
	}
}
