package com.capgemini.palindrom;

public class Palindrome {

	public boolean isPalindrom(String text) {
		String cleanString = prepareCleanString(text);
		return validateInput(cleanString) ? 
				evaluateString(cleanString) : false;
	}

	private String prepareCleanString(String input) {
		return input.replaceAll("\\s+", "").toLowerCase();
	}
	
	private boolean validateInput(String input) {
		return input.matches("\\p{L}+");
	}

	private boolean evaluateString(String input) {
		if ((input.length() < 2)) {
			return true;
			
		} else if (input.charAt(0) == input.charAt(input.length() - 1)) {
			return evaluateString(trimBackAndFront(input));
			
		} else {
			return false;
			
		}
	}

	private String trimBackAndFront(String input) {
		return input.substring(1, input.length() - 1);
	}

	
//	// not my idea, but I like it
//	// thus wanted to include
//	private boolean evaluateStringMethodB(String input) {
//		return evaluateCharsArray(input.toCharArray(), 0, input.length()-1);
//	}
//
//	private boolean evaluateCharsArray(char[] charArray, int first, int last) {
//		if (first >= last) {
//			return true;
//		}else{
//			return charArray[first] != charArray[last] ? 
//					false : evaluateCharsArray(charArray, first + 1, last - 1);
//		}
//	}

}

