package week1.day2;

import java.util.Arrays;

public class Anagram {
	/*
	 * Pseudo Code
	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1="pens";
		String text2="sepn";
		if(text1.length()==text2.length()) {
			char[] textChar1=text1.toCharArray();
			char[] textChar2=text2.toCharArray();
			Arrays.sort(textChar1);
			Arrays.sort(textChar2);
			for(int i=0;i<textChar1.length;i++) {
				if(textChar1[i]!=textChar2[i])
					System.out.println("Given texts are not Anagram");
					break;
			}
			System.out.println("Given texts form Anagram");
		}
		else
			System.out.println("Texts entered to compare is not of same length. Hence cannot be compared");
			
	}

}
