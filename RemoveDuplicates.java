package week1.day2;

import java.util.Iterator;

public class RemoveDuplicates {
	/*
	 * Pseudo code a) Use the declared String text as input String text =
	 * "We learn java basics as part of java sessions in java week1"; b) Initialize
	 * an integer variable as count c) Split the String into array and iterate over
	 * it d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. f) if the count > 1 then
	 * replace the word as "" g) Displaying the String without duplicate words
	 */
	public static void main(String args[]) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] splitText = text.split(" ");
		for (int i = 0; i < splitText.length; i++) {
			for (int j = 0; j < splitText.length; j++) {
				// System.out.println("i loop: " + "Postion: " + i + splitText[i]);
				// System.out.println("j loop: " + "Postion: " + j + splitText[j]);
				if (splitText[i].equals(splitText[j]))
					count = count + 1;
			}
			if (count > 1)
				splitText[i] = "";
			count = 0;
		}
		for (int i = 0; i < splitText.length; i++)
			if (splitText[i] != "")
				System.out.println(splitText[i]);
	}

}
