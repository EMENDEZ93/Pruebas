package org.gradle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {

	Palindrome palindrome;
	
	@Before
	public void setUp() {
		palindrome = new Palindrome();
	}
	
	@Test
	public void akkaIsPalindrome() {
		
		//arrange
		String word = "akka";
		
		//act
		String result = palindrome.isIt(word);

		//assert
		assertEquals("Es palindromo !!!", result);
		
	}

	@Test
	public void unac_ancIsPalindrome() {
		
		//arrange
		String word = "unac anc";
		
		//act
		String result = palindrome.isIt(word);

		//assert
		assertEquals("Es palindromo !!!", result);
		
	}

	
	@Test
	public void reconocerIsPalindrome() {
		
		//arrange
		String word = "reconocer";
		
		//act
		String result = palindrome.isIt(word);

		//assert
		assertEquals("Es palindromo !!!", result);
		
	}	

	
	@Test
	public void nullIsPalindrome() {
		
		//arrange
		String word = null;
		
		//act
		String result = palindrome.isIt(word);

		//assert
		assertEquals("No es palindromo !!!", result);
		
	}	
	
}
