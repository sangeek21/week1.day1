package week1.day1;

public class PrimeNumber {
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13 output: 13 is a Prime Number
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter 3) To create an 'if' condition: type 'if', followed by ctrl + space
	 * +down arrow + enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare an int Input and assign a value 13
		// Declare a boolean variable flag as false
		// Iterate from 2 to half of the input
		// Divide the input with each for loop variable and check the remainder
		// Set the flag as true when there is no remainder
		// break the iterator
		// Check the flag (Provide a condition)
		// Print 'Prime' when the condition matches
		// Print 'Not a Prime' when the condition doesn't match
	int input=1;
	int half=input/2;
	int remainder=0;
	boolean flag=false;
	for(int i=2;i<=half;i++) {
		remainder=input%i;
		//System.out.println(remainder);
		if(remainder==0) {
			flag=true;
	//System.out.println(flag);
		}
	}
	//System.out.println(flag);
	if(flag==true)
		System.out.println(input+" is not a prime number.");
	else
		System.out.println(input+" is a prime number.");
		}

}
