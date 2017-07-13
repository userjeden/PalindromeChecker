package com.capgemini.palindrom;

import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeTest {

	
	@Test
	public void shouldReturnIsPalindrom() {
		
		//GIVEN
		Palindrome palindrome = new Palindrome();
		String[] input = {"a", "ala", "assa", "kajak", "  kobyla ma maly bok", 
				" aölöa", "Ein Neger  mit Gazelle zagt im Regen  nie", "Äolüloä" };
		
		//WHEN
		boolean[] expected = new boolean[8];
		boolean[] result = new boolean[8];
		
		for(int i = 0; i < 8; i++){
			result[i] = palindrome.isPalindrom(input[i]);
			expected[i] = true;
		}
		
		//THEN
		assertArrayEquals(expected, result);
	}
	
	
	@Test
	public void shouldNOTReturnIsPalindrom() {
		
		//GIVEN
		Palindrome palindrome = new Palindrome();
		String[] input = {"", "\n", "\r", "a1a", "@a@", "aas", "kajaki", "assad"};
		
		//WHEN
		boolean[] expected = new boolean[8];
		boolean[] result = new boolean[8];
		
		for(int i = 0; i < 8; i++){
			result[i] = palindrome.isPalindrom(input[i]);
			expected[i] = false;
		}
		
		//THEN
		assertArrayEquals(expected, result);
	}

}
