package com.capgemini.palindrom;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Palindrome palindrom = new Palindrome();
		while(scanner.hasNextLine()){
			
			String expression = scanner.nextLine();
			System.out.println("input accepted: " + expression.matches("\\p{L}+"));
			System.out.println("palindrome: " + palindrom.isPalindrom(expression) + "\n");
		}
	}

}
