package com.weight.watchers;

public class ReverseString {

	public static void main(String[] args) {
		if (args.length <= 0) {
			System.out.println("Please enter a String ");
			System.exit(0);
		}

		String actualString = args[0];
		String afteRevString = reverseEverything(actualString);
		System.out.println("String after reversing is:" + afteRevString);

	}

	private static String reverseEverything(String s) {
		String revString = "";
		System.out.println("Actual string is:" + s);
		for (int i = s.length() - 1; i >= 0; i--) {
			revString = revString + s.charAt(i);
		}
		return revString;
	}

}